/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatrmiclient;

import chatrmi.Client;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author flavi
 */
public class MainChatRMIClient03 {
        
    public static void main(String[] args) throws NotBoundException {
        
        Client client = new Client("client003", "192.168.15.45", 1099);
        ChatRMIClient chatClient = new ChatRMIClient(client);
        chatClient.connectServer("chatserver", "192.168.15.45", 1099);
    
    }
    
}
