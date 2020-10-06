/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatrmiclient;

import chatrmi.Client;
import java.rmi.NotBoundException;

/**
 *
 * @author flavi
 */
public class MainChatRMIClient01 {
    
    public static void main(String[] args) throws NotBoundException {
        
        Client client = new Client("client001", "192.168.15.45", 1099);
        ChatRMIClient chatClient = new ChatRMIClient(client);
        chatClient.connectServer("chatserver", "192.168.15.45", 1099);
    
    }
    
}
