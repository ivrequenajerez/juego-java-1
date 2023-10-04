/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.io.StringReader;
import java.io.StreamTokenizer;
import java.io.IOException;

/**
 *
 * @author ianre
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String cadena = "Hola 123 Mundo 456 Java";
        StringReader reader = new StringReader(cadena);
        StreamTokenizer tokenizer = new StreamTokenizer(reader);

        int contadorPalabras = 0;
        int contadorNumeros = 0;

        while (tokenizer.nextToken() != StreamTokenizer.TT_EOF) {
            switch (tokenizer.ttype) {
                case StreamTokenizer.TT_WORD:
                    // Si es una palabra
                    System.out.println("Palabra: " + tokenizer.sval);
                    contadorPalabras++;
                    break;
                case StreamTokenizer.TT_NUMBER:
                    // Si es un número
                    System.out.println("Número: " + tokenizer.nval);
                    contadorNumeros++;
                    break;
                default:
                    // Otros caracteres
                    System.out.println("Otro carácter: " + (char) tokenizer.ttype);
                    break;
            }
        }

        System.out.println("Total de palabras: " + contadorPalabras);
        System.out.println("Total de números: " + contadorNumeros);

    }

}
