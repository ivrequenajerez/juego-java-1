/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import trivia.Pregunta;

/**
 *
 * @author ianre
 */
public class rondaDePreguntas extends javax.swing.JFrame {

    /**
     * Creates new form rondaDePreguntas
     */
    
 
    public rondaDePreguntas() {
        initComponents();
        this.setLocationRelativeTo(null); // Interfaz centrada
        // Cargar el archivo de icono
        ImageIcon icono = new ImageIcon("C:/Users/ianre/Web/Trivia/resources/icono.png");
        // Asignar el icono a la ventana principal
        setIconImage(icono.getImage());
        
        //Aqui insertas pregunta
        Pregunta pregunta = new Pregunta("\u00bfQu\u00e9 videojuegos son de estrategia?", respuestas);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoResp = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        fondoPreg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));

        fondoResp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("OPCION");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        fondoResp.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, 60));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("OPCION");
        fondoResp.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 130, 60));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("OPCION");
        fondoResp.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 130, 60));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("OPCION");
        fondoResp.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 130, 60));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setText("OPCION");
        fondoResp.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 130, 60));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("OPCION");
        fondoResp.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 130, 60));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setText("OPCION");
        fondoResp.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 130, 60));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setText("OPCION");
        fondoResp.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 130, 60));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setText("OPCION");
        fondoResp.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 130, 60));

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setText("OPCION");
        fondoResp.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 130, 60));

        jButton11.setBackground(new java.awt.Color(255, 255, 255));
        jButton11.setText("OPCION");
        fondoResp.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 130, 60));

        jButton12.setBackground(new java.awt.Color(255, 255, 255));
        jButton12.setText("OPCION");
        fondoResp.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 130, 60));

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
        jButton13.setText("OPCION");
        fondoResp.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 130, 60));

        jButton14.setBackground(new java.awt.Color(255, 255, 255));
        jButton14.setText("OPCION");
        fondoResp.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 130, 60));

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setText("OPCION");
        fondoResp.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 130, 60));

        jButton16.setBackground(new java.awt.Color(255, 255, 255));
        jButton16.setText("OPCION");
        fondoResp.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 130, 60));

        fondoPreg.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿[PREGUNTA]?");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("[TIMER] 5:00");

        javax.swing.GroupLayout fondoPregLayout = new javax.swing.GroupLayout(fondoPreg);
        fondoPreg.setLayout(fondoPregLayout);
        fondoPregLayout.setHorizontalGroup(
            fondoPregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoPregLayout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        fondoPregLayout.setVerticalGroup(
            fondoPregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoPregLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(fondoPregLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoResp, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addComponent(fondoPreg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoResp, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fondoPreg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(rondaDePreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rondaDePreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rondaDePreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rondaDePreguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rondaDePreguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondoPreg;
    private javax.swing.JPanel fondoResp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
