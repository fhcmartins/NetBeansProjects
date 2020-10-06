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
public class MainClientRMIMsg02 {
    
    public static void main(String[] args) {
        ClientMsgRMI client02 = new ClientMsgRMI("client02");
        client02.connectServer("client01");
    }
    
}
