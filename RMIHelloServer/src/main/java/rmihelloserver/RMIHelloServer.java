/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmihelloserver;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmihello.Hello;

/**
 *
 * @author flavi
 */
public class RMIHelloServer extends UnicastRemoteObject implements Hello {

    //Construtor   
    public RMIHelloServer() throws RemoteException {
        super();
    }
    
    //Try cat
    public static void main(String[] args) throws RemoteException{
        
        Registry registry;
        
        try{
        registry = LocateRegistry.createRegistry(1009);
        registry.rebind("Hello Server", new RMIHelloServer());
        System.out.println("Server Started");
        }catch (RemoteException ex){
            Logger.getLogger(RMIHelloServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String Hello() throws RemoteException {
        System.out.println("Invocation to Hello was succesfull!");
            return "Hello World from RMI Server!";
    }

}