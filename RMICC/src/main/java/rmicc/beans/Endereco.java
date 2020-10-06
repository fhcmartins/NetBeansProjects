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
public class Endereco {

    private String CEP;
    private Integer numero;
    private String complemento;

    public Endereco(String CEP, Integer numero, String complemento) {
        this.CEP = CEP;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "Endereco{" + "CEP=" + CEP + ", numero=" + numero + ", complemento=" + complemento + '}';
    }
    
    
}
