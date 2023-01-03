
package scrable;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import javax.swing.border.Border;

public class Screen3 extends javax.swing.JFrame {
    private MyJPanel [][]pnlArr = new MyJPanel[15][15];
    private int currI; // index i of where to write
    private int currJ; // index j of where to write
    private boolean isPanelSelected; // indicates if a panel is selected
    private String[] letters = {"А","А", "А", "А", "А", "А", "А", "А", "А", "Б", "Б", "Б", "В", "В", "В", "В", "Г", "Г", "Г", "Д", "Д", "Д", "Д", "Е", "Е", "Е", "Е", "Е", "Е", "Е", "Е", "Ж", "Ж", "З", "З", "И", "И", "И", "И", "И", "И", "И", "И", "Й", "К", "К", "К", "Л", "Л", "Л", "М", "М", "М", "М", "Н", "Н", "Н", "Н", "О", "О", "О", "О", "О", "О", "О", "О", "О", "П", "П", "П", "П", "Р", "Р", "Р", "Р", "С", "С", "С", "С", "Т", "Т", "Т", "Т", "Т", "У", "У", "У", "Ф", "Х", "Ц", "Ч", "Ч", "Ш", "Щ", "Ъ", "Ъ", "ь", "Ю", "Я", "Я"};
    Random rand = new Random();
    
    public void setCurrI(int currI){
        if(currI>=0 && currI<15){
            this.currI = currI;
        }
    }
    public int getCurrI(){
        return currI;
    }
    
    public void setCurrJ(int currJ){
        if(currJ>=0 && currJ<15){
            this.currJ = currJ;
        }
    }
    public int getCurrJ(){
        return currJ;
    }

    public void setIsPanelSelected(boolean isPanelSelected) {
        this.isPanelSelected = isPanelSelected;
    }
    public boolean getIsPanelSelected() {
        return isPanelSelected;
    }
    
    
    public Screen3() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        arr();
        setTitle("Скрабъл");
        setIsPanelSelected(false);
        enablePlayer1();
        btnPlayer1_agree.setVisible(false);
        btnPlayer2_agree.setVisible(false);
        pnlArr[7][7].setBorder(BorderFactory.createLineBorder(Color.yellow));
        setCurrI(7);
        setCurrJ(7);
        setIsPanelSelected(true);
        lblName1.setText(Screen2_2.getTxtPlayer1Name().getText());
        lblName2.setText(Screen2_2.getTxtPlayer2Name().getText());
        for (int i = 2; i < 9; ++i)
        {
            Component btn = pnlPlayer2.getComponent(i);
            ((JButton)btn).setText(randomLetter());
            removeLetter(((JButton)btn).getText());
            btn = pnlPlayer1.getComponent(i);
            ((JButton)btn).setText(randomLetter());
            removeLetter(((JButton)btn).getText());
        }
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
        btnPlayer1_agree = new javax.swing.JButton();
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
        btnPlayer2_agree = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(24, 77, 31));
        setPreferredSize(new java.awt.Dimension(1200, 700));

        pnlFull.setBackground(new java.awt.Color(27, 77, 31));
        pnlFull.setPreferredSize(new java.awt.Dimension(700, 1200));

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
        btnPlayer1_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer1_2ActionPerformed(evt);
            }
        });

        btnPlayer1_3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer1_3.setText("В");
        btnPlayer1_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer1_3ActionPerformed(evt);
            }
        });

        btnPlayer1_4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer1_4.setText("Г");
        btnPlayer1_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer1_4ActionPerformed(evt);
            }
        });

        btnPlayer1_5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer1_5.setText("Д");
        btnPlayer1_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer1_5ActionPerformed(evt);
            }
        });

        btnPlayer1_6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer1_6.setText("Е");
        btnPlayer1_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer1_6ActionPerformed(evt);
            }
        });

        btnPlayer1_7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer1_7.setText("Ж");
        btnPlayer1_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer1_7ActionPerformed(evt);
            }
        });

        btnReady1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnReady1.setText("Готов");
        btnReady1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReady1ActionPerformed(evt);
            }
        });

        btnBack1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack1.setText("Изтрий");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        btnNewLetters1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnNewLetters1.setText("Нови Букви");
        btnNewLetters1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewLetters1ActionPerformed(evt);
            }
        });

        btnPlayer1_agree.setBackground(new java.awt.Color(255, 204, 204));
        btnPlayer1_agree.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnPlayer1_agree.setForeground(new java.awt.Color(255, 0, 0));
        btnPlayer1_agree.setText("Съгласен");
        btnPlayer1_agree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer1_agreeActionPerformed(evt);
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
                .addGap(14, 14, 14)
                .addComponent(btnPlayer1_agree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNewLetters1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(btnNewLetters1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnPlayer1_agree, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
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
        btnPlayer2_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer2_2ActionPerformed(evt);
            }
        });

        btnPlayer2_3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer2_3.setText("В");
        btnPlayer2_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer2_3ActionPerformed(evt);
            }
        });

        btnPlayer2_4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer2_4.setText("Г");
        btnPlayer2_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer2_4ActionPerformed(evt);
            }
        });

        btnPlayer2_5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer2_5.setText("Д");
        btnPlayer2_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer2_5ActionPerformed(evt);
            }
        });

        btnPlayer2_6.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer2_6.setText("Е");
        btnPlayer2_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer2_6ActionPerformed(evt);
            }
        });

        btnPlayer2_7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btnPlayer2_7.setText("Ж");
        btnPlayer2_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer2_7ActionPerformed(evt);
            }
        });

        btnReady2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnReady2.setText("Готов");
        btnReady2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReady2ActionPerformed(evt);
            }
        });

        btnBack2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack2.setText("Изтрий");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        btnNewLetters2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnNewLetters2.setText("Нови Букви");
        btnNewLetters2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewLetters2ActionPerformed(evt);
            }
        });

        btnPlayer2_agree.setBackground(new java.awt.Color(255, 204, 204));
        btnPlayer2_agree.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnPlayer2_agree.setForeground(new java.awt.Color(255, 0, 0));
        btnPlayer2_agree.setText("Съгласен");
        btnPlayer2_agree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayer2_agreeActionPerformed(evt);
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
                .addGap(14, 14, 14)
                .addComponent(btnPlayer2_agree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNewLetters2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addComponent(btnNewLetters2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnPlayer2_agree, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlFullLayout = new javax.swing.GroupLayout(pnlFull);
        pnlFull.setLayout(pnlFullLayout);
        pnlFullLayout.setHorizontalGroup(
            pnlFullLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFullLayout.createSequentialGroup()
                .addGap(0, 1159, Short.MAX_VALUE)
                .addComponent(btnLegend))
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
                .addContainerGap(126, Short.MAX_VALUE))
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

    public void arr(){
        for(int i=0; i<15; i++){
            for(int j=0; j<15; j++){
                pnlArr[i][j] = new MyJPanel();
                pnlFull.add(pnlArr[i][j]);
                pnlArr[i][j].setBounds(10 + j * (getHeight() / 15 - 3 + 3),
                        10 + i * (getHeight() / 15 - 3 + 3),
                        getHeight() / 15 - 3, 
                        getHeight() / 15 - 3);
                final int kpi = i;
                final int kpj = j;
                pnlArr[i][j].addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent evt)
                    {
                        if (pnlArr[kpi][kpj].getIs_used() && !pnlArr[kpi][kpj].getSameTurn())
                            return;
                        if (getIsPanelSelected())
                            return;
                        setCurrI(kpi);
                        setCurrJ(kpj);
                        pnlArr[kpi][kpj].setBorder(BorderFactory.createLineBorder(Color.yellow));
                        setIsPanelSelected(true);
                    }
                });
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
    
    private void btnLegendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLegendActionPerformed
        new ScreenLegend().setVisible(true);
    }//GEN-LAST:event_btnLegendActionPerformed

    private void btnPlayer1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer1_1ActionPerformed
        int i = getCurrI();
        int j = getCurrJ();
        if (pnlArr[i][j].getComponentCount() != 0) return;
        if (!getIsPanelSelected()) return;
        JLabel txt = new JLabel();
        pnlArr[i][j].add(txt);
        txt.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txt.setText(btnPlayer1_1.getText());
        txt.setVisible(true);
        removeLetter(txt.getText());
        pnlArr[i][j].setBorder(BorderFactory.createEmptyBorder());
        pnlArr[i][j].setIs_used(true);
        pnlArr[i][j].setSameTurn(true);
        setIsPanelSelected(false);
        btnPlayer1_1.setEnabled(false);
        btnNewLetters1.setEnabled(false);
        btnNewLetters2.setEnabled(false);
    }//GEN-LAST:event_btnPlayer1_1ActionPerformed

    private void btnNewLetters1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewLetters1ActionPerformed
        for (int i = 2; i < 9; ++i)
        {
            Component btn = pnlPlayer1.getComponent(i);
            addLetter(((JButton)btn).getText());
            ((JButton)btn).setText(randomLetter());
            removeLetter(((JButton)btn).getText());
        }
        enablePlayer2();
        for (int i = 13; i <= 19; ++i)
        {
            Component pts = pnlPlayer1.getComponent(i);
            Component btn = pnlPlayer1.getComponent(i - 11);
            ((JLabel)pts).setText(getLetterPoints(((JButton)btn).getText()));
        }
    }//GEN-LAST:event_btnNewLetters1ActionPerformed

    private void btnPlayer2_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer2_1ActionPerformed
        int i = getCurrI();
        int j = getCurrJ();
        if (!getIsPanelSelected()) return;
        if (pnlArr[i][j].getComponentCount() != 0) return;
        JLabel txt = new JLabel();
        pnlArr[i][j].add(txt);
        txt.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txt.setText(btnPlayer2_1.getText());
        txt.setVisible(true);
        removeLetter(txt.getText());
        pnlArr[i][j].setBorder(BorderFactory.createEmptyBorder());
        pnlArr[i][j].setIs_used(true);
        pnlArr[i][j].setSameTurn(true);
        setIsPanelSelected(false);
        btnPlayer2_1.setEnabled(false);
        btnNewLetters1.setEnabled(false);
        btnNewLetters2.setEnabled(false);
    }//GEN-LAST:event_btnPlayer2_1ActionPerformed

    private void btnNewLetters2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewLetters2ActionPerformed
        for (int i = 2; i < 9; ++i)
        {
            Component btn = pnlPlayer2.getComponent(i);
            addLetter(((JButton)btn).getText());
            ((JButton)btn).setText(randomLetter());
            removeLetter(((JButton)btn).getText());
        }
        enablePlayer1();
        for (int i = 13; i <= 19; ++i)
        {
            Component pts = pnlPlayer2.getComponent(i);
            Component btn = pnlPlayer2.getComponent(i - 11);
            ((JLabel)pts).setText(getLetterPoints(((JButton)btn).getText()));
        }
    }//GEN-LAST:event_btnNewLetters2ActionPerformed

    private void btnPlayer1_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer1_2ActionPerformed
        int i = getCurrI();
        int j = getCurrJ();
        if (!getIsPanelSelected()) return;
        if (pnlArr[i][j].getComponentCount() != 0) return;
        JLabel txt = new JLabel();
        pnlArr[i][j].add(txt);
        txt.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txt.setText(btnPlayer1_2.getText());
        txt.setVisible(true);
        removeLetter(txt.getText());
        pnlArr[i][j].setBorder(BorderFactory.createEmptyBorder());
        pnlArr[i][j].setIs_used(true);
        pnlArr[i][j].setSameTurn(true);
        setIsPanelSelected(false);
        btnPlayer1_2.setEnabled(false);
        btnNewLetters1.setEnabled(false);
        btnNewLetters2.setEnabled(false);
    }//GEN-LAST:event_btnPlayer1_2ActionPerformed

    private void btnPlayer1_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer1_3ActionPerformed
        int i = getCurrI();
        int j = getCurrJ();
        if (!getIsPanelSelected()) return;
        if (pnlArr[i][j].getComponentCount() != 0) return;
        JLabel txt = new JLabel();
        pnlArr[i][j].add(txt);
        txt.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txt.setText(btnPlayer1_3.getText());
        txt.setVisible(true);
        removeLetter(txt.getText());
        pnlArr[i][j].setBorder(BorderFactory.createEmptyBorder());
        pnlArr[i][j].setIs_used(true);
        pnlArr[i][j].setSameTurn(true);
        setIsPanelSelected(false);
        btnPlayer1_3.setEnabled(false);
        btnNewLetters1.setEnabled(false);
        btnNewLetters2.setEnabled(false);
    }//GEN-LAST:event_btnPlayer1_3ActionPerformed

    private void btnPlayer1_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer1_4ActionPerformed
        int i = getCurrI();
        int j = getCurrJ();
        if (!getIsPanelSelected()) return;
        if (pnlArr[i][j].getComponentCount() != 0) return;
        JLabel txt = new JLabel();
        pnlArr[i][j].add(txt);
        txt.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txt.setText(btnPlayer1_4.getText());
        txt.setVisible(true);
        removeLetter(txt.getText());
        pnlArr[i][j].setBorder(BorderFactory.createEmptyBorder());
        pnlArr[i][j].setIs_used(true);
        pnlArr[i][j].setSameTurn(true);
        setIsPanelSelected(false);
        btnPlayer1_4.setEnabled(false);
        btnNewLetters1.setEnabled(false);
        btnNewLetters2.setEnabled(false);
    }//GEN-LAST:event_btnPlayer1_4ActionPerformed

    private void btnPlayer1_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer1_5ActionPerformed
        int i = getCurrI();
        int j = getCurrJ();
        if (!getIsPanelSelected()) return;
        if (pnlArr[i][j].getComponentCount() != 0) return;
        JLabel txt = new JLabel();
        pnlArr[i][j].add(txt);
        txt.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txt.setText(btnPlayer1_5.getText());
        txt.setVisible(true);
        removeLetter(txt.getText());
        pnlArr[i][j].setBorder(BorderFactory.createEmptyBorder());
        pnlArr[i][j].setIs_used(true);
        pnlArr[i][j].setSameTurn(true);
        setIsPanelSelected(false);
        btnPlayer1_5.setEnabled(false);
        btnNewLetters1.setEnabled(false);
        btnNewLetters2.setEnabled(false);
    }//GEN-LAST:event_btnPlayer1_5ActionPerformed

    private void btnPlayer1_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer1_6ActionPerformed
        int i = getCurrI();
        int j = getCurrJ();
        if (!getIsPanelSelected()) return;
        if (pnlArr[i][j].getComponentCount() != 0) return;
        JLabel txt = new JLabel();
        pnlArr[i][j].add(txt);
        txt.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txt.setText(btnPlayer1_6.getText());
        txt.setVisible(true);
        removeLetter(txt.getText());
        pnlArr[i][j].setBorder(BorderFactory.createEmptyBorder());
        pnlArr[i][j].setIs_used(true);
        pnlArr[i][j].setSameTurn(true);
        setIsPanelSelected(false);
        btnPlayer1_6.setEnabled(false);
        btnNewLetters1.setEnabled(false);
        btnNewLetters2.setEnabled(false);
    }//GEN-LAST:event_btnPlayer1_6ActionPerformed

    private void btnPlayer1_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer1_7ActionPerformed
        int i = getCurrI();
        int j = getCurrJ();
        if (!getIsPanelSelected()) return;
        if (pnlArr[i][j].getComponentCount() != 0) return;
        JLabel txt = new JLabel();
        pnlArr[i][j].add(txt);
        txt.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txt.setText(btnPlayer1_7.getText());
        txt.setVisible(true);
        removeLetter(txt.getText());
        pnlArr[i][j].setBorder(BorderFactory.createEmptyBorder());
        pnlArr[i][j].setIs_used(true);
        pnlArr[i][j].setSameTurn(true);
        setIsPanelSelected(false);
        btnPlayer1_7.setEnabled(false);
        btnNewLetters1.setEnabled(false);
        btnNewLetters2.setEnabled(false);
    }//GEN-LAST:event_btnPlayer1_7ActionPerformed

    private void btnPlayer2_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer2_2ActionPerformed
        int i = getCurrI();
        int j = getCurrJ();
        if (!getIsPanelSelected()) return;
        if (pnlArr[i][j].getComponentCount() != 0) return;
        JLabel txt = new JLabel();
        pnlArr[i][j].add(txt);
        txt.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txt.setText(btnPlayer2_2.getText());
        txt.setVisible(true);
        removeLetter(txt.getText());
        pnlArr[i][j].setBorder(BorderFactory.createEmptyBorder());
        pnlArr[i][j].setIs_used(true);
        pnlArr[i][j].setSameTurn(true);
        setIsPanelSelected(false);
        btnPlayer2_2.setEnabled(false);
        btnNewLetters1.setEnabled(false);
        btnNewLetters2.setEnabled(false);
    }//GEN-LAST:event_btnPlayer2_2ActionPerformed

    private void btnPlayer2_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer2_3ActionPerformed
        int i = getCurrI();
        int j = getCurrJ();
        if (!getIsPanelSelected()) return;
        if (pnlArr[i][j].getComponentCount() != 0) return;
        JLabel txt = new JLabel();
        pnlArr[i][j].add(txt);
        txt.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txt.setText(btnPlayer2_3.getText());
        txt.setVisible(true);
        removeLetter(txt.getText());
        pnlArr[i][j].setBorder(BorderFactory.createEmptyBorder());
        pnlArr[i][j].setIs_used(true);
        pnlArr[i][j].setSameTurn(true);
        setIsPanelSelected(false);
        btnPlayer2_3.setEnabled(false);
        btnNewLetters1.setEnabled(false);
        btnNewLetters2.setEnabled(false);
    }//GEN-LAST:event_btnPlayer2_3ActionPerformed

    private void btnPlayer2_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer2_4ActionPerformed
        int i = getCurrI();
        int j = getCurrJ();
        if (!getIsPanelSelected()) return;
        if (pnlArr[i][j].getComponentCount() != 0) return;
        JLabel txt = new JLabel();
        pnlArr[i][j].add(txt);
        txt.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txt.setText(btnPlayer2_4.getText());
        txt.setVisible(true);
        removeLetter(txt.getText());
        pnlArr[i][j].setBorder(BorderFactory.createEmptyBorder());
        pnlArr[i][j].setIs_used(true);
        pnlArr[i][j].setSameTurn(true);
        setIsPanelSelected(false);
        btnPlayer2_4.setEnabled(false);
        btnNewLetters1.setEnabled(false);
        btnNewLetters2.setEnabled(false);
    }//GEN-LAST:event_btnPlayer2_4ActionPerformed

    private void btnPlayer2_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer2_5ActionPerformed
        int i = getCurrI();
        int j = getCurrJ();
        if (!getIsPanelSelected()) return;
        if (pnlArr[i][j].getComponentCount() != 0) return;
        JLabel txt = new JLabel();
        pnlArr[i][j].add(txt);
        txt.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txt.setText(btnPlayer2_5.getText());
        txt.setVisible(true);
        removeLetter(txt.getText());
        pnlArr[i][j].setBorder(BorderFactory.createEmptyBorder());
        pnlArr[i][j].setIs_used(true);
        pnlArr[i][j].setSameTurn(true);
        setIsPanelSelected(false);
        btnPlayer2_5.setEnabled(false);
        btnNewLetters1.setEnabled(false);
        btnNewLetters2.setEnabled(false);
    }//GEN-LAST:event_btnPlayer2_5ActionPerformed

    private void btnPlayer2_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer2_6ActionPerformed
        int i = getCurrI();
        int j = getCurrJ();
        if (!getIsPanelSelected()) return;
        if (pnlArr[i][j].getComponentCount() != 0) return;
        JLabel txt = new JLabel();
        pnlArr[i][j].add(txt);
        txt.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txt.setText(btnPlayer2_6.getText());
        txt.setVisible(true);
        removeLetter(txt.getText());
        pnlArr[i][j].setBorder(BorderFactory.createEmptyBorder());
        pnlArr[i][j].setIs_used(true);
        pnlArr[i][j].setSameTurn(true);
        setIsPanelSelected(false);
        btnPlayer2_6.setEnabled(false);
        btnNewLetters1.setEnabled(false);
        btnNewLetters2.setEnabled(false);
    }//GEN-LAST:event_btnPlayer2_6ActionPerformed

    private void btnPlayer2_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer2_7ActionPerformed
        int i = getCurrI();
        int j = getCurrJ();
        if (!getIsPanelSelected()) return;
        if (pnlArr[i][j].getComponentCount() != 0) return;
        JLabel txt = new JLabel();
        pnlArr[i][j].add(txt);
        txt.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txt.setText(btnPlayer2_7.getText());
        txt.setVisible(true);
        removeLetter(txt.getText());
        pnlArr[i][j].setBorder(BorderFactory.createEmptyBorder());
        pnlArr[i][j].setIs_used(true);
        pnlArr[i][j].setSameTurn(true);
        setIsPanelSelected(false);
        btnPlayer2_7.setEnabled(false);
        btnNewLetters1.setEnabled(false);
        btnNewLetters2.setEnabled(false);
    }//GEN-LAST:event_btnPlayer2_7ActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        if (!getIsPanelSelected()) return;
        int i = getCurrI();
        int j = getCurrJ();
        pnlArr[i][j].setBorder(BorderFactory.createEmptyBorder());
        setIsPanelSelected(false);
        if (!pnlArr[i][j].getIs_used() || !pnlArr[i][j].getSameTurn()) return;
        if (pnlArr[i][j].getComponentCount() == 0) return;
        Component c = pnlArr[i][j].getComponent(0);
        String letter = ((JLabel)c).getText();
        enablePlayer1Button(letter);
        addLetter(letter);
        pnlArr[i][j].remove(c);
        pnlArr[i][j].repaint();
        for (int k = 2; k < 9; ++k)
        {
            Component comp = pnlPlayer1.getComponent(k);
            if (!((JButton)comp).isEnabled()) return;
        }
        btnNewLetters1.setEnabled(true);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        if (!getIsPanelSelected()) return;
        int i = getCurrI();
        int j = getCurrJ();
        pnlArr[i][j].setBorder(BorderFactory.createEmptyBorder());
        setIsPanelSelected(false);
        if (!pnlArr[i][j].getIs_used() || !pnlArr[i][j].getSameTurn()) return;
        if (pnlArr[i][j].getComponentCount() == 0) return;
        Component c = pnlArr[i][j].getComponent(0);
        String letter = ((JLabel)c).getText();
        enablePlayer2Button(letter);
        addLetter(letter);
        pnlArr[i][j].remove(c);
        pnlArr[i][j].repaint();
        for (int k = 2; k < 9; ++k)
        {
            Component comp = pnlPlayer2.getComponent(k);
            if (!((JButton)comp).isEnabled()) return;
        }
        btnNewLetters2.setEnabled(true);
    }//GEN-LAST:event_btnBack2ActionPerformed

    private void btnReady1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReady1ActionPerformed
        btnPlayer2_agree.setVisible(true);
    }//GEN-LAST:event_btnReady1ActionPerformed

    private void btnReady2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReady2ActionPerformed
        btnPlayer1_agree.setVisible(true);
    }//GEN-LAST:event_btnReady2ActionPerformed

    private void btnPlayer1_agreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer1_agreeActionPerformed
        for (int i = 0; i < 15; ++i)
        {
            for (int j = 0; j < 15; ++j)
            {
                if (pnlArr[i][j].getIs_used())
                {
                    pnlArr[i][j].setSameTurn(false);
                }
            }
        }
        btnPlayer1_agree.setVisible(false);
        lblPoints2.setText((getPoints() + Integer.parseInt(lblPoints2.getText())) + "");
        for (int i = 2; i < 9; ++i)
        {
            Component btn = pnlPlayer2.getComponent(i);
            if (!btn.isEnabled())
            {
                ((JButton)btn).setText(randomLetter());
            }
        }
        for (int i = 13; i <= 19; ++i)
        {
            Component pts = pnlPlayer2.getComponent(i);
            Component btn = pnlPlayer2.getComponent(i - 11);
            ((JLabel)pts).setText(getLetterPoints(((JButton)btn).getText()));
        }
        enablePlayer1();
    }//GEN-LAST:event_btnPlayer1_agreeActionPerformed

    private void btnPlayer2_agreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayer2_agreeActionPerformed
        for (int i = 0; i < 15; ++i)
        {
            for (int j = 0; j < 15; ++j)
            {
                if (pnlArr[i][j].getIs_used())
                {
                    pnlArr[i][j].setSameTurn(false);
                }
            }
        }
        btnPlayer2_agree.setVisible(false);
        lblPoints1.setText((getPoints() + Integer.parseInt(lblPoints1.getText())) + "");
        for (int i = 2; i < 9; ++i)
        {
            Component btn = pnlPlayer1.getComponent(i);
            if (!btn.isEnabled())
            {
                ((JButton)btn).setText(randomLetter());
            }
        }
        for (int i = 13; i <= 19; ++i)
        {
            Component pts = pnlPlayer1.getComponent(i);
            Component btn = pnlPlayer1.getComponent(i - 11);
            ((JLabel)pts).setText(getLetterPoints(((JButton)btn).getText()));
        }
        enablePlayer2();
    }//GEN-LAST:event_btnPlayer2_agreeActionPerformed

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
    
    private void enablePlayer1Button(String letter)
    {
        if (btnPlayer1_1.getText().equals(letter) && !btnPlayer1_1.isEnabled())
        {
            btnPlayer1_1.setEnabled(true);
        }
        else if (btnPlayer1_2.getText().equals(letter) && !btnPlayer1_2.isEnabled())
        {
            btnPlayer1_2.setEnabled(true);
        }
        else if (btnPlayer1_3.getText().equals(letter) && !btnPlayer1_3.isEnabled())
        {
            btnPlayer1_3.setEnabled(true);
        }
        else if (btnPlayer1_4.getText().equals(letter) && !btnPlayer1_4.isEnabled())
        {
            btnPlayer1_4.setEnabled(true);
        }
        else if (btnPlayer1_5.getText().equals(letter) && !btnPlayer1_5.isEnabled())
        {
            btnPlayer1_5.setEnabled(true);
        }
        else if (btnPlayer1_6.getText().equals(letter) && !btnPlayer1_6.isEnabled())
        {
            btnPlayer1_6.setEnabled(true);
        }
        else
        {
            btnPlayer1_7.setEnabled(true);
        }
    }
    
    private void enablePlayer2Button(String letter)
    {
        if (btnPlayer2_1.getText().equals(letter) && !btnPlayer2_1.isEnabled())
        {
            btnPlayer2_1.setEnabled(true);
        }
        else if (btnPlayer2_2.getText().equals(letter) && !btnPlayer2_2.isEnabled())
        {
            btnPlayer2_2.setEnabled(true);
        }
        else if (btnPlayer2_3.getText().equals(letter) && !btnPlayer2_3.isEnabled())
        {
            btnPlayer2_3.setEnabled(true);
        }
        else if (btnPlayer2_4.getText().equals(letter) && !btnPlayer2_4.isEnabled())
        {
            btnPlayer2_4.setEnabled(true);
        }
        else if (btnPlayer2_5.getText().equals(letter) && !btnPlayer2_5.isEnabled())
        {
            btnPlayer2_5.setEnabled(true);
        }
        else if (btnPlayer2_6.getText().equals(letter) && !btnPlayer2_6.isEnabled())
        {
            btnPlayer2_6.setEnabled(true);
        }
        else
        {
            btnPlayer2_7.setEnabled(true);
        }
    }
    
    private int getPoints()
    {
        int ans = 0;
        
        // checking if vertically
        int wordMultiplierVertically = 1;
        int word1 = 0;
        
        for (int i = getCurrI(), j = getCurrJ(); i >= 0 && pnlArr[i][j].getComponentCount() != 0; --i)
        {
            Component c = pnlArr[i][j].getComponent(0);
            int multiplier = 1;
            if (pnlArr[i][j].getBackground().getRGB() == new Color(173, 216, 230).getRGB()) // check if sky blue
            {
                multiplier = 2;
            }
            else if (pnlArr[i][j].getBackground().getRGB() == Color.blue.getRGB())
            {
                multiplier = 3;
            }
            else if (pnlArr[i][j].getBackground().getRGB() == Color.pink.getRGB())
            {
                wordMultiplierVertically *= 2;
            }
            else if (pnlArr[i][j].getBackground().getRGB() == new Color(184, 15, 10).getRGB()) // check if crimson red
            {
                wordMultiplierVertically *= 3;
            }
            word1 += multiplier * Integer.parseInt(getLetterPoints(((JLabel)c).getText()));
        }
        
        for (int i = getCurrI(), j = getCurrJ(); i < 15 && pnlArr[i][j].getComponentCount() != 0; ++i)
        {
            Component c = pnlArr[i][j].getComponent(0);
            int multiplier = 1;
            if (pnlArr[i][j].getBackground().getRGB() == new Color(173, 216, 230).getRGB()) // check if sky blue
            {
                multiplier = 2;
            }
            else if (pnlArr[i][j].getBackground().getRGB() == Color.blue.getRGB())
            {
                multiplier = 3;
            }
            else if (pnlArr[i][j].getBackground().getRGB() == Color.pink.getRGB())
            {
                wordMultiplierVertically *= 2;
            }
            else if (pnlArr[i][j].getBackground().getRGB() == new Color(184, 15, 10).getRGB()) // check if crimson red
            {
                wordMultiplierVertically *= 3;
            }
            word1 += multiplier * Integer.parseInt(getLetterPoints(((JLabel)c).getText()));
        }
        
        
        {
            Component c = pnlArr[getCurrI()][getCurrJ()].getComponent(0);
            int multiplier = 1;
            if (pnlArr[getCurrI()][getCurrJ()].getBackground().getRGB() == new Color(173, 216, 230).getRGB()) // check if sky blue
            {
                multiplier = 2;
            }
            else if (pnlArr[getCurrI()][getCurrJ()].getBackground().getRGB() == Color.blue.getRGB())
            {
                multiplier = 3;
            }
            if (getCurrI() + 1 < 15 && getCurrI() - 1 >= 0 &&
                    pnlArr[getCurrI() + 1][getCurrJ()].getComponentCount() == 0 &&
                    pnlArr[getCurrI() - 1][getCurrJ()].getComponentCount() == 0)
                word1 -= 2 * multiplier * Integer.parseInt(getLetterPoints(((JLabel)c).getText()));
            else if (getCurrI() + 1 == 15 && 
                    pnlArr[getCurrI() - 1][getCurrJ()].getComponentCount() == 0)
                word1 -= 2 * multiplier * Integer.parseInt(getLetterPoints(((JLabel)c).getText()));
            else if (getCurrI() - 1 < 0 && 
                    pnlArr[getCurrI() + 1][getCurrJ()].getComponentCount() == 0)
                word1 -= 2 * multiplier * Integer.parseInt(getLetterPoints(((JLabel)c).getText()));
            else
                word1 -= multiplier * Integer.parseInt(getLetterPoints(((JLabel)c).getText()));
            if (pnlArr[getCurrI()][getCurrJ()].getBackground().getRGB() == Color.pink.getRGB())
                wordMultiplierVertically /= 2;
            else if (pnlArr[getCurrI()][getCurrJ()].getBackground().getRGB() == new Color(184, 15, 10).getRGB()) // check if crimson red
                wordMultiplierVertically /= 3;
            System.out.println(word1);
            word1 *= wordMultiplierVertically;
        }
        
        
        /// checking horizontally
        int wordMultiplierHorizontally = 1;
        int word2 = 0;
        
        for (int i = getCurrI(), j = getCurrJ(); j >= 0 && pnlArr[i][j].getComponentCount() != 0; --j)
        {
            Component c = pnlArr[i][j].getComponent(0);
            int multiplier = 1;
            if (pnlArr[i][j].getBackground().getRGB() == new Color(173, 216, 230).getRGB()) // check if sky blue
            {
                multiplier = 2;
            }
            else if (pnlArr[i][j].getBackground().getRGB() == Color.blue.getRGB())
            {
                multiplier = 3;
            }
            else if (pnlArr[i][j].getBackground().getRGB() == Color.pink.getRGB())
            {
                wordMultiplierHorizontally *= 2;
            }
            else if (pnlArr[i][j].getBackground().getRGB() == new Color(184, 15, 10).getRGB()) // check if crimson red
            {
                wordMultiplierHorizontally *= 3;
            }
            word2 += multiplier * Integer.parseInt(getLetterPoints(((JLabel)c).getText()));
        }
        
        for (int i = getCurrI(), j = getCurrJ(); j < 15 && pnlArr[i][j].getComponentCount() != 0; ++j)
        {
            Component c = pnlArr[i][j].getComponent(0);
            int multiplier = 1;
            if (pnlArr[i][j].getBackground().getRGB() == new Color(173, 216, 230).getRGB()) // check if sky blue
            {
                multiplier = 2;
            }
            else if (pnlArr[i][j].getBackground().getRGB() == Color.blue.getRGB())
            {
                multiplier = 3;
            }
            else if (pnlArr[i][j].getBackground().getRGB() == Color.pink.getRGB())
            {
                wordMultiplierHorizontally *= 2;
            }
            else if (pnlArr[i][j].getBackground().getRGB() == new Color(184, 15, 10).getRGB()) // check if crimson red
            {
                wordMultiplierHorizontally *= 3;
            }
            word2 += multiplier * Integer.parseInt(getLetterPoints(((JLabel)c).getText()));
        }
        
        
        {
            Component c = pnlArr[getCurrI()][getCurrJ()].getComponent(0);
            int multiplier = 1;
            if (pnlArr[getCurrI()][getCurrJ()].getBackground().getRGB() == new Color(173, 216, 230).getRGB()) // check if sky blue
            {
                multiplier = 2;
            }
            else if (pnlArr[getCurrI()][getCurrJ()].getBackground().getRGB() == Color.blue.getRGB())
            {
                multiplier = 3;
            }
            if ((getCurrJ() + 1 < 15 && getCurrJ() - 1 >= 0 &&
                    pnlArr[getCurrI()][getCurrJ() + 1].getComponentCount() == 0 && 
                    pnlArr[getCurrI()][getCurrJ() - 1].getComponentCount() == 0))
                word2 -= 2 * multiplier * Integer.parseInt(getLetterPoints(((JLabel)c).getText()));
            else if (getCurrJ() + 1 == 15 && 
                    pnlArr[getCurrI()][getCurrJ() - 1].getComponentCount() == 0)
                word2 -= 2 * multiplier * Integer.parseInt(getLetterPoints(((JLabel)c).getText()));
            else if (getCurrJ() - 1 < 0 && 
                    pnlArr[getCurrI()][getCurrJ() + 1].getComponentCount() == 0)
                word2 -= 2 * multiplier * Integer.parseInt(getLetterPoints(((JLabel)c).getText()));
            else
                word2 -= multiplier * Integer.parseInt(getLetterPoints(((JLabel)c).getText()));
            if (pnlArr[getCurrI()][getCurrJ()].getBackground().getRGB() == Color.pink.getRGB())
                wordMultiplierHorizontally /= 2;
            else if (pnlArr[getCurrI()][getCurrJ()].getBackground().getRGB() == new Color(184, 15, 10).getRGB()) // check if crimson red
                wordMultiplierHorizontally /= 3;
            word2 *= wordMultiplierHorizontally;
        }
        System.out.println(word1 + " " + word2);
        ans = word1 + word2;

        return ans;
    }
    
    private void enablePlayer1()
    {
        btnPlayer1_1.setEnabled(true);
        btnPlayer1_2.setEnabled(true);
        btnPlayer1_3.setEnabled(true);
        btnPlayer1_4.setEnabled(true);
        btnPlayer1_5.setEnabled(true);
        btnPlayer1_6.setEnabled(true);
        btnPlayer1_7.setEnabled(true);
        btnBack1.setEnabled(true);
        btnReady1.setEnabled(true);
        btnNewLetters1.setEnabled(true);
        
        btnPlayer2_1.setEnabled(false);
        btnPlayer2_2.setEnabled(false);
        btnPlayer2_3.setEnabled(false);
        btnPlayer2_4.setEnabled(false);
        btnPlayer2_5.setEnabled(false);
        btnPlayer2_6.setEnabled(false);
        btnPlayer2_7.setEnabled(false);
        btnBack2.setEnabled(false);
        btnReady2.setEnabled(false);
        btnNewLetters2.setEnabled(false);
    }
    
    private void enablePlayer2()
    {
        btnPlayer2_1.setEnabled(true);
        btnPlayer2_2.setEnabled(true);
        btnPlayer2_3.setEnabled(true);
        btnPlayer2_4.setEnabled(true);
        btnPlayer2_5.setEnabled(true);
        btnPlayer2_6.setEnabled(true);
        btnPlayer2_7.setEnabled(true);
        btnBack2.setEnabled(true);
        btnReady2.setEnabled(true);
        btnNewLetters2.setEnabled(true);
        
        btnPlayer1_1.setEnabled(false);
        btnPlayer1_2.setEnabled(false);
        btnPlayer1_3.setEnabled(false);
        btnPlayer1_4.setEnabled(false);
        btnPlayer1_5.setEnabled(false);
        btnPlayer1_6.setEnabled(false);
        btnPlayer1_7.setEnabled(false);
        btnBack1.setEnabled(false);
        btnReady1.setEnabled(false);
        btnNewLetters1.setEnabled(false);
    }
    
    private String randomLetter()
    {
        String answ;
        do
        {
            answ =  letters[rand.nextInt(100)];
        }while(answ.equals(""));
        return answ;
    }
    
    private void removeLetter(String letter)
    {
        for (int i = 0; i < 100; i++) 
        {
           if(letter.equals(letters[i]))
           {
               letters[i]="";
               return;
           }
        }
    }
    
    private void addLetter(String letter)
    {
        for (int j = 0; j < 100; j++) {
           if(letters[j].equals(""))
           {
               letters[j] = letter;
           }
        }   
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
    private javax.swing.JButton btnPlayer1_agree;
    private javax.swing.JButton btnPlayer2_1;
    private javax.swing.JButton btnPlayer2_2;
    private javax.swing.JButton btnPlayer2_3;
    private javax.swing.JButton btnPlayer2_4;
    private javax.swing.JButton btnPlayer2_5;
    private javax.swing.JButton btnPlayer2_6;
    private javax.swing.JButton btnPlayer2_7;
    private javax.swing.JButton btnPlayer2_agree;
    private javax.swing.JButton btnReady1;
    private javax.swing.JButton btnReady2;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblPoints1;
    private javax.swing.JLabel lblPoints2;
    private javax.swing.JPanel pnlFull;
    private javax.swing.JPanel pnlPlayer1;
    private javax.swing.JPanel pnlPlayer2;
    // End of variables declaration//GEN-END:variables
}
