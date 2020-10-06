/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmicc;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author flavi
 */
public interface RMICC extends Remote {

    public void deposito(Integer numeroConta, Float valor) throws RemoteException;

    public Float sac(Integer numeroConta, Float valor) throws RemoteException;

    public Float getSaldo(Integer numeroConta) throws RemoteException;

    public Float getLimite(Integer numeroConta) throws RemoteException;

    public void setLimite(Integer numeroConta, Float Valor) throws RemoteException;
}
