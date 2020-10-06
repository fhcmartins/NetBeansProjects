/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmicc.beans;

import java.io.Serializable;

/**
 *
 * @author flavi
 */
public class Cliente extends Pessoa implements Serializable{
    
    private String CPF;
    private String endereco;
    
    //Construtor
    public Cliente(String RG, String nome, String dataNasc, String email) {
        super(RG, nome, dataNasc, email);
        this.CPF = CPF;
        this.endereco = endereco;
    }
    
    //Getters and Setters

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "CPF=" + CPF + ", endereco=" + endereco + '}';
    }
    
    public void write(){
        System.out.println(this.toString());
    }
}
