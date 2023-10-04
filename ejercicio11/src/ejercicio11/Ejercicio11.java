/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ianre
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        
            FileWriter y BufferedWriter. 
            Escribir un método que reciba por parámetro un array de valores 
            String correspondientes a 5 nombres de personas y un array de 
            valores reales correspondientes a las alturas de dichas personas. 
            El método recibirá también el nombre de un archivo sobre el que se 
            escribirá cada nombre seguido de su altura.

         */

        // Primero creamos un método (Fuera de main)
        // y luego escribimos en el archivo invocando el método, para luego mostrar el contenido de este archivo
        
        // Ejemplo de uso
        
        String[] nombres = {"Juan", "Maria", "Pedro", "Ana", "Carlos"};
        double[] alturas = {175.5, 162.0, 180.2, 165.8, 175.0};
        String nombreArchivo = "nombres_y_alturas.txt";

        escribirNombresYAlturas(nombres, alturas, nombreArchivo);
        
    }

    public static void escribirNombresYAlturas(String[] nombres, double[] alturas, String nombreArchivo) {
        try ( BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))) {
            // Verificamos que ambos arrays tengan la misma longitud
            if (nombres.length != alturas.length) {
                System.err.println("Los arrays de nombres y alturas deben tener la misma longitud.");
                return;
            }

            // Escribimos cada nombre seguido de su altura en el archivo
            for (int i = 0; i < nombres.length; i++) {
                escritor.write(nombres[i] + ": " + alturas[i] + " cm\n");
            }

            System.out.println("Datos escritos en el archivo " + nombreArchivo + " correctamente.");
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo: " + ex.getMessage());
        }
    }

}
