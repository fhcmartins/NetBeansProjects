/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatrmi;

import java.io.Serializable;

/**
 *
 * @author flavi
 */
public class Client implements Serializable {
    
    private String name;
    private String IP;
    private int port;

    public Client(String name){
        this.name = name;
    }
    
    public Client(String name, String IP, int port) {
        this.name = name;
        this.IP = IP;
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public String getIP() {
        return IP;
    }

    public int getPort() {
        return port;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", IP=" + IP + ", port=" + port + '}';
    }
    
    public void write(){
        System.out.println(this.toString());
    }
    
}
