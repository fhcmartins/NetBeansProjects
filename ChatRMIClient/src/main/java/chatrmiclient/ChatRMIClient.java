/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatrmiclient;

import chatrmi.ChatRMI;
import chatrmi.Client;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author flavi
 */
public class ChatRMIClient {
    
    private Client client;

    public ChatRMIClient(Client client) {
        this.client = client;
    }

    public void connectServer(String serverName, String IP, int port){
        
        Registry registry;
        
        int sair = -1;
        String msg = "";
        Scanner in = new Scanner(System.in);
        
        try {
            registry = LocateRegistry.getRegistry(IP, port);
            ChatRMI rmiChat = (ChatRMI) registry.lookup(serverName);
            System.out.println("Connect to Server");
            System.out.println(rmiChat.getServerName());
            
            do{
                System.out.println(rmiChat.getMSG(client));
                System.out.println("Digite 0 para sair.");
                sair = in.nextInt();
                System.out.println("***** " + client.getName() + " *****");
                System.out.println("Entre com o nome do destinatario: ");
                String name = in.next();
                Client destinatario = new Client(name);
                System.out.println("Entre com a msg: ");
                msg = in.next();
                rmiChat.sendMSG(client, destinatario, msg);
            }while(sair == 1);
            
        } catch (RemoteException ex) {
            Logger.getLogger(ChatRMIClient.class.getName()).log(Level.SEVERE, null, ex);
        }catch (NotBoundException ex) {
            Logger.getLogger(ChatRMIClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
