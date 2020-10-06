/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmibanco.beans;

import rmicc.beans.Agencia;

/**
 *
 * @author flavi
 */
public class ServerAgencia {

    private String IP;
    private Integer port;
    private Agencia agencia;

    public ServerAgencia(String IP, Integer port, Agencia agencia) {
        this.IP = IP;
        this.port = port;
        this.agencia = agencia;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "ServerAgencia{" + "IP=" + IP + ", port=" + port + ", agencia=" + agencia + '}';
    }
    
    public void write(){
        System.out.println(this.toString());
    }
}
