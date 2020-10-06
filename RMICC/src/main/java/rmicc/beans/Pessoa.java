/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmicc.beans;

/**
 *
 * @author flavi
 */
public class Pessoa {

    private String RG;
    private String nome;
    private String dataNasc;
    private String email;

    //Construtor
    public Pessoa(String RG, String nome, String dataNasc, String email) {
        this.RG = RG;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.email = email;
    }

    public String getRG() {
        return RG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "RG=" + RG + ", nome=" + nome + ", dataNasc=" + dataNasc + ", email=" + email + '}';
    }
    
    public void write(){
        System.out.println(this.toString());
    }
     
    
}
