/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IoDatos;

import Personas.Persona;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Catalin 'uNKoLL' Ciurcanu
 */
public class ioPersonas {
    public static ArrayList cargarFichero(){
        ArrayList<Persona> vPersonas = new ArrayList<>();
        File f = new File("invitados.txt");
        if(!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(ioPersonas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        try {
            FileReader fr = new FileReader(f);
            Scanner leer = new Scanner(fr);
            while(leer.hasNext()){
                String linea = leer.nextLine();
                String aux[] = linea.split(";");
                vPersonas.add(new Persona(aux[0], aux[1], aux[2]));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ioPersonas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return vPersonas;
    }
}
