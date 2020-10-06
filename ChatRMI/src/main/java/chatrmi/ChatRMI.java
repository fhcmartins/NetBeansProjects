/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Hashtable;

/**
 *
 * @author flavi
 */
public interface ChatRMI extends Remote{
    
    public String getServerName() throws RemoteException;
    public void addClient(Client client) throws RemoteException;
    public void sendMSG(Client sender, Client recipient, String text) throws RemoteException;
    public String getMSG(Client recipient) throws RemoteException;
    public Hashtable<String, Client> getClients() throws RemoteException;
    
}
