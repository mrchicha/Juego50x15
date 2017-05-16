/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego50x15;

import java.awt.BorderLayout;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author make
 */
public class PnModificarPregunta extends javax.swing.JPanel {

    /**
     * Creates new form PnIntroPregunta
     */
    private JFramePrincipal jframePrincipal;
    private PnIntroducirPreguntas panelIntroducirPregunta;
    private Pregunta nuevaPregunta;
    private int indicePregunta;
    
    public PnModificarPregunta(JFramePrincipal jframePrincipal) {
        this.jframePrincipal=jframePrincipal;
        jframePrincipal.getContentPane().removeAll();
        initComponents();
        
        preguntasNoVisibles();
        
        btnModificar.setEnabled(false);
               
        this.setVisible(true);
        this.setSize(800,600);
        
        jframePrincipal.add(this);
        this.validate();
        
    }

        
    public void rellenoListaPreguntas(GestionPregunta grupoPreguntas){
        
        for(int ind=0;ind<grupoPreguntas.preguntas.size();ind++){
            jComboBox1.addItem(grupoPreguntas.preguntas.get(ind).toString());
        } 
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtRespuestaA = new javax.swing.JTextField();
        jtRespuestaC = new javax.swing.JTextField();
        jtPregunta = new javax.swing.JTextField();
        jtRespuestaB = new javax.swing.JTextField();
        jtRespuestaD = new javax.swing.JTextField();
        jtRespuestaSol = new javax.swing.JTextField();
        jtRespuestaNivel = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 204));

        jLabel2.setText("Elija una pregunta de la lista:");

        jComboBox1.setBackground(new java.awt.Color(0, 255, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(0, 255, 204));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(0, 255, 204));
        btnSalir.setText("Cancelar");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setText("Pregunta:");

        jLabel3.setText("Respuesta A:");

        jLabel4.setText("Respuesta B:");

        jLabel5.setText("Respuesta C:");

        jLabel6.setText("Respuesta D:");

        jLabel7.setText("Solución:");

        jLabel8.setText("Nivel:");

        jtRespuestaA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtRespuestaAActionPerformed(evt);
            }
        });

        jtRespuestaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtRespuestaCActionPerformed(evt);
            }
        });

        jtPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPreguntaActionPerformed(evt);
            }
        });

        jtRespuestaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtRespuestaDActionPerformed(evt);
            }
        });

        jtRespuestaSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtRespuestaSolActionPerformed(evt);
            }
        });

        jtRespuestaNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtRespuestaNivelActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 255, 204));
        jButton2.setText("Elegir pregunta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtRespuestaD, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtRespuestaC, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtRespuestaNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtRespuestaSol, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                            .addComponent(jtRespuestaB)
                                            .addComponent(jtRespuestaA))))
                                .addGap(58, 58, 58))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)))
                        .addComponent(jButton2)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtRespuestaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtRespuestaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jtRespuestaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtRespuestaD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtRespuestaSol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(jLabel8)
                    .addComponent(jtRespuestaNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int nivel=Integer.parseInt( jtRespuestaNivel.getText());
        if(nivel>0 && nivel<=3){
        
        nuevaPregunta=new Pregunta( jtPregunta.getText(),jtRespuestaA.getText(),jtRespuestaB.getText(),jtRespuestaC.getText(),jtRespuestaD.getText(),jtRespuestaSol.getText(),nivel);
        
        jframePrincipal.getGrupoPreguntas().preguntas.remove(indicePregunta);
        jframePrincipal.getGrupoPreguntas().preguntas.add(indicePregunta,nuevaPregunta);
        
        preguntasNoVisibles();
        btnModificar.setEnabled(false);
        }
        else{
            try {
                throw new NumeroNoValidoException();
            } catch (NumeroNoValidoException ex) {
                JOptionPane.showMessageDialog(jframePrincipal, ex, "Error en nivel", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jtRespuestaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtRespuestaCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtRespuestaCActionPerformed

    private void jtRespuestaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtRespuestaDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtRespuestaDActionPerformed

    private void jtRespuestaSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtRespuestaSolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtRespuestaSolActionPerformed

    private void jtRespuestaNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtRespuestaNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtRespuestaNivelActionPerformed

    private void jtPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPreguntaActionPerformed

    private void jtRespuestaAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtRespuestaAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtRespuestaAActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        indicePregunta=jComboBox1.getSelectedIndex();
       
        preguntasVisibles();
              
        btnModificar.setEnabled(true);
        
        jtPregunta.setText(jframePrincipal.getGrupoPreguntas().preguntas.get(indicePregunta).pregunta.toString());
        jtRespuestaA.setText(jframePrincipal.getGrupoPreguntas().preguntas.get(indicePregunta).respuesta1.toString());
        jtRespuestaB.setText(jframePrincipal.getGrupoPreguntas().preguntas.get(indicePregunta).respuesta2.toString());
        jtRespuestaC.setText(jframePrincipal.getGrupoPreguntas().preguntas.get(indicePregunta).respuesta3.toString());
        jtRespuestaD.setText(jframePrincipal.getGrupoPreguntas().preguntas.get(indicePregunta).respuesta4.toString());
        jtRespuestaSol.setText(jframePrincipal.getGrupoPreguntas().preguntas.get(indicePregunta).solucion.toString());
               
        jtRespuestaNivel.setText(Integer.toString(jframePrincipal.getGrupoPreguntas().preguntas.get(indicePregunta).nivel));
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        jframePrincipal.getContentPane().removeAll();
        jframePrincipal.validate();
        jframePrincipal.repaint();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jtPregunta;
    private javax.swing.JTextField jtRespuestaA;
    private javax.swing.JTextField jtRespuestaB;
    private javax.swing.JTextField jtRespuestaC;
    private javax.swing.JTextField jtRespuestaD;
    private javax.swing.JTextField jtRespuestaNivel;
    private javax.swing.JTextField jtRespuestaSol;
    // End of variables declaration//GEN-END:variables


    public void preguntasVisibles(){
        jLabel1.setVisible(true);
       jLabel3.setVisible(true);
        jLabel4.setVisible(true);
        jLabel5.setVisible(true);
        jLabel6.setVisible(true);
        jLabel7.setVisible(true);
        jLabel8.setVisible(true);
        
        jtRespuestaA.setVisible(true);
        jtRespuestaC.setVisible(true);
        jtPregunta.setVisible(true);
        jtRespuestaB.setVisible(true);
        jtRespuestaD.setVisible(true);
        jtRespuestaSol.setVisible(true);
        jtRespuestaNivel.setVisible(true);
    }

    public void preguntasNoVisibles(){
  
        jLabel1.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        
        jtRespuestaA.setVisible(false);
        jtRespuestaC.setVisible(false);
        jtPregunta.setVisible(false);
        jtRespuestaB.setVisible(false);
        jtRespuestaD.setVisible(false);
        jtRespuestaSol.setVisible(false);
        jtRespuestaNivel.setVisible(false);
    }
}
