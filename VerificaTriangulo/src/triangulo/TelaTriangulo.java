/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

/**
 *
 * @author Gustavo Nogueira
 */
public class TelaTriangulo extends javax.swing.JFrame {

    /**
     * Creates new form TelaTriangulo
     */
    public TelaTriangulo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sldrA = new javax.swing.JSlider();
        lblValorA = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sldrB = new javax.swing.JSlider();
        lblValorB = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sldrC = new javax.swing.JSlider();
        lblValorC = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        lblFormaTriangulo = new javax.swing.JLabel();
        lblTipoTriangulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Verificador de Triângulo");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Segmento A:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        sldrA.setPaintTicks(true);
        sldrA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sldrA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldrAStateChanged(evt);
            }
        });
        getContentPane().add(sldrA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        lblValorA.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        lblValorA.setText("50");
        getContentPane().add(lblValorA, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 30, 20));

        jLabel2.setText("Segmento B:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        sldrB.setPaintTicks(true);
        sldrB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sldrB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldrBStateChanged(evt);
            }
        });
        getContentPane().add(sldrB, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        lblValorB.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        lblValorB.setText("50");
        getContentPane().add(lblValorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 30, 20));

        jLabel3.setText("Segmento C:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        sldrC.setPaintTicks(true);
        sldrC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sldrC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldrCStateChanged(evt);
            }
        });
        getContentPane().add(sldrC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        lblValorC.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        lblValorC.setText("50");
        getContentPane().add(lblValorC, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 30, 20));

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 80, 30));

        lblFormaTriangulo.setText("jLabel4");
        getContentPane().add(lblFormaTriangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        lblTipoTriangulo.setText("jLabel4");
        getContentPane().add(lblTipoTriangulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // declaração de variáveis
        int a = sldrA.getValue();
        int b = sldrB.getValue();
        int c = sldrC.getValue();
        boolean triangulo;
        
        // condições para verficar se é um triângulo
        if((Math.abs(a-b) < c) && (a+b > c))            // |a-b| < c < a+b
            if((Math.abs(b-c) < a) && (b+c > a))        // |b-c| < a < b+c
                if((Math.abs(a-c) < b) && (a+c > b))    // |a-c| < b < a+c
                    triangulo = true;
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void sldrAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldrAStateChanged
        lblValorA.setText(Integer.toString(sldrA.getValue()));
    }//GEN-LAST:event_sldrAStateChanged

    private void sldrBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldrBStateChanged
        lblValorB.setText(Integer.toString(sldrB.getValue()));
    }//GEN-LAST:event_sldrBStateChanged

    private void sldrCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldrCStateChanged
        lblValorC.setText(Integer.toString(sldrC.getValue()));
    }//GEN-LAST:event_sldrCStateChanged

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
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTriangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblFormaTriangulo;
    private javax.swing.JLabel lblTipoTriangulo;
    private javax.swing.JLabel lblValorA;
    private javax.swing.JLabel lblValorB;
    private javax.swing.JLabel lblValorC;
    private javax.swing.JSlider sldrA;
    private javax.swing.JSlider sldrB;
    private javax.swing.JSlider sldrC;
    // End of variables declaration//GEN-END:variables
}
