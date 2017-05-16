/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego50x15;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author make
 */
public class PnJugar extends javax.swing.JPanel {

     
    private JFramePrincipal jframePrincipal;
    private Cronometro crono;
    private PnVictoria panelVictoria;

    private int contadorPreguntas=0,contadorDineroAcumulado=0,valorAcumulado=0,indicePreguntas=0,nivel;
    private final int rondaFinal=15;
    private int[] premio={100,500,700,1000,1500,2000,3000,4000,5000,10000,15000,20000,25000,50000,100000};
    private ArrayList<Integer> numGenerados;
    
    
    
    public PnJugar(JFramePrincipal jframePrincipal) {
        initComponents();
       
        this.jframePrincipal=jframePrincipal;
        lblRespuesta.setVisible(false);
        btnSiguientePregunta.setEnabled(false);
        numGenerados=new ArrayList<Integer>();
        //setIconImage(new ImageIcon(getClass().getResource("/imagenes/dinero5.jpg")).getImage());
        btnGroup.add(btnA);
        btnGroup.add(btnB);
        btnGroup.add(btnC);
        btnGroup.add(btnD);
        
        btnComodinPublico.setVisible(false);
        btnComodin50.setVisible(false);
        btnComodinLlamada.setVisible(false);
        
       
       crono=new Cronometro(jframePrincipal,this,lblReloj);
       crono.start();
                  
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgResp = new javax.swing.ButtonGroup();
        btnGroup = new javax.swing.ButtonGroup();
        lblNumPregunta = new javax.swing.JLabel();
        lblPregunta = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblValorAcumulado = new javax.swing.JLabel();
        lblPremioAsegurado = new javax.swing.JLabel();
        lblValorPregunta = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnComodin = new javax.swing.JButton();
        btnSiguientePregunta = new javax.swing.JButton();
        lblRespuesta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblReloj = new javax.swing.JLabel();
        btnComodinLlamada = new javax.swing.JButton();
        btnComodinPublico = new javax.swing.JButton();
        btnComodin50 = new javax.swing.JButton();
        btnB = new javax.swing.JToggleButton();
        btnC = new javax.swing.JToggleButton();
        btnD = new javax.swing.JToggleButton();
        btnA = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(153, 204, 255));

        lblNumPregunta.setText("Nº");

        lblPregunta.setText("Pregunta");

        jLabel3.setText("Valor pregunta");

        lblValorAcumulado.setText("0");

        lblPremioAsegurado.setText("0");

        lblValorPregunta.setText("0");

        jLabel7.setText("Premio asegurado");

        jLabel8.setText("Total acumulado");

        btnAceptar.setBackground(new java.awt.Color(51, 204, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnComodin.setBackground(new java.awt.Color(51, 204, 255));
        btnComodin.setText("Comodín");
        btnComodin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComodinActionPerformed(evt);
            }
        });

        btnSiguientePregunta.setBackground(new java.awt.Color(51, 204, 255));
        btnSiguientePregunta.setText("Siguiente");
        btnSiguientePregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguientePreguntaActionPerformed(evt);
            }
        });

        jLabel1.setText("Tiempo:");

        lblReloj.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N

        btnComodinLlamada.setBackground(new java.awt.Color(51, 204, 255));
        btnComodinLlamada.setText("Llamada");
        btnComodinLlamada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComodinLlamadaActionPerformed(evt);
            }
        });

        btnComodinPublico.setBackground(new java.awt.Color(51, 204, 255));
        btnComodinPublico.setText("Público");
        btnComodinPublico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComodinPublicoActionPerformed(evt);
            }
        });

        btnComodin50.setBackground(new java.awt.Color(51, 204, 255));
        btnComodin50.setText("50%");
        btnComodin50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComodin50ActionPerformed(evt);
            }
        });

        btnB.setText(" ");

        btnC.setText(" ");

        btnD.setText(" ");

        btnA.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValorPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblValorAcumulado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(233, 233, 233))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 77, Short.MAX_VALUE)
                                .addComponent(lblRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(171, 171, 171)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPremioAsegurado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnAceptar, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblNumPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(btnComodin))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblReloj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(11, 11, 11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSiguientePregunta)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnComodinPublico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnComodin50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnComodinLlamada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(61, 61, 61)))))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPremioAsegurado)
                    .addComponent(lblValorPregunta)
                    .addComponent(lblValorAcumulado))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(btnComodinPublico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnComodin50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnComodinLlamada)
                        .addGap(42, 42, 42)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnComodin)
                    .addComponent(btnSiguientePregunta))
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguientePreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguientePreguntaActionPerformed
       
        lblValorAcumulado.setText(valorAsegurado());
        cargarPregunta(jframePrincipal.getGrupoPreguntas());
        btnSiguientePregunta.setEnabled(false);
        
        
        if(lblNumPregunta.getText().equalsIgnoreCase("6"))lblPremioAsegurado.setText(lblValorAcumulado.getText());
        if(lblNumPregunta.getText().equalsIgnoreCase("11"))lblPremioAsegurado.setText(lblValorAcumulado.getText());
        
        //resetea campos cada vez que ejecutamos el evento para generar un panel nuevo
        
        btnGroup.clearSelection();
        btnAceptar.setEnabled(true);
            
       
       //crono.start();
       
    
    }//GEN-LAST:event_btnSiguientePreguntaActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        int respuesta;
       
        if(contadorPreguntas==rondaFinal){
            btnSiguientePregunta.setEnabled(false);
            lblPremioAsegurado.setText(valorAsegurado());
            
            crono.suspend();
            
            panelVictoria=new PnVictoria(this,jframePrincipal);
            panelVictoria.setVisible(true);
            panelVictoria.setSize(800, 600);
            
            jframePrincipal.getContentPane().removeAll();
            jframePrincipal.add(panelVictoria);
            jframePrincipal.validate();
            jframePrincipal.repaint();
            
            
            
        }
        else{
            if((btnA.isSelected() && btnA.getText().equalsIgnoreCase(lblRespuesta.getText())) 
                    || (btnB.isSelected() && btnB.getText().equalsIgnoreCase(lblRespuesta.getText())) 
                    || (btnC.isSelected() && btnC.getText().equalsIgnoreCase(lblRespuesta.getText())) 
                    || (btnD.isSelected() && btnD.getText().equalsIgnoreCase(lblRespuesta.getText())))
                    {
                correcto();
            }

            else{
               JOptionPane.showMessageDialog(this,"No es correcto!!!!"); 
               jframePrincipal.getContentPane().removeAll();

               respuesta =JOptionPane.showConfirmDialog(this, "¿Desea volver a jugar? Pulse cancelar para salir...");
               if(respuesta == JOptionPane.YES_OPTION)volverJugar();
               if(respuesta == JOptionPane.NO_OPTION)volverMenu();
               if(respuesta == JOptionPane.CANCEL_OPTION)System.exit(0);

               jframePrincipal.validate();

            }
            
            btnAceptar.setEnabled(false);     
        }
        
        
         
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnComodinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComodinActionPerformed
        
        btnComodinPublico.setVisible(true);
        btnComodin50.setVisible(true);
        btnComodinLlamada.setVisible(true);
        
    }//GEN-LAST:event_btnComodinActionPerformed

    private void btnComodinPublicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComodinPublicoActionPerformed
        comodines();
        btnComodinPublico.setEnabled(false);
        ocultarComodines();        
    }//GEN-LAST:event_btnComodinPublicoActionPerformed

    private void btnComodin50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComodin50ActionPerformed
        comodines();
        btnComodin50.setEnabled(false);
        ocultarComodines();
    }//GEN-LAST:event_btnComodin50ActionPerformed

    private void btnComodinLlamadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComodinLlamadaActionPerformed
        comodines();
        btnComodinLlamada.setEnabled(false);
        ocultarComodines();
        
    }//GEN-LAST:event_btnComodinLlamadaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgResp;
    private javax.swing.JToggleButton btnA;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JToggleButton btnB;
    private javax.swing.JToggleButton btnC;
    private javax.swing.JButton btnComodin;
    private javax.swing.JButton btnComodin50;
    private javax.swing.JButton btnComodinLlamada;
    private javax.swing.JButton btnComodinPublico;
    private javax.swing.JToggleButton btnD;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnSiguientePregunta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblNumPregunta;
    private javax.swing.JLabel lblPregunta;
    private javax.swing.JLabel lblPremioAsegurado;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lblRespuesta;
    private javax.swing.JLabel lblValorAcumulado;
    private javax.swing.JLabel lblValorPregunta;
    // End of variables declaration//GEN-END:variables

    
    
    //método para cargar una pregunta nueva tras un acierto y pasar de ronda
    public void cargarPregunta(GestionPregunta gestionPreguntas){
        Random aleatorio=new Random();
        int azar;
        contadorPreguntas++;
        azar = numAleatorio();
         
        btnA.setForeground(Color.black);
        btnB.setForeground(Color.black);
        btnC.setForeground(Color.black);
        btnD.setForeground(Color.black);
        
        lblPregunta.setText(jframePrincipal.getGrupoPreguntas().preguntas.get(azar).pregunta);
        btnA.setText(jframePrincipal.getGrupoPreguntas().preguntas.get(azar).respuesta1);
        btnB.setText(jframePrincipal.getGrupoPreguntas().preguntas.get(azar).respuesta2);
        btnC.setText(jframePrincipal.getGrupoPreguntas().preguntas.get(azar).respuesta3);
        btnD.setText(jframePrincipal.getGrupoPreguntas().preguntas.get(azar).respuesta4);
        lblRespuesta.setText(jframePrincipal.getGrupoPreguntas().preguntas.get(azar).solucion);
        
        lblNumPregunta.setText(""+contadorPreguntas);
        lblValorPregunta.setText(""+premio[contadorPreguntas-1]);
              
        if(contadorPreguntas>1)crono.reset();
             
        
    }

    //método para empezar un nuevo juego, reinicia los contodores del jframePrincipal        
    public void volverJugar(){
        jframePrincipal.getContentPane().removeAll();
         
        jframePrincipal.setContadorPreguntas(0);
        jframePrincipal.setContadorDineroAcumulado(0);
        jframePrincipal.setValorAcumulado(0);
        
        jframePrincipal.setPanelJugar(new PnJugar(jframePrincipal));
        
        jframePrincipal.add(jframePrincipal.getPanelJugar(), BorderLayout.CENTER);
        jframePrincipal.getPanelJugar().cargarPregunta(jframePrincipal.getGrupoPreguntas());
        jframePrincipal.getPanelJugar().setVisible(true);
        
        this.validate();
}        
    
    //método para volver el programa al punto de inicio tal y como se inicia
    public void volverMenu(){
       jframePrincipal.getContentPane().removeAll();
        
       jframePrincipal.setPanelInicio(new PnInicio(jframePrincipal));
       jframePrincipal.add(jframePrincipal.getPanelInicio(), BorderLayout.CENTER);
       jframePrincipal.getPanelInicio().setVisible(true);
       jframePrincipal.validate();
       jframePrincipal.repaint();
    }
    
    //genera un número aleatorio sin repetir y comprueba que la pregunta que saldrá se ajusta al nivel de ronda        
    public int numAleatorio(){
        Random aleatorio=new Random();
        int azar;
        boolean encontrada=false;
             
        if(contadorPreguntas <=5) nivel=1;
        if(contadorPreguntas >5 && contadorPreguntas <=10) nivel=2;
        if(contadorPreguntas >10 && contadorPreguntas <=15) nivel=3;
     
        do{
            azar=aleatorio.nextInt(jframePrincipal.getGrupoPreguntas().preguntas.size());
            if(!numGenerados.contains(azar) && jframePrincipal.getGrupoPreguntas().preguntas.get(azar).nivel == nivel)encontrada=true;
        }while(!encontrada);
     
        numGenerados.add(azar);   
        return azar;
    }
    
    //Método para comprobar contestación correcta y que ahs ganado si es correcta la respuesta en la ronda 15
    public void correcto(){
         btnSiguientePregunta.setEnabled(true);

               
    }
   
    public void comodines(){
        int cont=0;
                
        if(!btnA.getText().equalsIgnoreCase(lblRespuesta.getText()) && cont<2){
           cont++;
           btnA.setForeground(Color.red);
          
        }
        if(!btnB.getText().equalsIgnoreCase(lblRespuesta.getText()) && cont<2){
           cont++;
           
           btnB.setForeground(Color.red);
        }
        if(!btnC.getText().equalsIgnoreCase(lblRespuesta.getText()) && cont<2){
           cont++;
           
           btnC.setForeground(Color.red);
        }
        if(!btnD.getText().equalsIgnoreCase(lblRespuesta.getText()) && cont<2){
           cont++;
           
           btnD.setForeground(Color.red);
        }
    }

    public int getContadorPreguntas() {
        return contadorPreguntas;
    }
           
    public void ocultarComodines(){
        btnComodinPublico.setVisible(false);
        btnComodin50.setVisible(false);
        btnComodinLlamada.setVisible(false);
    }
    
    public String valorAsegurado(){
        int valor,acumulado;
        String valorAcumulado;
        
               
        valor=Integer.parseInt(lblValorPregunta.getText());
        acumulado=Integer.parseInt(lblValorAcumulado.getText());
        valorAcumulado=Integer.toString(valor+acumulado);
        
        return valorAcumulado;
    }
    
    
    public Cronometro getCrono() {
        return crono;
    }

    public void setCrono(Cronometro crono) {
        this.crono = crono;
    }
    
    public void setbtnA(String texto){
        btnA.setText(texto);
    }
    public void setbtnB(String texto){
        btnB.setText(texto);
    }
    public void setbtnC(String texto){
        btnC.setText(texto);
    }
    public void setbtnD(String texto){
        btnD.setText(texto);
    }
    public void setlblValorPregunta(String texto){
        lblValorPregunta.setText(texto);
    }
    public void setlbllblValorAcumulado(String texto){
        lblValorAcumulado.setText(texto);
    }
    public void setlblPremioAsegurado(String texto){
        lblPremioAsegurado.setText(texto);
    }
    public void setlblPregunta(String texto){
        lblPregunta.setText(texto);
    }
    public void setlblNumPregunta(String texto){
        lblNumPregunta.setText(texto);
    }
    
    public void setlblRespuesta(String texto){
        lblRespuesta.setText(texto);
    }

    public JLabel getLblPremioAsegurado() {
        return lblPremioAsegurado;
    }

}
