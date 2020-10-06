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
public class MainClientMsgRMI02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClientMsgRMI client02 = new ClientMsgRMI("client02");
        ClientMsgRMI client02 = new ClientMsgRMI("client02");
        client02.connectServer("client01");
    }
    
}
