
package scrable;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;

public class Screen3 extends javax.swing.JFrame {
    private JPanel [][]pnlArr = new JPanel[15][15];
        
    public void arr(){
        for(int i=0; i<15; i++){
            for(int j=0; j<15; j++){
                pnlArr[i][j] = new JPanel();
                add(pnlArr[i][j]);
                pnlArr[i][j].setBounds(10 + j * (getHeight() / 15 - 3 + 3),
                        10 + i * (getHeight() / 15 - 3 + 3),
                        getHeight() / 15 - 3, 
                        getHeight() / 15 - 3);
                if (i == 7 && j == 7)
                {
                    pnlArr[7][7].setBackground(new Color (209,188,226)); // purple
                }
                else if ((i>=1 && i<=4 || i==7 || i>=10 && i<=13) 
                        && (i==j || (i + j) == 14)){
                    pnlArr[i][j].setBackground(Color.pink);
                }
                else if (((i == 0 || i == 7 || i == 14)
                        && (j == 0 || j == 7 || j == 14))){
                    pnlArr[i][j].setBackground(new Color(184, 15, 10)); // crimson red 
                }
                else if (((i == 1 || i == 5 || i == 9 || i == 13) 
                        && (j == 1 || j == 5 || j == 9 || j == 13)))
                {
                    pnlArr[i][j].setBackground(Color.blue);
                }
                else if ((i == 2 || i == 6 || i == 8 || i == 12) && 
                        (j == 2 || j == 6 || j == 8 || j == 12)){
                    pnlArr[i][j].setBackground(new Color(173, 216, 230)); // sky blue
                }
                else if ((i == 3 || i == 11) && (j == 0 || j == 7 || j == 14))
                {
                    pnlArr[i][j].setBackground(new Color(173, 216, 230)); // sky blue
                }
                else if ((i == 0 || i == 7 || i == 14) && (j == 3 || j == 11))
                {
                    pnlArr[i][j].setBackground(new Color(173, 216, 230)); // sky blue
                }
                else
                {
                    pnlArr[i][j].setBackground(new Color(8,144,0)); // dark green
                }
            }
        }
    }
    
    public Screen3() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        btnLegend.setVisible(false);
        arr();
        setTitle("Скрабъл");
        pnlPlayer1.setVisible(false);
        pnlPlayer2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFull = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        btnLegend = new javax.swing.JButton();
        pnlPlayer1 = new javax.swing.JPanel();
        lblName1 = new javax.swing.JLabel();
        lblPoints1 = new javax.swing.JLabel();
        btnPlayer1_1 = new javax.swing.JButton();
        btnPlayer1_2 = new javax.swing.JButton();
        btnPlayer1_3 = new javax.swing.JButton();
        btnPlayer1_4 = new javax.swing.JButton();
        btnPlayer1_5 = new javax.swing.JButton();
        btnPlayer1_6 = new javax.swing.JButton();
        btnPlayer1_7 = new javax.swing.JButton();
        btnReady1 = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        btnNewLetters1 = new javax.swing.JButton();
        pnlPlayer2 = new javax.swing.JPanel();
        lblName2 = new javax.swing.JLabel();
        lblPoints2 = new javax.swing.JLabel();
        btnPlayer2_1 = new javax.swing.JButton();
        btnPlayer2_2 = new javax.swing.JButton();
        btnPlayer2_3 = new javax.swing.JButton();
        btnPlayer2_4 = new javax.swing.JButton();
        btnPlayer2_5 = new javax.swing.JButton();
        btnPlayer2_6 = new javax.swing.JButton();
        btnPlayer2_7 = new javax.swing.JButton();
        btnReady2 = new javax.swing.JButton();
        btnBack2 = new javax.swing.JButton();
        btnNewLetters2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(24, 77, 31));
        setPreferredSize(new java.awt.Dimension(1200, 700));

        pnlFull.setBackground(new java.awt.Color(27, 77, 31));
        pnlFull.setPreferredSize(new java.awt.Dimension(700, 1200));

        btnStart.setBackground(new java.awt.Color(12, 91, 20));
        btnStart.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnStart.setText("Начало");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnLegend.setBackground(new java.awt.Color(12, 91, 20));
        btnLegend.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLegend.setText("?");
        btnLegend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLegendActionPerformed(evt);
            }
        });

        pnlPlayer1.setBackground(new java.awt.Color(27, 77, 31));
        pnlPlayer1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        lblName1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        lblName1.setForeground(new java.awt.Color(204, 204, 204));
        lblName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName1.setText("Играч 1");

        lblPoints1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        lblPoints1.setForeground(new java.awt.Color(204, 204, 204));
        lblPoints1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPoints1.setText("0");

        btnPlayer1_1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer1_1.setText("А");
        btnPlayer1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer1_1ActionPerformed(evt);
            }
        });

        btnPlayer1_2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer1_2.setText("Б");

        btnPlayer1_3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer1_3.setText("В");

        btnPlayer1_4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer1_4.setText("Г");

        btnPlayer1_5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer1_5.setText("Д");

        btnPlayer1_6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer1_6.setText("Е");

        btnPlayer1_7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer1_7.setText("Ж");

        btnReady1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnReady1.setText("Готов");

        btnBack1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack1.setText("Назад");

        btnNewLetters1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnNewLetters1.setText("Нови Букви");
        btnNewLetters1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewLetters1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPlayer1Layout = new javax.swing.GroupLayout(pnlPlayer1);
        pnlPlayer1.setLayout(pnlPlayer1Layout);
        pnlPlayer1Layout.setHorizontalGroup(
            pnlPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayer1Layout.createSequentialGroup()
                .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPoints1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlPlayer1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnPlayer1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlayer1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlayer1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlayer1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlayer1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlayer1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlayer1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPlayer1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNewLetters1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReady1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        pnlPlayer1Layout.setVerticalGroup(
            pnlPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayer1Layout.createSequentialGroup()
                .addGroup(pnlPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblPoints1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblName1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(pnlPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlayer1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlayer1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlayer1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlayer1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlayer1_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlayer1_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlayer1_7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(pnlPlayer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnBack1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnReady1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnNewLetters1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnPlayer1_4.getAccessibleContext().setAccessibleName("btnPlayer1_4");

        pnlPlayer2.setBackground(new java.awt.Color(27, 77, 31));
        pnlPlayer2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        lblName2.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        lblName2.setForeground(new java.awt.Color(204, 204, 204));
        lblName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName2.setText("Играч 2");

        lblPoints2.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        lblPoints2.setForeground(new java.awt.Color(204, 204, 204));
        lblPoints2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPoints2.setText("0");

        btnPlayer2_1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer2_1.setText("А");
        btnPlayer2_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer2_1ActionPerformed(evt);
            }
        });

        btnPlayer2_2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer2_2.setText("Б");

        btnPlayer2_3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer2_3.setText("В");

        btnPlayer2_4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer2_4.setText("Г");

        btnPlayer2_5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer2_5.setText("Д");

        btnPlayer2_6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer2_6.setText("Е");

        btnPlayer2_7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer2_7.setText("Ж");

        btnReady2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnReady2.setText("Готов");

        btnBack2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack2.setText("Назад");

        btnNewLetters2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnNewLetters2.setText("Нови Букви");
        btnNewLetters2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewLetters2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPlayer2Layout = new javax.swing.GroupLayout(pnlPlayer2);
        pnlPlayer2.setLayout(pnlPlayer2Layout);
        pnlPlayer2Layout.setHorizontalGroup(
            pnlPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayer2Layout.createSequentialGroup()
                .addComponent(lblName2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPoints2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlPlayer2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(btnPlayer2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlayer2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlayer2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlayer2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlayer2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlayer2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlayer2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPlayer2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNewLetters2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReady2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        pnlPlayer2Layout.setVerticalGroup(
            pnlPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayer2Layout.createSequentialGroup()
                .addGroup(pnlPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblPoints2, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(lblName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(pnlPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlayer2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlayer2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlayer2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlayer2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlayer2_5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlayer2_6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlayer2_7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(pnlPlayer2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnBack2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnReady2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnNewLetters2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlFullLayout = new javax.swing.GroupLayout(pnlFull);
        pnlFull.setLayout(pnlFullLayout);
        pnlFullLayout.setHorizontalGroup(
            pnlFullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFullLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlFullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLegend, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnStart, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFullLayout.createSequentialGroup()
                .addContainerGap(570, Short.MAX_VALUE)
                .addGroup(pnlFullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlPlayer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );
        pnlFullLayout.setVerticalGroup(
            pnlFullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFullLayout.createSequentialGroup()
                .addComponent(btnLegend)
                .addGap(43, 43, 43)
                .addComponent(pnlPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(pnlPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnStart))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFull, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFull, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        
        for (int i = 0; i < 15; ++i)
        {
            for (int j = 0; j < 15; ++j)
            {
                pnlArr[i][j].repaint();
            }
        }
        btnStart.setVisible(false);
        btnLegend.setVisible(true);
        pnlPlayer1.setVisible(true);
        pnlPlayer2.setVisible(true);
        
        /// wirting points for letters
        
        /// button 1 points label
        {
            int x = (int)btnPlayer1_1.getLocation().getX();
            int y = (int)btnPlayer1_1.getLocation().getY();
            JLabel letPoints = new JLabel();
            pnlPlayer1.add(letPoints);
            letPoints.setBounds(x + 30, y - 60, 100, 100);
            Font f = new Font("Times New Roman", Font.BOLD, 12);
            letPoints.setFont(f);
            letPoints.setForeground(new Color(204, 204, 204));
            letPoints.setText(getLetterPoints(btnPlayer1_1.getText()));
            letPoints.setVisible(true);
        }
        /// button 2 points label
        {
            int x = (int)btnPlayer1_2.getLocation().getX();
            int y = (int)btnPlayer1_2.getLocation().getY();
            JLabel letPoints = new JLabel();
            pnlPlayer1.add(letPoints);
            letPoints.setBounds(x + 30, y - 60, 100, 100);
            Font f = new Font("Times New Roman", Font.BOLD, 12);
            letPoints.setFont(f);
            letPoints.setForeground(new Color(204, 204, 204));
            letPoints.setText(getLetterPoints(btnPlayer1_2.getText()));
            letPoints.setVisible(true);
        }
        /// button 3 points label
        {
            int x = (int)btnPlayer1_3.getLocation().getX();
            int y = (int)btnPlayer1_3.getLocation().getY();
            JLabel letPoints = new JLabel();
            pnlPlayer1.add(letPoints);
            letPoints.setBounds(x + 30, y - 60, 100, 100);
            Font f = new Font("Times New Roman", Font.BOLD, 12);
            letPoints.setFont(f);
            letPoints.setForeground(new Color(204, 204, 204));
            letPoints.setText(getLetterPoints(btnPlayer1_3.getText()));
            letPoints.setVisible(true);
        }
        /// button 4 points label
        {
            int x = (int)btnPlayer1_4.getLocation().getX();
            int y = (int)btnPlayer1_4.getLocation().getY();
            JLabel letPoints = new JLabel();
            pnlPlayer1.add(letPoints);
            letPoints.setBounds(x + 30, y - 60, 100, 100);
            Font f = new Font("Times New Roman", Font.BOLD, 12);
            letPoints.setFont(f);
            letPoints.setForeground(new Color(204, 204, 204));
            letPoints.setText(getLetterPoints(btnPlayer1_4.getText()));
            letPoints.setVisible(true);
        }
        /// button 5 points label
        {
            int x = (int)btnPlayer1_5.getLocation().getX();
            int y = (int)btnPlayer1_5.getLocation().getY();
            JLabel letPoints = new JLabel();
            pnlPlayer1.add(letPoints);
            letPoints.setBounds(x + 30, y - 60, 100, 100);
            Font f = new Font("Times New Roman", Font.BOLD, 12);
            letPoints.setFont(f);
            letPoints.setForeground(new Color(204, 204, 204));
            letPoints.setText(getLetterPoints(btnPlayer1_5.getText()));
            letPoints.setVisible(true);
        }
        /// button 6 points label
        {
            int x = (int)btnPlayer1_6.getLocation().getX();
            int y = (int)btnPlayer1_6.getLocation().getY();
            JLabel letPoints = new JLabel();
            pnlPlayer1.add(letPoints);
            letPoints.setBounds(x + 30, y - 60, 100, 100);
            Font f = new Font("Times New Roman", Font.BOLD, 12);
            letPoints.setFont(f);
            letPoints.setForeground(new Color(204, 204, 204));
            letPoints.setText(getLetterPoints(btnPlayer1_6.getText()));
            letPoints.setVisible(true);
        }
        /// button 7 points label
        {
            int x = (int)btnPlayer1_7.getLocation().getX();
            int y = (int)btnPlayer1_7.getLocation().getY();
            JLabel letPoints = new JLabel();
            pnlPlayer1.add(letPoints);
            letPoints.setBounds(x + 30, y - 60, 100, 100);
            Font f = new Font("Times New Roman", Font.BOLD, 12);
            letPoints.setFont(f);
            letPoints.setForeground(new Color(204, 204, 204));
            letPoints.setText(getLetterPoints(btnPlayer1_7.getText()));
            letPoints.setVisible(true);
        }
        /// button 2.1 points label
        {
            int x = (int)btnPlayer2_1.getLocation().getX();
            int y = (int)btnPlayer2_1.getLocation().getY();
            JLabel letPoints = new JLabel();
            pnlPlayer2.add(letPoints);
            letPoints.setBounds(x + 30, y - 60, 100, 100);
            Font f = new Font("Times New Roman", Font.BOLD, 12);
            letPoints.setFont(f);
            letPoints.setForeground(new Color(204, 204, 204));
            letPoints.setText(getLetterPoints(btnPlayer2_1.getText()));
            letPoints.setVisible(true);
        }
        /// button 2.2 points label
        {
            int x = (int)btnPlayer2_2.getLocation().getX();
            int y = (int)btnPlayer2_2.getLocation().getY();
            JLabel letPoints = new JLabel();
            pnlPlayer2.add(letPoints);
            letPoints.setBounds(x + 30, y - 60, 100, 100);
            Font f = new Font("Times New Roman", Font.BOLD, 12);
            letPoints.setFont(f);
            letPoints.setForeground(new Color(204, 204, 204));
            letPoints.setText(getLetterPoints(btnPlayer2_2.getText()));
            letPoints.setVisible(true);
        }
        /// button 2.3 points label
        {
            int x = (int)btnPlayer2_3.getLocation().getX();
            int y = (int)btnPlayer2_3.getLocation().getY();
            JLabel letPoints = new JLabel();
            pnlPlayer2.add(letPoints);
            letPoints.setBounds(x + 30, y - 60, 100, 100);
            Font f = new Font("Times New Roman", Font.BOLD, 12);
            letPoints.setFont(f);
            letPoints.setForeground(new Color(204, 204, 204));
            letPoints.setText(getLetterPoints(btnPlayer2_3.getText()));
            letPoints.setVisible(true);
        }
        /// button 2.4 points label
        {
            int x = (int)btnPlayer2_4.getLocation().getX();
            int y = (int)btnPlayer2_4.getLocation().getY();
            JLabel letPoints = new JLabel();
            pnlPlayer2.add(letPoints);
            letPoints.setBounds(x + 30, y - 60, 100, 100);
            Font f = new Font("Times New Roman", Font.BOLD, 12);
            letPoints.setFont(f);
            letPoints.setForeground(new Color(204, 204, 204));
            letPoints.setText(getLetterPoints(btnPlayer2_4.getText()));
            letPoints.setVisible(true);
        }
        /// button 2.5 points label
        {
            int x = (int)btnPlayer2_5.getLocation().getX();
            int y = (int)btnPlayer2_5.getLocation().getY();
            JLabel letPoints = new JLabel();
            pnlPlayer2.add(letPoints);
            letPoints.setBounds(x + 30, y - 60, 100, 100);
            Font f = new Font("Times New Roman", Font.BOLD, 12);
            letPoints.setFont(f);
            letPoints.setForeground(new Color(204, 204, 204));
            letPoints.setText(getLetterPoints(btnPlayer2_5.getText()));
            letPoints.setVisible(true);
        }
        /// button 2.6 points label
        {
            int x = (int)btnPlayer2_6.getLocation().getX();
            int y = (int)btnPlayer2_6.getLocation().getY();
            JLabel letPoints = new JLabel();
            pnlPlayer2.add(letPoints);
            letPoints.setBounds(x + 30, y - 60, 100, 100);
            Font f = new Font("Times New Roman", Font.BOLD, 12);
            letPoints.setFont(f);
            letPoints.setForeground(new Color(204, 204, 204));
            letPoints.setText(getLetterPoints(btnPlayer2_6.getText()));
            letPoints.setVisible(true);
        }
        /// button 2.7 points label
        {
            int x = (int)btnPlayer2_7.getLocation().getX();
            int y = (int)btnPlayer2_7.getLocation().getY();
            JLabel letPoints = new JLabel();
            pnlPlayer2.add(letPoints);
            letPoints.setBounds(x + 30, y - 60, 100, 100);
            Font f = new Font("Times New Roman", Font.BOLD, 12);
            letPoints.setFont(f);
            letPoints.setForeground(new Color(204, 204, 204));
            letPoints.setText(getLetterPoints(btnPlayer2_7.getText()));
            letPoints.setVisible(true);
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnLegendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLegendActionPerformed
        new ScreenLegend().setVisible(true);
    }//GEN-LAST:event_btnLegendActionPerformed

    private void btnPlayer1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer1_1ActionPerformed

    }//GEN-LAST:event_btnPlayer1_1ActionPerformed

    private void btnNewLetters1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewLetters1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewLetters1ActionPerformed

    private void btnPlayer2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer2_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPlayer2_1ActionPerformed

    private void btnNewLetters2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewLetters2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewLetters2ActionPerformed

    private String getLetterPoints(String letter)
    {
        String ans = "";
        switch (letter)
        {
            case "А":
                ans += 1;
                break;
            case "Б":
                ans += 2;
                break;
            case "В":
                ans += 2;
                break;
            case "Г":
                ans += 3;
                break;
            case "Д":
                ans += 2;
                break;
            case "Е":
                ans += 1;
                break;
            case "Ж":
                ans += 4;
                break;
            case "З":
                ans += 4;
                break;
            case "И":
                ans += 1;
                break;
            case "Й":
                ans += 5;
                break;
            case "К":
                ans += 2;
                break;
            case "Л":
                ans += 2;
                break;
            case "М":
                ans += 2;
                break;
            case "Н":
                ans += 1;
                break;
            case "О":
                ans += 1;
                break;
            case "П":
                ans += 1;
                break;
            case "Р":
                ans += 1;
                break;
            case "С":
                ans += 1;
                break;
            case "Т":
                ans += 1;
                break;
            case "У":
                ans += 5;
                break;
            case "Ф":
                ans += 10;
                break;
            case "Х":
                ans += 5;
                break;
            case "Ц":
                ans += 8;
                break;
            case "Ч":
                ans += 5;
                break;
            case "Ш":
                ans += 8;
                break;
            case "Щ":
                ans += 10;
                break;
            case "Ъ":
                ans += 3;
                break;
            case "ь":
                ans += 10;
                break;
            case "Ю":
                ans += 8;
                break;
            case "Я":
                ans += 5;
                break;         
        }
        return ans;
    }
    
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
            java.util.logging.Logger.getLogger(Screen3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnLegend;
    private javax.swing.JButton btnNewLetters1;
    private javax.swing.JButton btnNewLetters2;
    private javax.swing.JButton btnPlayer1_1;
    private javax.swing.JButton btnPlayer1_2;
    private javax.swing.JButton btnPlayer1_3;
    private javax.swing.JButton btnPlayer1_4;
    private javax.swing.JButton btnPlayer1_5;
    private javax.swing.JButton btnPlayer1_6;
    private javax.swing.JButton btnPlayer1_7;
    private javax.swing.JButton btnPlayer2_1;
    private javax.swing.JButton btnPlayer2_2;
    private javax.swing.JButton btnPlayer2_3;
    private javax.swing.JButton btnPlayer2_4;
    private javax.swing.JButton btnPlayer2_5;
    private javax.swing.JButton btnPlayer2_6;
    private javax.swing.JButton btnPlayer2_7;
    private javax.swing.JButton btnReady1;
    private javax.swing.JButton btnReady2;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblPoints1;
    private javax.swing.JLabel lblPoints2;
    private javax.swing.JPanel pnlFull;
    private javax.swing.JPanel pnlPlayer1;
    private javax.swing.JPanel pnlPlayer2;
    // End of variables declaration//GEN-END:variables
}
