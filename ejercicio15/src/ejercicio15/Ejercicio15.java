/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;
import java.io.*;

/**
 *
 * @author ianre
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String archivoOrigen = "C:\\Users\\ianre\\Desktop\\Ian\\2DAM\\Acceso a Datos\\Ejercicios-28-09\\ejercicio15\\src\\ejercicio15\\archivo.txt"; // Nombre del archivo de origen
        String archivoDestino = "C:\\Users\\ianre\\Desktop\\Ian\\2DAM\\Acceso a Datos\\Ejercicios-28-09\\ejercicio15\\src\\ejercicio15\\copia.txt"; // Nombre del archivo de destino

        try {
            // Abre un lector de líneas con número de línea
            LineNumberReader lector = new LineNumberReader(new FileReader(archivoOrigen));

            // Abre un escritor para escribir en el archivo de destino
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoDestino));

            String linea;
            while ((linea = lector.readLine()) != null) {
                // Lee una línea del archivo de origen
                System.out.println("Línea " + lector.getLineNumber() + ": " + linea);

                // Escribe la misma línea en el archivo de destino
                escritor.write(linea);
                escritor.newLine(); // Agrega un salto de línea
            }

            // Cierra los flujos de lectura y escritura
            lector.close();
            escritor.close();

            System.out.println("Líneas leídas y escritas en '" + archivoDestino + "'.");

            // Ahora, leemos y mostramos el contenido del archivo de destino
            System.out.println("Contenido de '" + archivoDestino + "':");

            BufferedReader lectorCopia = new BufferedReader(new FileReader(archivoDestino));
            while ((linea = lectorCopia.readLine()) != null) {
                System.out.println(linea);
            }
            lectorCopia.close();

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
}
