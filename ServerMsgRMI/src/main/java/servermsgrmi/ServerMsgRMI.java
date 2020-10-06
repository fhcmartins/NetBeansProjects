/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servermsgrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import rmimsg.RMIMsg;

/**
 *
 * @author flavi
 */
public class ServerMsgRMI extends UnicastRemoteObject implements RMIMsg {
    
    private String msg;

    public ServerMsgRMI() throws RemoteException {
        this.msg = "";
    }
    
    @Override
    public String receiveMsg() throws RemoteException {
        System.out.println(this.msg);
        return msg;
    }

    @Override
    public void sendMsg(String msg) throws RemoteException {
        System.out.println(this.msg);
        this.msg = msg;
    }
    
}