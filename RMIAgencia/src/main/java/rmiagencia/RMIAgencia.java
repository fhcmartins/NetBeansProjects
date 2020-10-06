/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiagencia;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import rmicc.beans.Conta;

/**
 *
 * @author flavi
 */
public interface RMIAgencia extends Remote{

    public void addConta(Conta conta) throws RemoteException;
    public Conta getConta(Integer numero) throws RemoteException;
    public List<Conta> getAllContas() throws RemoteException;
    public void deleteConta(Integer numero) throws RemoteException;
    public void updateConta(Conta conta) throws RemoteException;
    
}
