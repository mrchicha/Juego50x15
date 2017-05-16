/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego50x15;

import java.util.ArrayList;

/**
 *
 * @author make
 */
public class GestionPregunta {
    
    ArrayList<Pregunta> preguntas;
    
    
    GestionPregunta(){
        preguntas=new ArrayList<Pregunta>();
        preguntas.add(new Pregunta("¿Cuál es la capital de Francia?","París","Lisboa","Roma","Sudán","París",1));
        preguntas.add(new Pregunta("¿Cuál es el mayor animal del mundo?","Elefante","Manati","Jirafa","Ballena azul","Ballena azul",1));
        preguntas.add(new Pregunta("¿Qué es CMD?","Consola Windows","Una marca","Ni idea","Un comando","Consola Windows",1));
        preguntas.add(new Pregunta("¿Quién fué presidente de España en el año 2008?","Aznar","Rajoy","Zapatero","Pablo Iglesias","Zapatero",1));
        preguntas.add(new Pregunta("¿Cómo se llama la bola del badminton?","Pelota","Cascajo","Rotor","Volante","Volante",1));
        preguntas.add(new Pregunta("¿Cuántos días tiene un año bisiesto?","Cinco","Siete","Mil","Trescientos sesenta y seis","Trescientos sesenta y seis",1));
        preguntas.add(new Pregunta("¿Cómo se llama el satélite más importante de la tierra?","Luna","Europa","Sol","Orion","Luna",2));
        preguntas.add(new Pregunta("¿En qué año llegó el hombre a la luna?","1900","1492","1968","1961","1961",2));
        preguntas.add(new Pregunta("¿Cuál es la comida más vendida en restaurantes?","Hamburguesa","Hotdog","Pizza","Patatas fritas","Patatas fritas",2));
        preguntas.add(new Pregunta("¿En qué año asesinaron a JFK?","1972","1894","1966","1963","1963",2));
        preguntas.add(new Pregunta("¿A qué profundidad ha llegado el hombre?","3256","2450","5200","10300","10300",2));
        preguntas.add(new Pregunta("¿Dónde está el lugar más profundo del océano?","La fosa de las Marianas","Las tres piedras","El océano Índico","Mare nostrum","La fosa de las Marianas",3));
        preguntas.add(new Pregunta("¿En qué circuito ganó Alonso su primer campeonato de F1?","Suzuka","Interlagos","Montmeló","Hungaroring","Interlagos",3));
        preguntas.add(new Pregunta("¿Cómo se llama la mascota favorita de Obama?","Sunny","Cassy","Pressy","Ussy","Sunny",3));
        preguntas.add(new Pregunta("¿En qué año se derribo el muro de Berlín?","1980","1960","1989","1456","1989",3));
        preguntas.add(new Pregunta("¿Cuánto es 1589 en binario?","00101011","11000110101","1101011","010","11000110101",3));
    }
    public String toString(){
        String resultado="Listado de preguntas:";
        
        for(int ind=0;ind<preguntas.size();ind++){
            resultado+="\n"+preguntas.get(ind);
        }
        return preguntas.toString();
    }
}
