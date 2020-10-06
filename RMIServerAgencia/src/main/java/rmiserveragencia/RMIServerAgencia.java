/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiserveragencia;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import rmiagencia.RMIAgencia;
import rmibanco.beans.RMIBanco;
import rmicc.RMICC;
import rmicc.beans.Agencia;
import rmicc.beans.Conta;
import rmicc.file.Arquivo;

/**
 *
 * @author flavi
 */
public class RMIServerAgencia extends UnicastRemoteObject implements RMICC  , RMIAgencia{

    private Agencia agencia;
    private Arquivo arquivo;
    private List<Conta> contas;
    private RMIBanco rmiBanco;
    
    //Construtor

    public RMIServerAgencia(Agencia agencia, Arquivo arquivo) throws RemoteException {
        this.agencia = agencia;
        this.arquivo = arquivo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public RMIBanco getRmiBanco() {
        return rmiBanco;
    }

    public void setRmiBanco(RMIBanco rmiBanco) {
        this.rmiBanco = rmiBanco;
    }
        
    @Override
    public void deposito(Integer numeroConta, Float valor) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Float sac(Integer numeroConta, Float valor) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Float getSaldo(Integer numeroConta) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Float getLimite(Integer numeroConta) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setLimite(Integer numeroConta, Float Valor) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addConta(Conta conta) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Conta getConta(Integer numero) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Conta> getAllContas() throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteConta(Integer numero) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateConta(Conta conta) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
