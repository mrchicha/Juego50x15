/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego50x15;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author make
 */


public class Cronometro extends Thread{
    private boolean activo=true;
    private JLabel crono;
    //static int t;
    private JFramePrincipal jframePrincipal;
    private PnJugar panelJugar;
    private int respuesta, cont;
    
    Cronometro(JFramePrincipal jframePrincipal,PnJugar panelJugar,JLabel crono){
        this.crono=crono;
        this.jframePrincipal=jframePrincipal;
        this.panelJugar=panelJugar;
        
    }
    
    public void run() {
       
       for (cont=5;cont>=0;cont--){
           
           crono.setText(""+cont);
           
           try {
               this.sleep(1000);
               
           } catch (InterruptedException ex) {}
           
           if(cont<=10)crono.setForeground(Color.red);
           else crono.setForeground(Color.black);
           if (cont==0){
               
                JOptionPane.showMessageDialog(panelJugar,"Fin de tiempo, Has perdido"); 
                
                jframePrincipal.getContentPane().removeAll();
                
                
                respuesta =JOptionPane.showConfirmDialog(panelJugar, "¿Desea volver a jugar? Pulse cancelar para salir...");
                if(respuesta == JOptionPane.YES_OPTION)panelJugar.volverJugar();
                if(respuesta == JOptionPane.NO_OPTION)panelJugar.volverMenu();
                if(respuesta == JOptionPane.CANCEL_OPTION) System.exit(0);
                
                jframePrincipal.validate();
                jframePrincipal.repaint();
               
               
           }
       }
       
    }
    
    public void reset(){
        cont=30;
        
    }
    
        
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}
