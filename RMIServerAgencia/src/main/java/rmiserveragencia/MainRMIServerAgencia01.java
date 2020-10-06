package rmiserveragencia;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmibanco.beans.ServerAgencia;
import rmicc.beans.Agencia;
import rmicc.beans.Banco;
import rmicc.beans.Endereco;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author flavi
 */
public class MainRMIServerAgencia01 {

    public static void main(String[] args) {

        String nomeAg = "Taubate";
        String CEP = "12.678.345";
        Integer numero = 678;
        String complemento = "Agencia FATEC Taubaté";
        Endereco enderecoAg = new Endereco(CEP, numero, complemento);
        String CNPJ = "00.000.000/0001-91";
        String nomeBanco = "Banco FATEC";
        Banco banco = new Banco(CNPJ, nomeBanco);
        Agencia agencia = new Agencia(nomeAg, enderecoAg, banco);
        String IP = "192.168.0.100";
        Integer port = 1009;
        ServerAgencia serverAgencia = new ServerAgencia(IP, port, agencia);

        Registry registry;

        try {
            registry = LocateRegistry.createRegistry(port);
            String file = "AgenciaTaubate.obj";
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
            Logger.getLogger(MainRMIServerAgencia01.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
