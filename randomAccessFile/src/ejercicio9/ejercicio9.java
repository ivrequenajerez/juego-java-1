/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.io.RandomAccessFile;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ianre
 */
public class ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        
            Acceso aleatorio. Clase RandomAccessFile.
            Crear un fichero llamado numeros.dat que contendrá números. Tendrá permisos de lectura y escritura.
            Pedir un número por teclado y añadirlo al final del archivo.
            Se puede crear un método muestraFichero() que muestra el fichero después de añadirlo.

        */

        Scanner scanner = new Scanner(System.in);

        // Pedir un número al usuario
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        try {
            // Crear el archivo numeros.dat con permisos de lectura y escritura
            RandomAccessFile archivo = new RandomAccessFile("numeros.dat", "rw");
            archivo.close();
            System.out.println("Archivo numeros.dat creado con éxito.");

            // Abrir el archivo en modo de escritura
            archivo = new RandomAccessFile("numeros.dat", "rw");

            // Ir al final del archivo
            archivo.seek(archivo.length());

            // Escribir el número en el archivo
            archivo.writeInt(numero);

            archivo.close();
            System.out.println("Número agregado al archivo.");

            // Llamar al método muestraFichero para mostrar el contenido
            muestraFichero();

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    public static void muestraFichero() {
        try {
            // Abrir el archivo en modo de lectura
            RandomAccessFile archivo = new RandomAccessFile("numeros.dat", "r");

            System.out.println("Contenido del archivo:");

            // Leer y mostrar los números almacenados
            while (archivo.getFilePointer() < archivo.length()) {
                int numero = archivo.readInt();
                System.out.println(numero);
            }

            archivo.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
