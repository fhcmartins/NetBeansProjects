/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmicalculadora;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Flávio Martins
 */
public interface Calculadora extends Remote{
        
    float somar(float a, float b) throws RemoteException;
    float subtrair(float a, float b) throws RemoteException;
    float multiplicar(float a, float b) throws RemoteException;
    float dividir(float a, float b) throws RemoteException;
    
}
