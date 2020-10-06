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
public class Agencia {

    private String nome;
    private Endereco endereco;
    private Banco banco;
    private String agencia;

    //Construtor

    public Agencia(String nome, Endereco endereco, String agencia) {
        this.nome = nome;
        this.endereco = endereco;
        this.agencia = agencia;
    }
        
    //Getter and Setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "Agencia{" + "nome=" + nome + ", endereco=" + endereco + ", banco=" + banco + ", agencia=" + agencia + '}';
    }
    
    public void write(){
        System.out.println(this.toString());
    }

}
