/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fichmezcla;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ianre
 */
public class FichMezcla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String archivo1 = "fichero1.txt";
        String archivo2 = "fichero2.txt";
        String archivoMezcla = "mezcla.txt";
        int lineasEscritas = 0;

        try (BufferedReader lector1 = new BufferedReader(new FileReader(archivo1));
             BufferedReader lector2 = new BufferedReader(new FileReader(archivo2));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoMezcla))) {

            String linea1, linea2;

            while (lineasEscritas < 4) {
                linea1 = lector1.readLine();
                linea2 = lector2.readLine();

                if (linea1 != null) {
                    escritor.write(linea1);
                    escritor.newLine();
                    lineasEscritas++;
                }

                if (linea2 != null) {
                    escritor.write(linea2);
                    escritor.newLine();
                    lineasEscritas++;
                }
            }
            System.out.println("Líneas de texto mezcladas.");
        } catch (IOException e) {
            System.err.println("Error al leer o escribir archivos: " + e.getMessage());
        }
        
    }
    
}
