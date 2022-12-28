package scrable;
public class Screen2_2 extends javax.swing.JFrame {

    
    /**
     * Creates new form Screen_2
     */
    public Screen2_2() {
        initComponents();
        lblWarning1.setVisible(false);
        lblWarning2.setVisible(false);
        setTitle("Вход");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlScreen2_2 = new javax.swing.JPanel();
        pnlPlayer1 = new javax.swing.JPanel();
        lblPlayer1 = new javax.swing.JLabel();
        txtPlayer1Name = new javax.swing.JTextField();
        btnOk1 = new javax.swing.JButton();
        lblWarning1 = new javax.swing.JLabel();
        lblInstruction = new javax.swing.JLabel();
        pnlPlayer2 = new javax.swing.JPanel();
        lblPlayer2Name = new javax.swing.JLabel();
        txtPlayer2Name = new javax.swing.JTextField();
        btnOk2 = new javax.swing.JButton();
        lblWarning2 = new javax.swing.JLabel();
        btnContinue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlScreen2_2.setBackground(new java.awt.Color(209, 188, 226));
        pnlScreen2_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        pnlPlayer1.setBackground(new java.awt.Color(209, 188, 226));
        pnlPlayer1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        lblPlayer1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblPlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayer1.setText("Играч 1");
        lblPlayer1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtPlayer1Name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        btnOk1.setBackground(new java.awt.Color(137, 102, 163));
        btnOk1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnOk1.setText("ОК");
        btnOk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOk1ActionPerformed(evt);
            }
        });

        lblWarning1.setForeground(new java.awt.Color(255, 51, 51));
        lblWarning1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWarning1.setText("Не могат да се използват символите: /, @, ~, _ , -, $.");

        javax.swing.GroupLayout pnlPlayer1Layout = new javax.swing.GroupLayout(pnlPlayer1);
        pnlPlayer1.setLayout(pnlPlayer1Layout);
        pnlPlayer1Layout.setHorizontalGroup(
            pnlPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayer1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(btnOk1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPlayer1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPlayer1Name)
                    .addComponent(lblPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                    .addComponent(lblWarning1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        pnlPlayer1Layout.setVerticalGroup(
            pnlPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayer1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPlayer1Name, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWarning1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btnOk1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        lblInstruction.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        lblInstruction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInstruction.setText("Моля въведете потребителските си имена в полетата по-долу."); // NOI18N
        lblInstruction.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        pnlPlayer2.setBackground(new java.awt.Color(209, 188, 226));
        pnlPlayer2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        pnlPlayer2.setPreferredSize(new java.awt.Dimension(363, 400));

        lblPlayer2Name.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblPlayer2Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayer2Name.setText("Играч 2");
        lblPlayer2Name.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtPlayer2Name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtPlayer2Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlayer2NameActionPerformed(evt);
            }
        });

        btnOk2.setBackground(new java.awt.Color(137, 102, 163));
        btnOk2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnOk2.setText("ОК");
        btnOk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOk2ActionPerformed(evt);
            }
        });

        lblWarning2.setForeground(new java.awt.Color(255, 51, 51));
        lblWarning2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWarning2.setText("Не могат да се използват символите: /, @, ~, _ , -, $.");

        javax.swing.GroupLayout pnlPlayer2Layout = new javax.swing.GroupLayout(pnlPlayer2);
        pnlPlayer2.setLayout(pnlPlayer2Layout);
        pnlPlayer2Layout.setHorizontalGroup(
            pnlPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayer2Layout.createSequentialGroup()
                .addGroup(pnlPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPlayer2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnOk2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPlayer2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(pnlPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWarning2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPlayer2Name)
                                .addComponent(lblPlayer2Name, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlPlayer2Layout.setVerticalGroup(
            pnlPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayer2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblPlayer2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPlayer2Name, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWarning2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(btnOk2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        btnContinue.setBackground(new java.awt.Color(137, 102, 163));
        btnContinue.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnContinue.setText("Продължи");
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlScreen2_2Layout = new javax.swing.GroupLayout(pnlScreen2_2);
        pnlScreen2_2.setLayout(pnlScreen2_2Layout);
        pnlScreen2_2Layout.setHorizontalGroup(
            pnlScreen2_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlScreen2_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlScreen2_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInstruction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlScreen2_2Layout.createSequentialGroup()
                        .addComponent(pnlPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(pnlPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlScreen2_2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        pnlScreen2_2Layout.setVerticalGroup(
            pnlScreen2_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlScreen2_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInstruction, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlScreen2_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPlayer2, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnContinue, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlScreen2_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlScreen2_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlayer2NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlayer2NameActionPerformed
        
        
    }//GEN-LAST:event_txtPlayer2NameActionPerformed

    private void btnOk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOk1ActionPerformed
        if (!Screen2.setUsername(txtPlayer1Name.getText()))
        {
            lblWarning1.setVisible(true);
        }
        else
        {
            txtPlayer1Name.enable(false);
            btnOk1.setVisible(false);
        }
    }//GEN-LAST:event_btnOk1ActionPerformed

    private void btnOk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOk2ActionPerformed
        if (!Screen2.setUsername(txtPlayer2Name.getText()))
        {
            lblWarning1.setVisible(true);
        }
        else
        {
            txtPlayer2Name.enable(false);
            btnOk2.setVisible(false);
        }
    }//GEN-LAST:event_btnOk2ActionPerformed

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
       dispose();
       Screen2 OBJ=new Screen2();
               
            OBJ.importUsername(txtPlayer1Name.getText() + "\n" + txtPlayer2Name.getText() + "\n");
       new Screen3().setVisible(true);
    }//GEN-LAST:event_btnContinueActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void Run() {
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
            java.util.logging.Logger.getLogger(Screen2_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen2_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen2_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen2_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen2_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnOk1;
    private javax.swing.JButton btnOk2;
    private javax.swing.JLabel lblInstruction;
    private javax.swing.JLabel lblPlayer1;
    private javax.swing.JLabel lblPlayer2Name;
    private javax.swing.JLabel lblWarning1;
    private javax.swing.JLabel lblWarning2;
    private javax.swing.JPanel pnlPlayer1;
    private javax.swing.JPanel pnlPlayer2;
    private javax.swing.JPanel pnlScreen2_2;
    private javax.swing.JTextField txtPlayer1Name;
    private javax.swing.JTextField txtPlayer2Name;
    // End of variables declaration//GEN-END:variables
}
