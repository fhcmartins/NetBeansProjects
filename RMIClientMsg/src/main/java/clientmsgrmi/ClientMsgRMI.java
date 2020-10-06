/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientmsgrmi;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmimsg.RMIMsg;

/**
 *
 * @author flavi
 */
public class ClientMsgRMI {
        
    private String name;
    
    //Construtor
    public ClientMsgRMI(String name) {
        this.name = name;
    }

    public void connectServer(String destinatario){
        
        Registry registry;
        
        try {
            registry = LocateRegistry.getRegistry("192.168.15.45", 1099);
            RMIMsg rmiMsg = (RMIMsg) registry.lookup("ServerMSG");
            System.out.println("Connect to Server");
            
            do{
                String text = rmiMsg.receiveMsg();
            
                Scanner in = new Scanner(System.in);
            
                System.err.println(destinatario + " escreveu para " + name + " " + text);
            
                System.err.println("Digite uma palavra");
            
                rmiMsg.sendMsg(in.next());
            }while(true);
        } catch (RemoteException ex) {
            Logger.getLogger(ClientMsgRMI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(ClientMsgRMI.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }   
}
