/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego50x15;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author make
 */
public class JFramePrincipal extends javax.swing.JFrame {
    
    private PnJugar panelJugar;
    private PnListarPreguntas panelListarPreguntas;
    private PnIntroducirPreguntas panelIntoPregunta;
    private PnModificarPregunta panelModificarPregunta;
    private GestionPregunta grupoPreguntas;
    private PnModo panelCambioColor;
    private PnInicio panelInicio;
    private boolean jugando;
    
    private int contadorPreguntas=0,contadorDineroAcumulado=0,valorAcumulado=0,indicePreguntas=0;
    
    
       
    public JFramePrincipal() {
       initComponents();
       
       this.setSize(800, 600);
       this.getContentPane().removeAll();
       this.setLocationRelativeTo(null);
       
       this.OpMenuIntrPregunta.setVisible(false);
       this.OpMenuListarPregunta.setVisible(false);
       this.OpMenuModPregunta.setVisible(false);
       jugando =false;
       grupoPreguntas=new GestionPregunta();
       panelInicio=new PnInicio(this);
       this.add(panelInicio, BorderLayout.CENTER);
       panelInicio.setVisible(true);
      
       this.validate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuBar = new javax.swing.JMenu();
        OpMenuJugar = new javax.swing.JMenuItem();
        OpMenuListarPregunta = new javax.swing.JMenuItem();
        OpMenuIntrPregunta = new javax.swing.JMenuItem();
        OpMenuModPregunta = new javax.swing.JMenuItem();
        OpMenuSalir = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        OpMenuConfiguracion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        MenuBar.setText("Menú");

        OpMenuJugar.setText("Jugar");
        OpMenuJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpMenuJugarActionPerformed(evt);
            }
        });
        MenuBar.add(OpMenuJugar);

        OpMenuListarPregunta.setText("Listar pregunta");
        OpMenuListarPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpMenuListarPreguntaActionPerformed(evt);
            }
        });
        MenuBar.add(OpMenuListarPregunta);

        OpMenuIntrPregunta.setText("Introducir pregunta");
        OpMenuIntrPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpMenuIntrPreguntaActionPerformed(evt);
            }
        });
        MenuBar.add(OpMenuIntrPregunta);

        OpMenuModPregunta.setText("Modificar pregunta");
        OpMenuModPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpMenuModPreguntaActionPerformed(evt);
            }
        });
        MenuBar.add(OpMenuModPregunta);

        OpMenuSalir.setText("Salir");
        OpMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpMenuSalirActionPerformed(evt);
            }
        });
        MenuBar.add(OpMenuSalir);

        jMenuBar1.add(MenuBar);

        jMenu1.setText("Configuración");

        OpMenuConfiguracion.setText("Modo juego");
        OpMenuConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpMenuConfiguracionActionPerformed(evt);
            }
        });
        jMenu1.add(OpMenuConfiguracion);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    //manejador para opción menú jugar
    private void OpMenuJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpMenuJugarActionPerformed
        nuevoJuego();
    
    }//GEN-LAST:event_OpMenuJugarActionPerformed

//manejador para opción menú listar pregunta
    private void OpMenuListarPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpMenuListarPreguntaActionPerformed
       panelListarPreguntas=new  PnListarPreguntas(this);
       this.getContentPane().removeAll();
       this.add(panelListarPreguntas);
       this.validate();
        
    }//GEN-LAST:event_OpMenuListarPreguntaActionPerformed
    
    //manejador para opción menú introducir pregunta, borra todos los paneles y carga uno nuevo tipo introducirPreguntas
    private void OpMenuIntrPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpMenuIntrPreguntaActionPerformed
        
        this.getContentPane().removeAll();
        panelIntoPregunta=new PnIntroducirPreguntas(this);
        this.add(panelIntoPregunta, BorderLayout.CENTER);
        panelIntoPregunta.setVisible(true);
        this.validate();
        
    }//GEN-LAST:event_OpMenuIntrPreguntaActionPerformed
    
    //manejador para la opción de menú salir
    private void OpMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpMenuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_OpMenuSalirActionPerformed
    //manejador modificar pregunta
    private void OpMenuModPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpMenuModPreguntaActionPerformed
        modificarPregunta();
    }//GEN-LAST:event_OpMenuModPreguntaActionPerformed
    //manejador opción configuración
    private void OpMenuConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpMenuConfiguracionActionPerformed
        // TODO add your handling code here:
        this.getContentPane().removeAll();
        panelCambioColor=new PnModo(this);
        this.add(panelCambioColor, BorderLayout.CENTER);
        panelCambioColor.setVisible(true);
        this.validate();
    }//GEN-LAST:event_OpMenuConfiguracionActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuBar;
    private javax.swing.JMenuItem OpMenuConfiguracion;
    private javax.swing.JMenuItem OpMenuIntrPregunta;
    private javax.swing.JMenuItem OpMenuJugar;
    private javax.swing.JMenuItem OpMenuListarPregunta;
    private javax.swing.JMenuItem OpMenuModPregunta;
    private javax.swing.JMenuItem OpMenuSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables


    //métodos personalizados
    public void nuevoJuego(){
     this.getContentPane().removeAll();
        contadorPreguntas=0;
        contadorDineroAcumulado=0;
        valorAcumulado=0;
        
        panelJugar=new PnJugar(this);
        enPartida(false);
        this.add(panelJugar, BorderLayout.CENTER);
        panelJugar.cargarPregunta(grupoPreguntas);
        panelJugar.setVisible(true);
        
        this.validate();
 }
 
    public void enPartida(boolean b){
            OpMenuJugar.setEnabled(b);
            OpMenuIntrPregunta.setEnabled(b);
            OpMenuModPregunta.setEnabled(b);
            OpMenuListarPregunta.setEnabled(b);
            OpMenuConfiguracion.setEnabled(b);
                
    }

    public void modificarPregunta(){
     this.getContentPane().removeAll();
        panelModificarPregunta=new PnModificarPregunta(this);
        this.add(panelModificarPregunta, BorderLayout.CENTER);
        panelModificarPregunta.setVisible(true);
        panelModificarPregunta.rellenoListaPreguntas(grupoPreguntas);
        this.validate();
 }
 
    public void modoJuego(Boolean b){
     
           this.OpMenuIntrPregunta.setVisible(b);
           this.OpMenuListarPregunta.setVisible(b);
           this.OpMenuModPregunta.setVisible(b);
          
    }
 
    //getter and setter
    
    public boolean isJugando() {
        return jugando;
    }

    public void setJugando(boolean jugando) {
        this.jugando = jugando;
    }

    public void setPanelInicio(PnInicio panelInicio) {
        this.panelInicio = panelInicio;
    }

    public PnInicio getPanelInicio() {
        return panelInicio;
    }

    public void setGrupoPreguntas(GestionPregunta grupoPreguntas) {
        this.grupoPreguntas = grupoPreguntas;
    }

    public GestionPregunta getGrupoPreguntas() {
        return grupoPreguntas;
    }
    
    public PnJugar getPanelJugar() {
        return panelJugar;
    }

    public void setPanelJugar(PnJugar panelJugar) {
        this.panelJugar = panelJugar;
    }

    public void setContadorPreguntas(int contadorPreguntas) {
        this.contadorPreguntas = contadorPreguntas;
    }

    public void setContadorDineroAcumulado(int contadorDineroAcumulado) {
        this.contadorDineroAcumulado = contadorDineroAcumulado;
    }

    public void setValorAcumulado(int valorAcumulado) {
        this.valorAcumulado = valorAcumulado;
    }

    public int getContadorPreguntas() {
        return contadorPreguntas;
    }

    public int getContadorDineroAcumulado() {
        return contadorDineroAcumulado;
    }

    public int getValorAcumulado() {
        return valorAcumulado;
    }

}
