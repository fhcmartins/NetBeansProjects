/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatrmiserver;

import chatrmi.ChatRMI;
import chatrmi.Client;
import chatrmi.Message;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author flavi
 */
public class ChatRMIServer extends UnicastRemoteObject implements ChatRMI{

    private String name;
    private Hashtable<String, Client> clients;
    private List<Message> MSGs;
    private static Integer index = 0;

    public ChatRMIServer(String name) throws RemoteException {
        super();
        this.name = name;
        MSGs = new ArrayList<>();
        clients = new Hashtable<String, Client>();
    }
       
    @Override
    public String getServerName() throws RemoteException {
        return this.name;
    }

    @Override
    public void addClient(Client client) throws RemoteException {
        clients.put(client.getName(), client);
    }

    @Override
    public void sendMSG(Client sender, Client recipient, String text) throws RemoteException {
        Message msg = new Message(index++, sender, recipient, text, false);
        MSGs.add(msg);
        msg.write();
    }

    @Override
    public String getMSG(Client recipient) throws RemoteException {
        System.out.println("####################################################");
        String msgs = "";
        for(int i = 0; i < MSGs.size(); i++){
        if(recipient.equals(MSGs.get(i).getRecipient())){
        MSGs.get(i).setStatus(true);
        msgs+=MSGs.get(i).getSender()+" escreveu :"+MSGs.get(i).getMsg()+System.lineSeparator();
        }
        else if(recipient.equals(MSGs.get(i).getRecipient()))
        msgs+=MSGs.get(i).getSender()+" escreveu :"+MSGs.get(i).getMsg()+System.lineSeparator();
        MSGs.get(i).write();
        }
        System.lineSeparator();
        return msgs;
    }

    @Override
    public Hashtable<String, Client> getClients() throws RemoteException {
        return clients;
    }
    
}
