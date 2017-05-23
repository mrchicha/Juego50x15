/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego50x15;

/**
 *
 * @author make
 */
public class ElegirRespuestaException extends Exception{
    
    ElegirRespuestaException(){
        
    }
    public String toString(){
        return "Debe elegir al menos una respuesta";
    }
    
}
