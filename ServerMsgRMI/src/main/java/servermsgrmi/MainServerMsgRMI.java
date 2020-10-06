/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servermsgrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author flavi
 */
public class MainServerMsgRMI {
    
    public static void main(String[] args) {
        Registry registry;
        
        try {
            registry = LocateRegistry.createRegistry(1099);
            registry.rebind("ServerMSG", new ServerMsgRMI());
            System.out.println("Server Started");
        } catch (RemoteException ex) {
            Logger.getLogger(MainServerMsgRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
