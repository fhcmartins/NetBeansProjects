/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmihelloclient;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmihello.Hello;

/**
 *
 * @author flavi
 */
public class RMIHelloClient {

    static String message = "blank";
    
    public void connectServer() {       
        
        Registry registry;     
       
        try {
            registry = LocateRegistry.getRegistry("192.168.15.45", 1009);
            Hello rmi = (Hello) registry.lookup("Hello Server");
            System.out.println("Connect to Server");
            String text = rmi.Hello();
            System.out.println(text);
        } catch (RemoteException ex) {
            Logger.getLogger(RMIHelloClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(RMIHelloClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
       RMIHelloClient client = new RMIHelloClient();
       client.connectServer();
    }
    
}

    

