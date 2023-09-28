/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3cuantrepite;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ianre
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {

        /*
        
            Programa que nos diga cuántas veces se repite una palabra en un 
            fichero. La palabra la solicitaremos por pantalla. 
            Utilizar BufferedReader(FileReader) para leer líneas.
        
         */
        System.out.println("Este es el contenido del archivo:\n");

        try {
            // Abre el archivo para lectura
            BufferedReader lector = new BufferedReader(new FileReader("repetido.txt"));

            String linea;

            // Lee y muestra cada línea del archivo
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

            // Cierra el archivo después de leerlo
            lector.close();
        } catch (IOException ex) {
            System.err.println("Error al leer el archivo: " + ex.getMessage());
        }

        // Solicitamos la palabra a buscar
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nIntroduzca la palabra a buscar: ");

        String palabBusc = scanner.nextLine();

        try {
            BufferedReader lector = new BufferedReader(new FileReader("repetido.txt"));
            String linea;
            int contador = 1;

            while ((linea = lector.readLine()) != null) {
                // Dividir la línea en palabras usando espacios como delimitador
                String[] palabras = linea.split(" "); // también se puede usar '//s'

                // Recorrer cada palabra y contar las coincidencias
                for (int i = 0; i < palabras.length; i++) {
                    String palabra = palabras[i];
                    if (palabra.equalsIgnoreCase(palabBusc)) {
                        contador++;
                    }
                }
            }

            lector.close();

            System.out.println("La palabra '" + palabBusc + "' se repite " + contador + " veces en el archivo.");
        } catch (IOException ex) {
            System.err.println("Error al leer el archivo: " + ex.getMessage());
        }

    }

}
