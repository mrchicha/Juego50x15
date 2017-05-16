package juego50x15;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author make
 */
public class NumeroNoValidoException extends Exception{
    
    NumeroNoValidoException(){
        
    }
    
    public String toString(){
        return "Número no válido, introduzca numero entre 1 y 3"; 
    }
}
