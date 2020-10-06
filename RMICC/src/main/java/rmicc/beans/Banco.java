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
public class Banco {
    private String CNPJ;
    private String nome;

    public Banco(String CNPJ, String nome) {
        this.CNPJ = CNPJ;
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Banco{" + "CNPJ=" + CNPJ + ", nome=" + nome + '}';
    }
    
    
}
