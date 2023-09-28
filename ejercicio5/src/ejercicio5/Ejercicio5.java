/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ianre
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        
        Escribe un programa que:
        Lea un archivo de texto creado en el bloc de notas llamado 
        sumanumeros.txt que contiene varias líneas y en cada una de 
        ellas un número. 
        El programa mostrará la suma de todos los números del fichero.
        
         */
        
        String nombreArchivo = "sumanumeros.txt"; // Nombre del archivo a leer

        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            double suma = 0.0;

            while ((linea = lector.readLine()) != null) {
                // Convertir la línea a un número y sumarlo a la suma total
                double numero = Double.parseDouble(linea);
                suma += numero;
            }

            System.out.println("La suma de los números en " + nombreArchivo + " es: " + suma);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir una línea a número: " + e.getMessage());
        }
        
    }

}
