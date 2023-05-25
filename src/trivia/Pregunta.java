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
    private ArrayList respuestas1 = new ArrayList(12);
    private ArrayList respuestas2 = new ArrayList(12);
    private ArrayList respuestas3 = new ArrayList(12);
    private ArrayList respuestas4 = new ArrayList(12);
    
    // Constructores
    
    public Pregunta(ArrayList preguntas, ArrayList respuestas) {
    
        respuestas1.add("Age of Empires");
        respuestas1.add("Civilization");
        respuestas1.add("Total War");
        respuestas1.add("StarCraft");
        respuestas1.add("Company of Heroes");
        respuestas1.add("Call of Duty");
        respuestas1.add("FIFA");
        respuestas1.add("Minecraft");
        respuestas1.add("Grand Theft Auto");
        respuestas1.add("Super Mario Bros.");
        respuestas1.add("The Sims");
        respuestas1.add("Valorant");
        // Pregunta 1
        preguntas.add(new Pregunta("¿Qué videojuegos son de estrategia?", respuestas1));
        
        respuestas2.add("Alejandro Sanz");
        respuestas2.add("Rosalía");
        respuestas2.add("Pablo Alborán");
        respuestas2.add("India Martínez");
        respuestas2.add("Niña Pastori");
        respuestas2.add("David Bisbal");
        respuestas2.add("Maluma");
        respuestas2.add("Justin Bieber");
        respuestas2.add("Churumbé");
        respuestas2.add("Beyoncé");
        respuestas2.add("Ed Sheeran");
        respuestas2.add("Adele");
        // Pregunta 2
        preguntas.add(new Pregunta("¿Quiénes son cantantes andaluces?", respuestas2));
        
        respuestas2.add("Kase.O");
        respuestas2.add("Arianna Puello");
        respuestas2.add("Ayax");
        respuestas2.add("YuS");
        respuestas2.add("Mala Rodríguez");
        respuestas2.add("FERNANDOACOSTA");
        respuestas2.add("Canserbero");
        respuestas2.add("Apache");
        respuestas2.add("Lil Supa");
        respuestas2.add("MC Teteu");
        respuestas2.add("Fazzini");
        respuestas2.add("Hurricane G");
        // Pregunta 3
        preguntas.add(new Pregunta("¿Cuáles son raperos de España?", respuestas3));
        
        respuestas2.add("Albacete");
        respuestas2.add("Venta de Pantalones");
        respuestas2.add("Buenas Noches");
        respuestas2.add("Salares");
        respuestas2.add("Matagorda");
        respuestas2.add("Guarromán");
        respuestas2.add("Cenicero");
        respuestas2.add("Correpoco");
        respuestas2.add("Elciego");
        respuestas2.add("Eulz");
        respuestas2.add("Moveros");
        respuestas2.add("Pis");
        // Pregunta 4
        preguntas.add(new Pregunta("¿Cuáles son pueblos de Andalucía?", respuestas4));
        
    } 
    
}
