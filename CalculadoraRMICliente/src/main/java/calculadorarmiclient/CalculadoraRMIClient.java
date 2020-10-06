/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorarmiclient;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmicalculadora.Calculadora;

/**
 *
 * @author Flávio Martins
 */
public class CalculadoraRMIClient {
    
    public static void main(String[] args) throws NotBoundException {
        Registry registry;
        
        try{
            registry = LocateRegistry.getRegistry("192.168.15.45", 1888);
            Calculadora rmi = (Calculadora) registry.lookup("CalculadoraServer");
            
            //O que será calculado
            System.out.println("Connect to Server");
            System.out.println("");
            System.out.println("O resultado de 7 + 9 é " + rmi.somar(7, 9));
            System.out.println("O resultado de 7 - 9 é " + rmi.subtrair(7, 9));
            System.out.println("O resultado de 7 x 9 é " + rmi.multiplicar(7, 9));
            System.out.println("O resultado de 7 / 9 é " + rmi.dividir(7, 9));
        } catch (RemoteException ex) {
            Logger.getLogger(CalculadoraRMIClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
