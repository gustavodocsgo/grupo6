package br.edu.ifmt.tga.notasmvc.view;

import br.edu.ifmt.tga.notasmvc.NotasMVC;
import br.edu.ifmt.tga.notasmvc.controller.Controller;
import br.edu.ifmt.tga.notasmvc.model.Model;
import javax.swing.text.View;

    public class ViewMain extends javax.swing.JFrame {
        
    NotasMVC na = new NotasMVC();
    Model m = new Model();
    Controller c = new Controller(m);
    int novaConta;
         
    public ViewMain() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfCalcText = new javax.swing.JTextField();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jb8 = new javax.swing.JButton();
        jb9 = new javax.swing.JButton();
        jb0 = new javax.swing.JButton();
        jbPonto = new javax.swing.JButton();
        jbSomar = new javax.swing.JButton();
        jbSubtrair = new javax.swing.JButton();
        jbMultiplicar = new javax.swing.JButton();
        jbDividir = new javax.swing.JButton();
        jbBim = new javax.swing.JButton();
        jbAnual = new javax.swing.JButton();
        jbBackSpace = new javax.swing.JButton();
        jbIgual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtfCalcText.setFont(new java.awt.Font("Calculator", 1, 48)); // NOI18N
        jtfCalcText.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtfCalcText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCalcTextActionPerformed(evt);
            }
        });

        jb1.setFont(new java.awt.Font("Calculator", 1, 18)); // NOI18N
        jb1.setText("1");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jb2.setFont(new java.awt.Font("Calculator", 1, 18)); // NOI18N
        jb2.setText("2");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jb3.setFont(new java.awt.Font("Calculator", 1, 18)); // NOI18N
        jb3.setText("3");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });

        jb4.setFont(new java.awt.Font("Calculator", 1, 18)); // NOI18N
        jb4.setText("4");
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });

        jb5.setFont(new java.awt.Font("Calculator", 1, 18)); // NOI18N
        jb5.setText("5");
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });

        jb6.setFont(new java.awt.Font("Calculator", 1, 18)); // NOI18N
        jb6.setText("6");
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });

        jb7.setFont(new java.awt.Font("Calculator", 1, 18)); // NOI18N
        jb7.setText("7");
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });

        jb8.setFont(new java.awt.Font("Calculator", 1, 18)); // NOI18N
        jb8.setText("8");
        jb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb8ActionPerformed(evt);
            }
        });

        jb9.setFont(new java.awt.Font("Calculator", 1, 18)); // NOI18N
        jb9.setText("9");
        jb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb9ActionPerformed(evt);
            }
        });

        jb0.setFont(new java.awt.Font("Calculator", 1, 18)); // NOI18N
        jb0.setText("0");
        jb0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb0ActionPerformed(evt);
            }
        });

        jbPonto.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jbPonto.setText("•");
        jbPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPontoActionPerformed(evt);
            }
        });

        jbSomar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbSomar.setText("+");
        jbSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSomarActionPerformed(evt);
            }
        });

        jbSubtrair.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbSubtrair.setText("-");
        jbSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSubtrairActionPerformed(evt);
            }
        });

        jbMultiplicar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbMultiplicar.setText("x");
        jbMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMultiplicarActionPerformed(evt);
            }
        });

        jbDividir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jbDividir.setText("÷");
        jbDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDividirActionPerformed(evt);
            }
        });

        jbBim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbBim.setText("CALCULAR MÉDIA BIMESTRAL");
        jbBim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBimActionPerformed(evt);
            }
        });

        jbAnual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbAnual.setText("CALCULAR MÉDIA ANUAL");
        jbAnual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnualActionPerformed(evt);
            }
        });

        jbBackSpace.setFont(new java.awt.Font("Calculator", 1, 18)); // NOI18N
        jbBackSpace.setText("C");
        jbBackSpace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBackSpaceActionPerformed(evt);
            }
        });

        jbIgual.setFont(new java.awt.Font("Calculator", 1, 18)); // NOI18N
        jbIgual.setText("=");
        jbIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAnual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfCalcText, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jb2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                    .addComponent(jb0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbBackSpace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jbMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jbDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfCalcText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBackSpace, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbBim, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAnual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBimActionPerformed
        setVisible(false);
        na.bimestral();
    }//GEN-LAST:event_jbBimActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        if(novaConta == 1){
            jtfCalcText.setText("");
            String valor = jtfCalcText.getText();
            jtfCalcText.setText(valor + "2");
            novaConta = 0;
        }else{
        
        String valor = jtfCalcText.getText();
        jtfCalcText.setText(valor + "2");
    }         
    }//GEN-LAST:event_jb2ActionPerformed

    private void jbAnualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnualActionPerformed
        setVisible(false);
        na.anual();
        
    }//GEN-LAST:event_jbAnualActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        if(novaConta == 1){
            jtfCalcText.setText("");
            String valor = jtfCalcText.getText();
            jtfCalcText.setText(valor + "1");
            novaConta = 0;
        }else{
        
        String valor = jtfCalcText.getText();
        jtfCalcText.setText(valor + "1");
    }//GEN-LAST:event_jb1ActionPerformed
    }
    private void jtfCalcTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCalcTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCalcTextActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        if(novaConta == 1){
            jtfCalcText.setText("");
            String valor = jtfCalcText.getText();
            jtfCalcText.setText(valor + "3");
            novaConta = 0;
        }else{
        String valor = jtfCalcText.getText();
        jtfCalcText.setText(valor + "3");
        }
    }//GEN-LAST:event_jb3ActionPerformed

    private void jbPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPontoActionPerformed
        if(novaConta == 1){
            jtfCalcText.setText("");
            String valor = jtfCalcText.getText();
            jtfCalcText.setText(valor + ".");
            novaConta = 0;
        }else{
        
        String valor = jtfCalcText.getText();
        jtfCalcText.setText(valor + ".");
    }
    }//GEN-LAST:event_jbPontoActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
        if(novaConta == 1){
            jtfCalcText.setText("");
            String valor = jtfCalcText.getText();
            jtfCalcText.setText(valor + "4");
            novaConta = 0;
        }else{
        
        String valor = jtfCalcText.getText();
        jtfCalcText.setText(valor + "4");
    }
    }//GEN-LAST:event_jb4ActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
        if(novaConta == 1){
            jtfCalcText.setText("");
            String valor = jtfCalcText.getText();
            jtfCalcText.setText(valor + "5");
            novaConta = 0;
        }else{
        
        String valor = jtfCalcText.getText();
        jtfCalcText.setText(valor + "5");
    }
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
        if(novaConta == 1){
            jtfCalcText.setText("");
            String valor = jtfCalcText.getText();
            jtfCalcText.setText(valor + "6");
            novaConta = 0;
        }else{
        
        String valor = jtfCalcText.getText();
        jtfCalcText.setText(valor + "6");
    }
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
        if(novaConta == 1){
            jtfCalcText.setText("");
            String valor = jtfCalcText.getText();
            jtfCalcText.setText(valor + "7");
            novaConta = 0;
        }else{
        
        String valor = jtfCalcText.getText();
        jtfCalcText.setText(valor + "7");
    }
    }//GEN-LAST:event_jb7ActionPerformed

    private void jb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb8ActionPerformed
        if(novaConta == 1){
            jtfCalcText.setText("");
            String valor = jtfCalcText.getText();
            jtfCalcText.setText(valor + "8");
            novaConta = 0;
        }else{
        
        String valor = jtfCalcText.getText();
        jtfCalcText.setText(valor + "8");
    }
    }//GEN-LAST:event_jb8ActionPerformed

    private void jb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb9ActionPerformed
        if(novaConta == 1){
            jtfCalcText.setText("");
            String valor = jtfCalcText.getText();
            jtfCalcText.setText(valor + "9");
            novaConta = 0;
        }else{        
        String valor = jtfCalcText.getText();
        jtfCalcText.setText(valor + "9");
    }
    }//GEN-LAST:event_jb9ActionPerformed

    private void jb0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb0ActionPerformed
        if(novaConta == 1){
            jtfCalcText.setText("");
            String valor= jtfCalcText.getText();
            jtfCalcText.setText(valor + "0");
            novaConta = 0;
        }else{
        
        String valor = jtfCalcText.getText();
        jtfCalcText.setText(valor + "0");
    }
    }//GEN-LAST:event_jb0ActionPerformed

    private void jbBackSpaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBackSpaceActionPerformed
        jtfCalcText.setText("");
    }//GEN-LAST:event_jbBackSpaceActionPerformed

    private void jbSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSomarActionPerformed
        c.enviar1(jtfCalcText.getText(), 1);
        jtfCalcText.setText("");
    }//GEN-LAST:event_jbSomarActionPerformed

    private void jbIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIgualActionPerformed
        if(novaConta == 1){}
        else{
        c.enviar2(jtfCalcText.getText());
        jtfCalcText.setText(Double.toString(m.resultado()));
        c.enviar2(jtfCalcText.getText());
        novaConta = 1;
    }//GEN-LAST:event_jbIgualActionPerformed
    }
    private void jbSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSubtrairActionPerformed
        c.enviar1(jtfCalcText.getText(), 2);
        jtfCalcText.setText("");
    }//GEN-LAST:event_jbSubtrairActionPerformed

    private void jbMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMultiplicarActionPerformed
        c.enviar1(jtfCalcText.getText(), 3);
        jtfCalcText.setText("");
    }//GEN-LAST:event_jbMultiplicarActionPerformed

    private void jbDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDividirActionPerformed
        c.enviar1(jtfCalcText.getText(), 4);
        jtfCalcText.setText("");
    }//GEN-LAST:event_jbDividirActionPerformed
    
    public static void main(String args[]) {
     
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
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jb0;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JButton jb8;
    private javax.swing.JButton jb9;
    private javax.swing.JButton jbAnual;
    private javax.swing.JButton jbBackSpace;
    private javax.swing.JButton jbBim;
    private javax.swing.JButton jbDividir;
    private javax.swing.JButton jbIgual;
    private javax.swing.JButton jbMultiplicar;
    private javax.swing.JButton jbPonto;
    private javax.swing.JButton jbSomar;
    private javax.swing.JButton jbSubtrair;
    private javax.swing.JTextField jtfCalcText;
    // End of variables declaration//GEN-END:variables
}
