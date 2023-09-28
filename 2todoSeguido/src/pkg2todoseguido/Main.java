/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2todoseguido;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
    public static void main(String[] args) throws FileNotFoundException, IOException {

        /*
            Escribe un programa que reciba el nombre de un archivo llamado 
            frase.txt que almacena una frase. Mostrar el contenido todo seguido y 
            sin espacios.
        */
        
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Introduce el nombre del archivo. (..¡'frase'!!)");

        String nomArch = myObj.nextLine();  // recibe el nombre del archivo

        if (nomArch.isEmpty() || !nomArch.equals("frase")) {
            System.err.println("Debes proporcionar el nombre del archivo correctamente.");
            return;
        }

        File f2 = new File("./", nomArch + ".txt"); // Directorio, nombre_archivo

        try {

            if (f2.createNewFile()) {
                System.out.println("El archivo se ha creado correctamente.");
            } else {
                System.out.println("El archivo ya existe.");
            }

            FileWriter escritor = new FileWriter(f2);

            escritor.write("Un gran poder conlleva una gran responsabilidad.");

            escritor.close();

            System.out.println("Se ha escrito la frase correctamente :)");
        } catch (IOException ex) {
            System.err.println("Error al crear el archivo :( " + ex.getMessage());
        }

        // Mostrar el contenido todo seguido (sin espacios):
        BufferedReader lector = new BufferedReader(new FileReader("frase.txt"));

        String contenido = "";
        String linea;

        while ((linea = lector.readLine()) != null) {

            // Inicializar una cadena para almacenar la línea
            contenido = "";

            // Recorrer cada carácter de la línea
            for (int i = 0; i < linea.length(); i++) {
                char caracter = linea.charAt(i);

                // Agregar el carácter a la línea sin espacios si no es un espacio en blanco
                if (!Character.isWhitespace(caracter)) {
                    contenido += caracter;
                }

            }

        }

        lector.close();

        System.out.println("Contenido sin espacios: \n" + contenido);

    }

}
