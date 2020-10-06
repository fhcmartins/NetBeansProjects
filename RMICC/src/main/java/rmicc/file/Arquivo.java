/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmicc.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author flavi
 */
public class Arquivo {

    private File file;
    private ObjectInputStream input;
    private ObjectOutputStream output;

    public Arquivo(String nameFile) {
        file = new File(nameFile);
        if (!file.exists()) {
            file = new File(nameFile);
        }
    }

    public void close() {
        try {
            input.close();
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void write(ArrayList list) {
        try {
            output = new ObjectOutputStream(new FileOutputStream(file));
            output.writeObject(list);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getNameFile() {
        return file.getName();
    }

    public ArrayList read() {
        ArrayList list = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Create: " + file.getAbsolutePath());
            } else {
                System.out.println(file.getAbsolutePath());
                if (file.canRead()) {
                    input = new ObjectInputStream(new FileInputStream(file));
                    
                    list = (ArrayList) input.readObject();
                    if(list.isEmpty()){
                        list = new ArrayList<>();
                    }
                }
            }
            return list;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
