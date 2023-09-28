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
        // Creamos una lista de números del 0 al 9
        byte[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        // Usamos una cosa llamada "ByteArrayInputStream" para leer estos números
        ByteArrayInputStream entradaNumeros = new ByteArrayInputStream(numeros);

        try {
            // Leemos los números uno por uno y los mostramos en pantalla
            int numeroLeido;
            while ((numeroLeido = entradaNumeros.read()) != -1) {
                System.out.print(numeroLeido + " ");
            }

            // Cerramos la cosa que lee los números
            entradaNumeros.close();
        } catch (IOException e) {
            System.err.println("¡Algo salió mal al tratar de leer los números! " + e.getMessage());
        }

    }

}
