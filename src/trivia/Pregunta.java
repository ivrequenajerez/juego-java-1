/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trivia;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author ianre
 */
public class Pregunta {

    // Atributos
    
    // 12 preguntas y 12 respuestas. Listas
    
    private ArrayList preguntas = new ArrayList(12);
    
    
    // Constructores
    
    public Pregunta(String respuesta, ArrayList<String> respuestas1) {
        
    } 
    
    // Métodos
    
    public void cargarPreguntas() {
        // Pregunta 1 - Respuestas
        ArrayList<String> respuestas1 = new ArrayList<>();
        respuestas1.add("Age of Empires");
        respuestas1.add("Civilization");
        respuestas1.add("Total War");
        respuestas1.add("StarCraft");
        respuestas1.add("Company of Heroes");
        respuestas1.add("Call of Duty");
        respuestas1.add("FIFA");
        respuestas1.add("Europa Universalis");
        respuestas1.add("Crusader Kings");
        respuestas1.add("Hearts of Iron");
        respuestas1.add("Anno");
        // Pregunta 1
        preguntas.add(new Pregunta("¿Qué videojuegos son de estrategia?", respuestas1));
    }
    
}
