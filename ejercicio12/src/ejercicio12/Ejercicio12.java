/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.io.*;

/**
 *
 * @author ianre
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String archivoOrigen = "C:\\Users\\ianre\\Desktop\\Ian\\2DAM\\Acceso a Datos\\Ejercicios-28-09\\ejercicio12\\src\\ejercicio12\\imagen_origen.jpeg";
        String archivoDestino = "C:\\Users\\ianre\\Desktop\\Ian\\2DAM\\Acceso a Datos\\Ejercicios-28-09\\ejercicio12\\src\\ejercicio12\\imagen_copia.jpeg";

        try {
            // Crear flujos de entrada y salida con buffering
            BufferedInputStream flujoEntrada = new BufferedInputStream(new FileInputStream(archivoOrigen));
            BufferedOutputStream flujoSalida = new BufferedOutputStream(new FileOutputStream(archivoDestino));

            // Leer y escribir los bytes del archivo de origen al archivo de destino
            int byteLeido;
            while ((byteLeido = flujoEntrada.read()) != -1) {
                flujoSalida.write(byteLeido);
            }

            // Cerrar los flujos
            flujoEntrada.close();
            flujoSalida.close();

            System.out.println("La imagen se ha copiado exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al copiar la imagen: " + e.getMessage());
        }
    }

}
