/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author ianre
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
        
            Crear un programa con 3 opciones:
        
            Crear un fichero de texto en el que se guarde en cada linea: 
            nombre, afición y edad. Pedir estos datos por pantalla.
        
            Mostrar por pantalla el contenido del fichero de texto creado.
        
            Salir del Programa.
        
            Para leer el archivo se recomienda usar BufferedReader(FileReader) 
            para leer línea a línea en lugar de FileReader que lo hace por carácter.

         */
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú de opciones");
            System.out.println("1. Crear un fichero de texto");
            System.out.println("2. Mostrar contenido del fichero\n");
            System.out.println("3. Salir del Programa");
            System.out.print("¡ELIJA UNA OPCIÓN: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearFicheroTexto();
                    break;
                case 2:
                    mostrarContenidoFichero();
                    break;
                case 3:
                    System.out.println("¡Hasta la próxima, amigo!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("¡Opción no reconocida! ¡Elige una opción válida, por favor!");
                    break;
            }
        }
    }

    private static void crearFicheroTexto() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("¡Dame tu nombre!");
            String nombre = scanner.nextLine();
            System.out.println("¿Cuál es tu pasión en la vida?");
            String aficion = scanner.nextLine();
            System.out.println("¿Y tu edad?");
            int edad = scanner.nextInt();

            BufferedWriter escritor = new BufferedWriter(new FileWriter("datos.txt", true));
            escritor.write(nombre + ", " + aficion + ", " + edad);
            escritor.newLine();
            escritor.close();

            System.out.println("Los datos han sido guardados exitosamente en el archivo");
        } catch (IOException ex) {
            System.err.println("¡Vaya! Ha ocurrido un problema al crear el fichero." + ex.getMessage());
        }
    }

    private static void mostrarContenidoFichero() {
        try {
            BufferedReader lector = new BufferedReader(new FileReader("datos.txt"));
            String linea;

            System.out.println("Contenido del fichero:");
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            lector.close();
        } catch (IOException ex) {
            System.err.println("\n¡Error al leer el fichero!" + ex.getMessage());
        }

    }

}
