/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
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
            // Creamos un archivo llamado "pares.txt" para escribir números pares
            OutputStream archivoPares = new FileOutputStream("pares.txt");
            Writer escritorPares = new OutputStreamWriter(archivoPares);

            // Creamos un archivo llamado "números.txt" para escribir números
            OutputStream archivoNumeros = new FileOutputStream("números.txt");
            Writer escritorNumeros = new OutputStreamWriter(archivoNumeros);

            // Escribimos números pares en "pares.txt" del 2 al 200
            for (int i = 2; i <= 200; i += 2) {
                escritorPares.write(Integer.toString(i) + "\n");
            }

            // Cerramos "pares.txt" después de escribir
            escritorPares.close();
            archivoPares.close();

            // Abrimos "pares.txt" para leerlo
            BufferedReader lectorPares = new BufferedReader(new FileReader("pares.txt"));

            // Escribimos las primeras 100 líneas de "pares.txt" en "números.txt"
            for (int i = 0; i < 100; i++) {
                String linea = lectorPares.readLine();
                escritorNumeros.write(linea + "\n");
            }

            // Cerramos "números.txt" después de escribir
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
