/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiserverbanco;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import rmibanco.beans.RMIBanco;
import rmibanco.beans.ServerAgencia;
import rmicc.beans.Agencia;
import rmicc.file.Arquivo;

/**
 *
 * @author flavi
 */
public class RMIServerBanco extends UnicastRemoteObject implements RMIBanco {

    private String nome;
    private Arquivo arquivo;
    private List<ServerAgencia> serverAgencias;

    public RMIServerBanco(String nome, String file) throws RemoteException {
        this.nome = nome;
        arquivo = new Arquivo(file);
        serverAgencias = arquivo.read();
        if (serverAgencias == null) {
            serverAgencias = new ArrayList<>();
        } else if (!serverAgencias.isEmpty()) {
            for (int i = 0; i < serverAgencias.size(); i++) {
                serverAgencias.get(i).write();
            }
        }
    }

    @Override
    public void addAgencia(ServerAgencia serverAgencia) throws RemoteException {
        serverAgencias.add(serverAgencia);
    }

    @Override
    public Agencia getAgencia(Agencia agencia) throws RemoteException {
        for (int i = 0; i < serverAgencias.size(); i++) {
            if (serverAgencias.get(i).getAgencia().getNome().equals(agencia.getNome())) {
                return serverAgencias.get(i).getAgencia();
            }
        }

        return null;
    }

    @Override
    public List<Agencia> getAllAgencias() throws RemoteException {
        List<Agencia> agencias = new ArrayList<Agencia>();

        for (int i = 0; i < serverAgencias.size(); i++) {
            agencias.add(serverAgencias.get(i).getAgencia());
        }

        return agencias;
    }

    @Override
    public void deleteAgencia(Agencia agencia) throws RemoteException {
        for (int i = 0; i < serverAgencias.size(); i++) {
            if (serverAgencias.get(i).getAgencia().getNome().equals(agencia.getNome())) {
                serverAgencias.remove(i);
            }
        }
    }

    @Override
    public void updateagencia(Agencia agencia) throws RemoteException {
        for (int i = 0; i < serverAgencias.size(); i++) {
            if (serverAgencias.get(i).getAgencia().getNome().equals(agencia.getNome())) {
                serverAgencias.get(i).setAgencia(agencia);
            }
        }
    }

    @Override
    public void close() throws RemoteException {
        arquivo.write((ArrayList) serverAgencias);
    }

    @Override
    public ServerAgencia getServerAgencia(String nomeAgencia) throws RemoteException {
        for (int i = 0; i < serverAgencias.size(); i++) {
            if (serverAgencias.get(i).getAgencia().getNome().equals(nomeAgencia)) {
                return serverAgencias.get(i);
            }
        }

        return null;
    }

}