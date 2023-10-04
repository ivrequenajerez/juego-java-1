/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ianre
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir una frase por teclado
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        // Pedir una palabra a buscar
        System.out.print("Ingrese una palabra a buscar: ");
        String palabraBuscada = scanner.nextLine();

        // Utilizar StringTokenizer para dividir la frase en palabras
        StringTokenizer tokenizer = new StringTokenizer(frase);

        int contador = 0;

        // Iterar a través de las palabras y contar cuántas veces aparece la palabra buscada
        while (tokenizer.hasMoreTokens()) {
            String palabra = tokenizer.nextToken();

            // Comparar la palabra con la palabra buscada (ignorar mayúsculas/minúsculas)
            if (palabra.equalsIgnoreCase(palabraBuscada)) {
                contador++;
            }
        }

        // Mostrar el resultado
        System.out.println("La palabra '" + palabraBuscada + "' aparece " + contador + " veces en la frase.");
    
    }
    
}
