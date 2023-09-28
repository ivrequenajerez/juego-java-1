/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author ianre
 */
public class ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        
            Hacer igual que el programa 1 pero mediante la clase de 
            Flujo correspondiente. 
            Escribe un programa que escriba los 100 primeros números en un 
            archivo llamado números.
        
         */
        try {
            // Creamos un flujo de salida hacia el archivo "pares.txt"
            OutputStream archivoPares = new FileOutputStream("pares.txt");
            Writer escritorPares = new OutputStreamWriter(archivoPares);

            // Creamos un flujo de salida hacia el archivo "números"
            OutputStream archivoNumeros = new FileOutputStream("números.txt");
            Writer escritorNumeros = new OutputStreamWriter(archivoNumeros);

            // Escribe los números pares en el archivo "pares.txt"
            for (int i = 2; i <= 200; i += 2) {
                escritorPares.write(Integer.toString(i) + "\n");
            }

            // Escribe los primeros 100 números en el archivo "números"
            for (int i = 1; i <= 100; i++) {
                escritorNumeros.write(Integer.toString(i) + "\n");
            }

            // Cierra los flujos de escritura y los archivos
            escritorPares.close();
            archivoPares.close();
            escritorNumeros.close();
            archivoNumeros.close();

            // Misión cumplida
            System.out.println("Números pares del 1 al 200 se han guardado en pares.txt.");
            System.out.println("Los primeros 100 números se han guardado en el archivo números.");
        } catch (IOException ex) {
            // Problemas!!
            System.err.println("Error al escribir en el archivo: " + ex.getMessage());
        }

    }

}
