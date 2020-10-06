/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiserverbanco;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author flavi
 */
public class MainRMIServerBanco {

    public static void main(String[] args) {

        Registry registry;
        String file = "BancoFatec.obj";

        try {
            registry = LocateRegistry.createRegistry(1007);
            RMIServerBanco rmi = new RMIServerBanco("Banco FATEC", file);
            registry.rebind("server", rmi);
            System.out.println("Server started");
            Scanner entrada = new Scanner(System.in);
            char c = ' ';
            do {
                System.out.println("tecle ´s´ para sair");
                c = entrada.next().charAt(0);
            } while (c != 's');
            rmi.close();
        } catch (RemoteException ex) {
            Logger.getLogger(MainRMIServerBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
