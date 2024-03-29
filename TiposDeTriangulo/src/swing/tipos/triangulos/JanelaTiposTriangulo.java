/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.tipos.triangulos;

/**
 *
 * @author andre
 */
public class JanelaTiposTriangulo extends javax.swing.JFrame {

    /**
     * Creates new form JanelaTiposTriangulo
     */
    public JanelaTiposTriangulo() {
        initComponents();
        painelResult.setVisible(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        segmentoA = new javax.swing.JSlider();
        segmentoB = new javax.swing.JSlider();
        segmentoC = new javax.swing.JSlider();
        lblTriangulo = new javax.swing.JLabel();
        painelResult = new javax.swing.JPanel();
        lblTipo = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JButton();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Segmento");

        jLabel2.setText("Segmento");

        jLabel3.setText("Segmento");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("a");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("b");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("c");

        segmentoA.setMaximum(20);
        segmentoA.setValue(0);
        segmentoA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                segmentoAStateChanged(evt);
            }
        });

        segmentoB.setMaximum(20);
        segmentoB.setValue(0);
        segmentoB.setAlignmentX(0.0F);
        segmentoB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                segmentoBStateChanged(evt);
            }
        });

        segmentoC.setMaximum(20);
        segmentoC.setValue(0);
        segmentoC.setAlignmentX(0.0F);
        segmentoC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                segmentoCStateChanged(evt);
            }
        });

        lblTriangulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTriangulo.setForeground(new java.awt.Color(102, 102, 255));
        lblTriangulo.setText("Forma um Triângulo?");

        lblTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 51, 51));
        lblTipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTipo.setText("Tipo");

        javax.swing.GroupLayout painelResultLayout = new javax.swing.GroupLayout(painelResult);
        painelResult.setLayout(painelResultLayout);
        painelResultLayout.setHorizontalGroup(
            painelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelResultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelResultLayout.setVerticalGroup(
            painelResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelResultLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTipo)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnVerificar.setText("Verificar");
        btnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerificarActionPerformed(evt);
            }
        });

        lblA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblA.setForeground(new java.awt.Color(153, 153, 153));
        lblA.setText("0");

        lblB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblB.setForeground(new java.awt.Color(153, 153, 153));
        lblB.setText("0");

        lblC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblC.setForeground(new java.awt.Color(153, 153, 153));
        lblC.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(segmentoA, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblA))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(segmentoB, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblB))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(segmentoC, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblC))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnVerificar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTriangulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(painelResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(segmentoA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4))
                            .addComponent(lblA, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5))
                            .addComponent(segmentoB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblB, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6))
                    .addComponent(segmentoC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblC, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37)
                .addComponent(btnVerificar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTriangulo)
                .addGap(28, 28, 28)
                .addComponent(painelResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerificarActionPerformed
        // TODO add your handling code here:
        painelResult.setVisible(true);
        //pegando os valores de cada lado
        int a = segmentoA.getValue();
        int b = segmentoB.getValue();
        int c = segmentoC.getValue();
        
        //verifica se forma um triângulo
        if (a<b+c && b<a+c && c<a+b) {
            lblTriangulo.setText("Forma um Triângulo");
            if (a == b && b == c) { 
                //verificando se o triângulo é Isóceles
                lblTipo.setText("Equilátero");
                
            } else if (a != b && b != c && a != c) {    
                //verificando se o triângulo é Equilátero
                lblTipo.setText("Escaleno");
                
            } else {     
                //verificando se o triângulo é Escaleno
                lblTipo.setText("Isósceles");
                
            }
        } else {
            lblTriangulo.setText("Não forma um Triângulo");
            lblTipo.setText("---");
        }
    
    }//GEN-LAST:event_btnVerificarActionPerformed

    private void segmentoAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_segmentoAStateChanged
        // TODO add your handling code here:
        //Alterando o valor do label
        lblA.setText(Integer.toString(segmentoA.getValue()));
    }//GEN-LAST:event_segmentoAStateChanged

    private void segmentoBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_segmentoBStateChanged
        // TODO add your handling code here:
        //Alterando o valor do label
        lblB.setText(Integer.toString(segmentoB.getValue()));
    }//GEN-LAST:event_segmentoBStateChanged

    private void segmentoCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_segmentoCStateChanged
        // TODO add your handling code here:
        //Alterando o valor do label
        lblC.setText(Integer.toString(segmentoC.getValue()));
    }//GEN-LAST:event_segmentoCStateChanged

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
            java.util.logging.Logger.getLogger(JanelaTiposTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaTiposTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaTiposTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaTiposTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaTiposTriangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTriangulo;
    private javax.swing.JPanel painelResult;
    private javax.swing.JSlider segmentoA;
    private javax.swing.JSlider segmentoB;
    private javax.swing.JSlider segmentoC;
    // End of variables declaration//GEN-END:variables
}
