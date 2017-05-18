/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego50x15;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author make
 */
public class PnIntroducirPreguntas extends javax.swing.JPanel {
    
    JFramePrincipal jframePrincipal;
    GestionPregunta grupoPreguntas;
    Pregunta nuevaPregunta;
    
    public PnIntroducirPreguntas(JFramePrincipal jframePrincipal) {
        initComponents();
        this.jframePrincipal=jframePrincipal;
        ctPregunta.setText("");
        ctRespA.setText("");
        ctRespB.setText("");
        ctRespC.setText("");
        ctRespD.setText("");
        ctSolucion.setText("");
        ctNivel.setText("");
        
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ctPregunta = new javax.swing.JTextField();
        ctRespA = new javax.swing.JTextField();
        ctRespB = new javax.swing.JTextField();
        ctRespC = new javax.swing.JTextField();
        ctRespD = new javax.swing.JTextField();
        ctSolucion = new javax.swing.JTextField();
        ctNivel = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setText("Pregunta: ");

        jLabel2.setText("Respuesta A");

        jLabel3.setText("Respuesta B");

        jLabel4.setText("Respuesta C");

        jLabel5.setText("Respuesta D");

        jLabel6.setText("Nivel");

        jLabel7.setText("Solución");

        ctPregunta.setText("jTextField1");

        ctRespA.setText("jTextField1");

        ctRespB.setText("jTextField1");

        ctRespC.setText("jTextField1");

        ctRespD.setText("jTextField1");

        ctSolucion.setText("jTextField1");

        ctNivel.setText("jTextField1");

        btnSalir.setBackground(new java.awt.Color(255, 153, 153));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAceptar.setBackground(new java.awt.Color(255, 153, 153));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctRespA, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctRespB, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctRespC, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctRespD, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctSolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctRespA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctRespB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctRespC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctRespD, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ctSolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnSalir))
                .addGap(58, 58, 58))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        try{       
        preguntaNueva(jframePrincipal.getGrupoPreguntas());
        }catch(NumeroNoValidoException ex){
           JOptionPane.showMessageDialog(jframePrincipal, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }catch(EnBlancoException ex){
             JOptionPane.showMessageDialog(jframePrincipal, ex, "Error", JOptionPane.ERROR_MESSAGE);
         }catch(NumberFormatException ex){
             JOptionPane.showMessageDialog(jframePrincipal, "Nivel debe ser un número", "Error", JOptionPane.ERROR_MESSAGE);
         }
         
             
    }//GEN-LAST:event_btnAceptarActionPerformed

    public void setCtNivel(JTextField ctNivel) {
        this.ctNivel = ctNivel;
    }

    public void setCtPregunta(JTextField ctPregunta) {
        this.ctPregunta = ctPregunta;
    }

    public void setCtRespA(JTextField ctRespA) {
        this.ctRespA = ctRespA;
    }

    public void setCtRespB(JTextField ctRespB) {
        this.ctRespB = ctRespB;
    }

    public void setCtRespC(JTextField ctRespC) {
        this.ctRespC = ctRespC;
    }

    public void setCtRespD(JTextField ctRespD) {
        this.ctRespD = ctRespD;
    }

    public void setCtSolucion(JTextField ctSolucion) {
        this.ctSolucion = ctSolucion;
    }

    public JTextField getCtNivel() {
        return ctNivel;
    }

    public JTextField getCtPregunta() {
        return ctPregunta;
    }

    public JTextField getCtRespA() {
        return ctRespA;
    }

    public JTextField getCtRespB() {
        return ctRespB;
    }

    public JTextField getCtRespC() {
        return ctRespC;
    }

    public JTextField getCtRespD() {
        return ctRespD;
    }

    public JTextField getCtSolucion() {
        return ctSolucion;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        
        jframePrincipal.getContentPane().removeAll();
        
        jframePrincipal.validate();
        jframePrincipal.repaint();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JTextField ctNivel;
    private javax.swing.JTextField ctPregunta;
    private javax.swing.JTextField ctRespA;
    private javax.swing.JTextField ctRespB;
    private javax.swing.JTextField ctRespC;
    private javax.swing.JTextField ctRespD;
    private javax.swing.JTextField ctSolucion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables

public void preguntaNueva(GestionPregunta grupoPreguntas) throws NumberFormatException,NumeroNoValidoException,EnBlancoException{
    
    int nivel=Integer.parseInt(ctNivel.getText());
    
    if(nivel<=0 && nivel>3){
    throw new NumeroNoValidoException();
    }
    else if(ctPregunta.getText().isEmpty() || ctRespA.getText().isEmpty() || ctRespB.getText().isEmpty() || ctRespC.getText().isEmpty() || ctRespD.getText().isEmpty() || ctSolucion.getText().isEmpty()){
        throw new EnBlancoException();
    }
    else{
       
        nuevaPregunta=new Pregunta(ctPregunta.getText(),ctRespA.getText(),ctRespB.getText(),ctRespC.getText(),ctRespD.getText(),ctSolucion.getText(),nivel);
        grupoPreguntas.preguntas.add(nuevaPregunta);
        ctPregunta.setText("");
        ctRespA.setText("");
        ctRespB.setText("");
        ctRespC.setText("");
        ctRespD.setText("");
        ctSolucion.setText("");
        ctNivel.setText("");
    }
}

}
