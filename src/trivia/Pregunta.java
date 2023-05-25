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
    private ArrayList<String> preguntas = new ArrayList<>();
    private ArrayList<String> respuestas1 = new ArrayList<>();
    private ArrayList<String> respuestas2 = new ArrayList<>();
    private ArrayList<String> respuestas3 = new ArrayList<>();
    private ArrayList<String> respuestas4 = new ArrayList<>();
    
    
    // Constructores

    public Pregunta() {
    }
    
    public Pregunta(ArrayList preguntas, ArrayList respuestas) {
        
        String pregunta1 = "¿Qué videojuegos son de estrategia?";
        String pregunta2 = "¿Quiénes son cantantes andaluces?";
        String pregunta3 = "¿Cuáles son raperos de España?";
        String pregunta4 = "¿Cuáles son pueblos de Andalucía?";
        
        respuestas1.add("Age of Empires");
        respuestas1.add("Civilization");
        respuestas1.add("Total War");
        respuestas1.add("StarCraft");
        respuestas1.add("Company of Heroes");
        respuestas1.add("XCOM");
        respuestas1.add("FIFA");
        respuestas1.add("Minecraft");
        respuestas1.add("Grand Theft Auto");
        respuestas1.add("Super Mario Bros.");
        respuestas1.add("The Sims");
        respuestas1.add("Valorant");
        // Pregunta 1
        preguntas.add(pregunta1);
        
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
        preguntas.add(pregunta2);
        
        respuestas3.add("Kase.O");
        respuestas3.add("Arianna Puello");
        respuestas3.add("Ayax");
        respuestas3.add("YuS");
        respuestas3.add("Mala Rodríguez");
        respuestas3.add("FERNANDOACOSTA");
        respuestas3.add("Canserbero");
        respuestas3.add("Apache");
        respuestas3.add("Lil Supa");
        respuestas3.add("MC Teteu");
        respuestas3.add("Fazzini");
        respuestas3.add("Hurricane G");
        // Pregunta 3
        preguntas.add(pregunta3);
        
        respuestas4.add("Albacete");
        respuestas4.add("Venta de Pantalones");
        respuestas4.add("Buenas Noches");
        respuestas4.add("Salares");
        respuestas4.add("Matagorda");
        respuestas4.add("Guarromán");
        respuestas4.add("Cenicero");
        respuestas4.add("Correpoco");
        respuestas4.add("Elciego");
        respuestas4.add("Eulz");
        respuestas4.add("Moveros");
        respuestas4.add("Pis");
        // Pregunta 4
        preguntas.add(pregunta4);
    } 
    
    // Métodos
    
    public void AñadeDatos() {
        String pregunta1 = "¿Qué videojuegos son de estrategia?";
        String pregunta2 = "¿Quiénes son cantantes andaluces?";
        String pregunta3 = "¿Cuáles son raperos de España?";
        String pregunta4 = "¿Cuáles son pueblos de Andalucía?";
        
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
        preguntas.add(pregunta1);
        
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
        preguntas.add(pregunta2);
        
        respuestas3.add("Kase.O");
        respuestas3.add("Arianna Puello");
        respuestas3.add("Ayax");
        respuestas3.add("YuS");
        respuestas3.add("Mala Rodríguez");
        respuestas3.add("FERNANDOACOSTA");
        respuestas3.add("Canserbero");
        respuestas3.add("Apache");
        respuestas3.add("Lil Supa");
        respuestas3.add("MC Teteu");
        respuestas3.add("Fazzini");
        respuestas3.add("Hurricane G");
        // Pregunta 3
        preguntas.add(pregunta3);
        
        respuestas4.add("Albacete");
        respuestas4.add("Venta de Pantalones");
        respuestas4.add("Buenas Noches");
        respuestas4.add("Salares");
        respuestas4.add("Matagorda");
        respuestas4.add("Guarromán");
        respuestas4.add("Cenicero");
        respuestas4.add("Correpoco");
        respuestas4.add("Elciego");
        respuestas4.add("Eulz");
        respuestas4.add("Moveros");
        respuestas4.add("Pis");
        // Pregunta 4
        preguntas.add(pregunta4);
    }

    public ArrayList<String> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<String> preguntas) {
        this.preguntas = preguntas;
    }

    public ArrayList<String> getRespuestas1() {
        return respuestas1;
    }

    public void setRespuestas1(ArrayList<String> respuestas1) {
        this.respuestas1 = respuestas1;
    }

    public ArrayList<String> getRespuestas2() {
        return respuestas2;
    }

    public void setRespuestas2(ArrayList<String> respuestas2) {
        this.respuestas2 = respuestas2;
    }

    public ArrayList<String> getRespuestas3() {
        return respuestas3;
    }

    public void setRespuestas3(ArrayList<String> respuestas3) {
        this.respuestas3 = respuestas3;
    }

    public ArrayList<String> getRespuestas4() {
        return respuestas4;
    }

    public void setRespuestas4(ArrayList<String> respuestas4) {
        this.respuestas4 = respuestas4;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "preguntas=" + preguntas + ", respuestas1=" + respuestas1 + ", respuestas2=" + respuestas2 + ", respuestas3=" + respuestas3 + ", respuestas4=" + respuestas4 + '}';
    }
    
}
