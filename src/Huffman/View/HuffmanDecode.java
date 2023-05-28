/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Huffman.View;

import java.awt.Color;

/**
 *
 * @author malith
 */
public class HuffmanDecode extends javax.swing.JFrame {

    /**
     * Creates new form HuffmanDecode
     */
    public HuffmanDecode() {
        initComponents();
        this.setTitle("Huffman String Decode Game");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEncodeToStringCheck = new fitos_games.LableRound();
        txtEncodeToStringAnswer = new javax.swing.JTextField();
        lblEncodeValue = new javax.swing.JLabel();
        btnEncodeToStringSeeAnswer = new fitos_games.LableRound();
        btnExit = new fitos_games.LableRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnEncodeToStringCheck.setBackground(new java.awt.Color(153, 153, 255));
        btnEncodeToStringCheck.setForeground(new java.awt.Color(255, 255, 255));
        btnEncodeToStringCheck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEncodeToStringCheck.setText("Check");
        btnEncodeToStringCheck.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEncodeToStringCheck.setRoundBottomLeft(60);
        btnEncodeToStringCheck.setRoundBottomRight(60);
        btnEncodeToStringCheck.setRoundTopLeft(60);
        btnEncodeToStringCheck.setRoundTopRight(60);
        btnEncodeToStringCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEncodeToStringCheckMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEncodeToStringCheckMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEncodeToStringCheckMouseExited(evt);
            }
        });

        txtEncodeToStringAnswer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtEncodeToStringAnswer.setForeground(new java.awt.Color(0, 0, 0));
        txtEncodeToStringAnswer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEncodeToStringAnswer.setText("Enter Your Answer");
        txtEncodeToStringAnswer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtEncodeToStringAnswer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEncodeToStringAnswerMouseClicked(evt);
            }
        });
        txtEncodeToStringAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEncodeToStringAnswerActionPerformed(evt);
            }
        });

        lblEncodeValue.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblEncodeValue.setForeground(new java.awt.Color(0, 0, 0));
        lblEncodeValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEncodeValue.setText("Value");
        lblEncodeValue.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnEncodeToStringSeeAnswer.setBackground(new java.awt.Color(102, 255, 102));
        btnEncodeToStringSeeAnswer.setForeground(new java.awt.Color(255, 255, 255));
        btnEncodeToStringSeeAnswer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEncodeToStringSeeAnswer.setText("See Answer");
        btnEncodeToStringSeeAnswer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEncodeToStringSeeAnswer.setPreferredSize(new java.awt.Dimension(1000, 32));
        btnEncodeToStringSeeAnswer.setRoundBottomLeft(60);
        btnEncodeToStringSeeAnswer.setRoundBottomRight(60);
        btnEncodeToStringSeeAnswer.setRoundTopLeft(60);
        btnEncodeToStringSeeAnswer.setRoundTopRight(60);
        btnEncodeToStringSeeAnswer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEncodeToStringSeeAnswerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEncodeToStringSeeAnswerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEncodeToStringSeeAnswerMouseExited(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 51, 0));
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("Exit");
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExit.setRoundBottomLeft(60);
        btnExit.setRoundBottomRight(60);
        btnExit.setRoundTopLeft(60);
        btnExit.setRoundTopRight(60);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEncodeValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEncodeToStringAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEncodeToStringSeeAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(btnEncodeToStringCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEncodeValue, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncodeToStringSeeAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEncodeToStringAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEncodeToStringCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncodeToStringCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncodeToStringCheckMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnEncodeToStringCheckMouseClicked

    private void btnEncodeToStringCheckMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncodeToStringCheckMouseEntered
        // TODO add your handling code here:
        btnEncodeToStringCheck.setBackground(Color.white);
        btnEncodeToStringCheck.setForeground(Color.decode("#9999FF"));
    }//GEN-LAST:event_btnEncodeToStringCheckMouseEntered

    private void btnEncodeToStringCheckMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncodeToStringCheckMouseExited
        // TODO add your handling code here:
        btnEncodeToStringCheck.setBackground(Color.decode("#9999FF"));
        btnEncodeToStringCheck.setForeground(Color.white);
    }//GEN-LAST:event_btnEncodeToStringCheckMouseExited

    private void txtEncodeToStringAnswerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEncodeToStringAnswerMouseClicked
        // TODO add your handling code here:
        txtEncodeToStringAnswer.setText("");

    }//GEN-LAST:event_txtEncodeToStringAnswerMouseClicked

    private void txtEncodeToStringAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEncodeToStringAnswerActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtEncodeToStringAnswerActionPerformed

    private void btnEncodeToStringSeeAnswerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncodeToStringSeeAnswerMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnEncodeToStringSeeAnswerMouseClicked

    private void btnEncodeToStringSeeAnswerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncodeToStringSeeAnswerMouseEntered
        // TODO add your handling code here:
        btnEncodeToStringSeeAnswer.setBackground(Color.white);
        btnEncodeToStringSeeAnswer.setForeground(Color.decode("#66FF66"));
    }//GEN-LAST:event_btnEncodeToStringSeeAnswerMouseEntered

    private void btnEncodeToStringSeeAnswerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncodeToStringSeeAnswerMouseExited
        // TODO add your handling code here:
        btnEncodeToStringSeeAnswer.setBackground(Color.decode("#66FF66"));
        btnEncodeToStringSeeAnswer.setForeground(Color.white);
    }//GEN-LAST:event_btnEncodeToStringSeeAnswerMouseExited

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
        HuffmanMenu hufman = new HuffmanMenu();
        hufman.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        // TODO add your handling code here:
        btnExit.setBackground(Color.white);
        btnExit.setForeground(Color.decode("#FF3300"));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        // TODO add your handling code here:
        btnExit.setBackground(Color.decode("#FF3300"));
        btnExit.setForeground(Color.white);
    }//GEN-LAST:event_btnExitMouseExited

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
            java.util.logging.Logger.getLogger(HuffmanDecode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HuffmanDecode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HuffmanDecode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HuffmanDecode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HuffmanDecode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private fitos_games.LableRound btnEncodeToStringCheck;
    private fitos_games.LableRound btnEncodeToStringSeeAnswer;
    private fitos_games.LableRound btnExit;
    private javax.swing.JLabel lblEncodeValue;
    private javax.swing.JTextField txtEncodeToStringAnswer;
    // End of variables declaration//GEN-END:variables
}
