/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego50x15;

import java.lang.reflect.Array;

/**
 *
 * @author make
 */
public class Pregunta {
    public String pregunta,respuesta1,respuesta2,respuesta3,respuesta4,solucion;
    public Array respuestas; 
    public int nivel;
    
    Pregunta(String pregunta,String respuesta1,String respuesta2,String respuesta3,String respuesta4,String solucion, int nivel ){
        this.pregunta=pregunta;
        this.respuesta1=respuesta1;
        this.respuesta2=respuesta2;
        this.respuesta3=respuesta3;
        this.respuesta4=respuesta4;
        this.solucion=solucion;
        this.nivel=nivel;
    }
    
    public String toString(){
        
        return "\n"+pregunta;
    }
}
