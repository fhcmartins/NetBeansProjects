/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatrmiserver;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author flavi
 */
public class MainChatRMIServer {
    
    public static void main(String[] args) {
        
        Registry registry;
        
        try {
            registry = LocateRegistry.createRegistry(1099);
            String name = "chatserver";
            registry.rebind(name, new ChatRMIServer(name));
            System.out.println(name + " \n\n***** Started *****\n\n " + registry.toString());
        } catch (RemoteException ex) {
            Logger.getLogger(MainChatRMIServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
