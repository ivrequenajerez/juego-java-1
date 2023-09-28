/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/* Importamos las librerías necesarias */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ianre
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Escribe un programa que guarde en un fichero de nombre “pares.txt” los números pares que hay entre 1 y 200. 
        /* 
        Creamos un objeto File llamado f que representa un archivo en el sistema 
        de archivos. 
        Además especificamos el directorio y el nombre del archivo que se 
        desea manipular.
        */
        File f = new File("./", "pares.txt"); // Directorio, nombre_fichero

        try {
            if (f.createNewFile()) {
                System.out.println("El archivo se ha creado correctamente.");
            } else {
                System.out.println("El archivo ya existe.");
            }

            FileWriter escritor = new FileWriter(f);

            for (int i = 2; i <= 200; i += 2) {
                escritor.write(Integer.toString(i) + "\n");
            }

            escritor.close();

            System.out.println("Números pares del 1 al 200 se han guardado en pares.txt.");
        } catch (IOException ex) {
            System.err.println("Error al crear el archivo: " + ex.getMessage());
        }
        
    }

}
