/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmibanco.beans;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import rmicc.beans.Agencia;

/**
 *
 * @author flavi
 */
public interface RMIBanco extends Remote {

    public void addAgencia(ServerAgencia serverAgencia) throws RemoteException;
    public Agencia getAgencia(Agencia agencia) throws RemoteException;
    public List<Agencia> getAllAgencias() throws RemoteException;
    public void deleteAgencia(Agencia agencia) throws RemoteException;
    public void updateagencia(Agencia agencia) throws RemoteException;
    public void close() throws RemoteException;
    public ServerAgencia getServerAgencia(String nomeAgencia) throws RemoteException;
}
