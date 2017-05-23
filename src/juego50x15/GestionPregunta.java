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
        preguntas.add(new Pregunta("¿Cuál es la capital de Francia?","París",1,"París","Lisboa","Roma","Sudán"));
        preguntas.add(new Pregunta("¿Cuál es el mayor animal del mundo?","Ballena azul",1,"Elefante","Manati","Jirafa","Ballena azul"));
        preguntas.add(new Pregunta("¿Qué es CMD?","Consola Windows",1,"Consola Windows","Una marca","Ni idea","Un comando"));
        preguntas.add(new Pregunta("¿Quién fué presidente de España en el año 2008?","Zapatero",1,"Aznar","Rajoy","Zapatero","Pablo Iglesias"));
        preguntas.add(new Pregunta("¿Cómo se llama la bola del badminton?","Volante",1,"Pelota","Cascajo","Rotor","Volante"));
        preguntas.add(new Pregunta("¿Cuántos días tiene un año bisiesto?","Trescientos sesenta y seis",1,"Cinco","Siete","Mil","Trescientos sesenta y seis"));
        preguntas.add(new Pregunta("¿Cómo se llama el satélite más importante de la tierra?","Luna",2,"Luna","Europa","Sol","Orion"));
        preguntas.add(new Pregunta("¿En qué año llegó el hombre a la luna?","1961",2,"1900","1492","1968","1961"));
        preguntas.add(new Pregunta("¿Cuál es la comida más vendida en restaurantes?","Patatas fritas",2,"Hamburguesa","Hotdog","Pizza","Patatas fritas"));
        preguntas.add(new Pregunta("¿En qué año asesinaron a JFK?","1963",2,"1972","1894","1966","1963"));
        preguntas.add(new Pregunta("¿A qué profundidad ha llegado el hombre?","10300",2,"3256","2450","5200","10300"));
        preguntas.add(new Pregunta("¿Dónde está el lugar más profundo del océano?","La fosa de las Marianas",3,"La fosa de las Marianas","Las tres piedras","El océano Índico","Mare nostrum"));
        preguntas.add(new Pregunta("¿En qué circuito ganó Alonso su primer campeonato de F1?","Interlagos",3));
        preguntas.add(new Pregunta("¿Cómo se llama la mascota favorita de Obama?","Sunny",3,"Sunny","Cassy","Pressy","Ussy"));
        preguntas.add(new Pregunta("¿En qué año se derribo el muro de Berlín?","1989",3,"1980","1960","1989","1456"));
        preguntas.add(new Pregunta("¿Cuánto es 1589 en binario?","11000110101",3,"00101011","11000110101","1101011","010"));
    }
    public String toString(){
        String resultado="Listado de preguntas:";
        
        for(int ind=0;ind<preguntas.size();ind++){
            resultado+="\n"+preguntas.get(ind);
        }
        return preguntas.toString();
    }
}
