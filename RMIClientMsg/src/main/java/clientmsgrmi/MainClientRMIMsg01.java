/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientmsgrmi;

/**
 *
 * @author flavi
 */
public class MainClientRMIMsg01 {
    
    public static void main(String[] args) {
        ClientMsgRMI client01 = new ClientMsgRMI("client01");
        client01.connectServer("client02");
    }
    
}
