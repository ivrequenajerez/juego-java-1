/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 *
 * @author ianre
 */
public class ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        
            Escribir un programa que cree un array de bytes con los dígitos 
            de 0 a 9 y definir un flujo de entrada (ByteArrayInputStream) 
            para leer sus valores y mostrarlos por pantalla.
        
         */
        
        // Creamos un array de bytes con los dígitos del 0 al 9
        byte[] digitos = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Creamos un flujo de entrada ByteArrayInputStream utilizando el array de bytes
        ByteArrayInputStream inputStream = new ByteArrayInputStream(digitos);

        try {
            // Leemos los bytes del flujo de entrada y los mostramos por pantalla
            int byteLeido;
            while ((byteLeido = inputStream.read()) != -1) {
                System.out.print(byteLeido + " ");
            }

            // Cerramos el flujo de entrada
            inputStream.close();
        } catch (IOException e) {
            System.err.println("Error al leer el flujo de entrada: " + e.getMessage());
        }

    }

}
