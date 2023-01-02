/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package scrable;

/**
 *
 * @author dimanans
 */
public class Screen_1 extends javax.swing.JFrame {

    /**
     * Creates new form Screen_1
     */
    public Screen_1() {
        initComponents();
        setTitle("Добре Дошли");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlScreen_1 = new javax.swing.JPanel();
        pnlWelcome = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        pnl2players = new javax.swing.JPanel();
        btn2Players = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlScreen_1.setBackground(new java.awt.Color(209, 188, 226));
        pnlScreen_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        pnlScreen_1.setPreferredSize(new java.awt.Dimension(500, 632));

        pnlWelcome.setBackground(new java.awt.Color(209, 188, 226));
        pnlWelcome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        lblWelcome.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Добре дошли!");

        javax.swing.GroupLayout pnlWelcomeLayout = new javax.swing.GroupLayout(pnlWelcome);
        pnlWelcome.setLayout(pnlWelcomeLayout);
        pnlWelcomeLayout.setHorizontalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pnlWelcomeLayout.setVerticalGroup(
            pnlWelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWelcomeLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblWelcome)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pnl2players.setBackground(new java.awt.Color(209, 188, 226));

        btn2Players.setBackground(new java.awt.Color(137, 102, 163));
        btn2Players.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btn2Players.setText("Начало на нова игра");
        btn2Players.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btn2Players.setBorderPainted(false);
        btn2Players.setPreferredSize(new java.awt.Dimension(400, 200));
        btn2Players.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2PlayersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl2playersLayout = new javax.swing.GroupLayout(pnl2players);
        pnl2players.setLayout(pnl2playersLayout);
        pnl2playersLayout.setHorizontalGroup(
            pnl2playersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn2Players, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );
        pnl2playersLayout.setVerticalGroup(
            pnl2playersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl2playersLayout.createSequentialGroup()
                .addComponent(btn2Players, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlScreen_1Layout = new javax.swing.GroupLayout(pnlScreen_1);
        pnlScreen_1.setLayout(pnlScreen_1Layout);
        pnlScreen_1Layout.setHorizontalGroup(
            pnlScreen_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlScreen_1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlScreen_1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(pnl2players, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlScreen_1Layout.setVerticalGroup(
            pnlScreen_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlScreen_1Layout.createSequentialGroup()
                .addComponent(pnlWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(pnl2players, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlScreen_1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlScreen_1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn2PlayersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2PlayersActionPerformed
        this.dispose();
        new Screen2_2().setVisible(true);
    }//GEN-LAST:event_btn2PlayersActionPerformed

    
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
            java.util.logging.Logger.getLogger(Screen_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn2Players;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel pnl2players;
    private javax.swing.JPanel pnlScreen_1;
    private javax.swing.JPanel pnlWelcome;
    // End of variables declaration//GEN-END:variables
}
