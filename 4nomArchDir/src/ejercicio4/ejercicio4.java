/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ianre
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* 

            Escribir un programa que muestre los nombres de los archivos y 
            directorios que se encuentren en un directorio. 
            Pediremos el directorio por pantalla.

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa lista los archivos y directorios de directorio específico.");

        // Pedir al usuario el directorio
        System.out.print("Por favor, ingrese la ruta del directorio a listar: ");

        String dirBusc = scanner.nextLine();

        // Crear un objeto File que represente el directorio a buscar
        File directorio = new File(dirBusc);

        // Verificar si el directorio existe
        if (directorio.exists() && directorio.isDirectory()) {
            // Obtener la lista de archivos y directorios en el directorio
            String[] contenido = directorio.list();

            // Mostrar la lista en la consola
            System.out.println("\nArchivos y directorios en " + dirBusc + ":");

            for (int i = 0; i < contenido.length; i++) {
                String item = contenido[i];
                System.out.println(item);
            }
            
        } else {
            System.err.println("El directorio especificado no existe o no es válido.");
        }

    }

}
