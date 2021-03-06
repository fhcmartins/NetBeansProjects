/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmiserveragencia;

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
public class mainRMIServerAgencia02 {

    public static void main(String[] args) {

        String nomeAg = "Tremembe";
        String CEP = "12.665.600";
        Integer numero = 1600;
        String complemento = "Agencia FATEC Tremembé";
        Endereco enderecoAg = new Endereco(CEP, numero, complemento);
        String CNPJ = "00.000.000/0001-91";
        String nomeBanco = "Banco FATEC";
        Banco banco = new Banco(CNPJ, nomeBanco);
        Agencia agencia = new Agencia(nomeAg, enderecoAg, banco);
        String IP = "192.168.0.100";
        Integer port = 1099;
        ServerAgencia serverAgencia = new ServerAgencia(IP, port, agencia);

        Registry registry;

        try {
            registry = LocateRegistry.createRegistry(port);
            String file = "AgenciaTremembe.obj";
            RMIServerAgencia rmiAgencia = new RMIServerAgencia(agencia, file);
            rmiAgencia.connectServer("192.168.0.100", 1007, serverAgencia);
            rmiAgencia.getRmiBanco().deleteAgencia(agencia);
            rmiAgencia.getRmiBanco().addAgencia(serverAgencia);
            rmiAgencia.getRmiBanco().getAgencia(agencia).write();
            registry.rebind("server", rmiAgencia);
            System.out.println("Server started");
            Scanner entrada = new Scanner(System.in);
            char c = ' ';
            do {
                System.out.println("tecle ´s´ para sair");
                c = entrada.next().charAt(0);
            } while (c != 's');
            rmiAgencia.close();
        } catch (RemoteException ex) {
            Logger.getLogger(mainRMIServerAgencia02.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
