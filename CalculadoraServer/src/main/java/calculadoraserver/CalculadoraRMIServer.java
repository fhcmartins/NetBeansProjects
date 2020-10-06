/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraserver;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmicalculadora.Calculadora;

/**
 *
 * @author Flávio Martins
 */
public class CalculadoraRMIServer extends UnicastRemoteObject implements Calculadora{

    public CalculadoraRMIServer() throws RemoteException {
        super();
    }
    
    @Override
    public float somar(float a, float b) throws RemoteException {
        System.out.println("A soma de " + a + " e " + b + " = " + (a + b));
        return a + b;
    }

    @Override
    public float subtrair(float a, float b) throws RemoteException {
        System.out.println("A subtração de " + a + " e " + b + " = " + (a - b));
        return a - b;
    }

    @Override
    public float multiplicar(float a, float b) throws RemoteException {
        System.out.println("A multiplicação de " + a + " x " + b + " = " + (a * b));
        return a * b;
    }

    @Override
    public float dividir(float a, float b) throws RemoteException {
        System.out.println("A divisao de " + a + " e " + b + " = " + (a / b));
        return a / b;
    }

    public static void main(String[] args){
        Registry registry;
        
        try{
            registry = LocateRegistry.createRegistry(1888);
            registry.rebind("CalculadoraServer", new CalculadoraRMIServer());
            System.out.println("Server Started");
        } catch(RemoteException ex){
            Logger.getLogger(CalculadoraRMIServer.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    
}

