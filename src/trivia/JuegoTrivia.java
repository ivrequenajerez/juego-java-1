/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia;

import Interfaz.finDeJuego;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author ianre
 */
public class JuegoTrivia extends finDeJuego {

    // Rondas
    private int numeroRonda;
    private int NUMERO_MAXIMO_RONDAS = 4;
    
    public void iniciarPartida() {
        numeroRonda = 1;
        // Tiene que cargar una pregunta random de las 12 preguntas guardadas
        // JLabel
    }
    
    public void iniciarRonda() {
        // mostrarRondaDePreguntas(); La pregunta debe mostrarse en el label de rondaDePreguntas
        numeroRonda++;
        
        if (numeroRonda > NUMERO_MAXIMO_RONDAS) {
            mostrarVentanaFinalizacion();
        }
        
    }
   
    
}
