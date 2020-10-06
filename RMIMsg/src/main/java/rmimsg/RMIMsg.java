/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmimsg;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author flavi
 */
public interface RMIMsg extends Remote{
    String receiveMsg() throws RemoteException;
    void sendMsg(String msg) throws RemoteException;
}
