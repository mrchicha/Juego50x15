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
    private String pregunta,solucion;
    private String[] respuestas=new String[4]; 
    private int nivel;
    
    Pregunta(String pregunta,String solucion, int nivel, String... respuestas){
        this.pregunta=pregunta;
        this.respuestas=respuestas;
        this.solucion=solucion;
        this.nivel=nivel;
    }
    

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    public void setRespuestas(String[] respuestas) {
        this.respuestas = respuestas;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    

    public String getPregunta() {
        return pregunta;
    }

    public String getSolucion() {
        return solucion;
    }

    public String[] getRespuestas() {
        return respuestas;
    }

    public int getNivel() {
        return nivel;
    }
    
    
    public String toString(){
        
        return "\n"+pregunta;
    }
}
