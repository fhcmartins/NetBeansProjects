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
public class Conta implements Serializable{

    private Integer numero;
    private Cliente cliente;
    private String nomeAgencia;
    private Float saldo;
    private Float limite;
}
