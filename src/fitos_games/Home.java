/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fitos_games;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author malith
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
          scaleImage() ;
    }

    public void scaleImage() {
        ImageIcon icon1 = new ImageIcon("src/images/Chess.png");
        Image img1 = icon1.getImage();
        Image imgScale1 = img1.getScaledInstance(Game1Img.getWidth(), Game1Img.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon1= new ImageIcon(imgScale1);
        Game1Img.setIcon(ScaledIcon1);
        
        ImageIcon icon3 = new ImageIcon("src/images/Tictactoe.png");
        Image img3 = icon3.getImage();
        Image imgScale3 = img3.getScaledInstance(Game3Img.getWidth(), Game3Img.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon3 = new ImageIcon(imgScale3);
        Game3Img.setIcon(ScaledIcon3);
        
        ImageIcon icon2 = new ImageIcon("src/images/Encode.jpg");
        Image img2 = icon2.getImage();
        Image imgScale2 = img2.getScaledInstance(Game2Img.getWidth(), Game2Img.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon2 = new ImageIcon(imgScale2);
        Game2Img.setIcon(ScaledIcon2);
        
        ImageIcon icon4 = new ImageIcon("src/images/Path.png");
        Image img4 = icon4.getImage();
        Image imgScale4 = img4.getScaledInstance(Game4Img.getWidth(), Game4Img.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon4 = new ImageIcon(imgScale4);
        Game4Img.setIcon(ScaledIcon4);
        
        ImageIcon icon5 = new ImageIcon("src/images/Connectors.jpg");
        Image img5 = icon5.getImage();
        Image imgScale5 = img5.getScaledInstance(Game5Img.getWidth(), Game5Img.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ScaledIcon5 = new ImageIcon(imgScale5);
        Game5Img.setIcon(ScaledIcon5);
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FitosGames = new fitos_games.LableRound();
        Game1Panel = new fitos_games.PanelRound();
        Game1Img = new javax.swing.JLabel();
        Game1PlayBtn = new fitos_games.LableRound();
        Game1Name = new fitos_games.LableRound();
        Game2Panel = new fitos_games.PanelRound();
        Game2Img = new javax.swing.JLabel();
        Game2PlayBtn = new fitos_games.LableRound();
        Game2Name = new fitos_games.LableRound();
        Game3Panel = new fitos_games.PanelRound();
        Game3Img = new javax.swing.JLabel();
        Game3PlayBtn = new fitos_games.LableRound();
        Game3Name = new fitos_games.LableRound();
        Game4Panel = new fitos_games.PanelRound();
        Game4Img = new javax.swing.JLabel();
        Game4PlayBtn = new fitos_games.LableRound();
        Game4Name = new fitos_games.LableRound();
        Game5Panel = new fitos_games.PanelRound();
        Game5Img = new javax.swing.JLabel();
        Game5PlayBtn = new fitos_games.LableRound();
        Game5Name = new fitos_games.LableRound();
        btnExitPanel = new fitos_games.PanelRound();
        IconExit = new javax.swing.JLabel();
        btnExit = new fitos_games.LableRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 255, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setName("Home"); // NOI18N
        setResizable(false);

        FitosGames.setBackground(new java.awt.Color(153, 153, 255));
        FitosGames.setForeground(new java.awt.Color(255, 255, 255));
        FitosGames.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FitosGames.setText("Fitos Games");
        FitosGames.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        FitosGames.setRoundBottomLeft(30);
        FitosGames.setRoundBottomRight(30);
        FitosGames.setRoundTopLeft(30);
        FitosGames.setRoundTopRight(30);

        Game1Panel.setBackground(new java.awt.Color(255, 255, 255));
        Game1Panel.setForeground(new java.awt.Color(255, 255, 255));
        Game1Panel.setRoundBottomLeft(30);
        Game1Panel.setRoundBottomRight(30);
        Game1Panel.setRoundTopLeft(30);
        Game1Panel.setRoundTopRight(30);

        Game1Img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Game1PlayBtn.setBackground(new java.awt.Color(153, 153, 255));
        Game1PlayBtn.setForeground(new java.awt.Color(255, 255, 255));
        Game1PlayBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Game1PlayBtn.setText("Play ");
        Game1PlayBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Game1PlayBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Game1PlayBtn.setRoundBottomLeft(30);
        Game1PlayBtn.setRoundBottomRight(30);
        Game1PlayBtn.setRoundTopLeft(30);
        Game1PlayBtn.setRoundTopRight(30);
        Game1PlayBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Game1PlayBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Game1PlayBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Game1PlayBtnMouseExited(evt);
            }
        });

        Game1Name.setBackground(new java.awt.Color(0, 204, 204));
        Game1Name.setForeground(new java.awt.Color(255, 255, 255));
        Game1Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Game1Name.setText("Eight Queens Game");
        Game1Name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Game1Name.setRoundTopLeft(25);
        Game1Name.setRoundTopRight(25);

        javax.swing.GroupLayout Game1PanelLayout = new javax.swing.GroupLayout(Game1Panel);
        Game1Panel.setLayout(Game1PanelLayout);
        Game1PanelLayout.setHorizontalGroup(
            Game1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Game1Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Game1PanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(Game1PlayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addComponent(Game1Img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Game1PanelLayout.setVerticalGroup(
            Game1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Game1PanelLayout.createSequentialGroup()
                .addComponent(Game1Name, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Game1Img, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Game1PlayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        Game2Panel.setBackground(new java.awt.Color(255, 255, 255));
        Game2Panel.setForeground(new java.awt.Color(255, 255, 255));
        Game2Panel.setRoundBottomLeft(30);
        Game2Panel.setRoundBottomRight(30);
        Game2Panel.setRoundTopLeft(30);
        Game2Panel.setRoundTopRight(30);

        Game2Img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Game2PlayBtn.setBackground(new java.awt.Color(153, 153, 255));
        Game2PlayBtn.setForeground(new java.awt.Color(255, 255, 255));
        Game2PlayBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Game2PlayBtn.setText("Play ");
        Game2PlayBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Game2PlayBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Game2PlayBtn.setRoundBottomLeft(30);
        Game2PlayBtn.setRoundBottomRight(30);
        Game2PlayBtn.setRoundTopLeft(30);
        Game2PlayBtn.setRoundTopRight(30);
        Game2PlayBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Game2PlayBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Game2PlayBtnMouseExited(evt);
            }
        });

        Game2Name.setBackground(new java.awt.Color(0, 204, 204));
        Game2Name.setForeground(new java.awt.Color(255, 255, 255));
        Game2Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Game2Name.setText(" Encode / Decode");
        Game2Name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Game2Name.setRoundTopLeft(25);
        Game2Name.setRoundTopRight(25);

        javax.swing.GroupLayout Game2PanelLayout = new javax.swing.GroupLayout(Game2Panel);
        Game2Panel.setLayout(Game2PanelLayout);
        Game2PanelLayout.setHorizontalGroup(
            Game2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Game2Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Game2PanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(Game2PlayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addComponent(Game2Img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Game2PanelLayout.setVerticalGroup(
            Game2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Game2PanelLayout.createSequentialGroup()
                .addComponent(Game2Name, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Game2Img, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Game2PlayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        Game3Panel.setBackground(new java.awt.Color(255, 255, 255));
        Game3Panel.setForeground(new java.awt.Color(255, 255, 255));
        Game3Panel.setRoundBottomLeft(30);
        Game3Panel.setRoundBottomRight(30);
        Game3Panel.setRoundTopLeft(30);
        Game3Panel.setRoundTopRight(30);

        Game3Img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Game3PlayBtn.setBackground(new java.awt.Color(153, 153, 255));
        Game3PlayBtn.setForeground(new java.awt.Color(255, 255, 255));
        Game3PlayBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Game3PlayBtn.setText("Play ");
        Game3PlayBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Game3PlayBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Game3PlayBtn.setRoundBottomLeft(30);
        Game3PlayBtn.setRoundBottomRight(30);
        Game3PlayBtn.setRoundTopLeft(30);
        Game3PlayBtn.setRoundTopRight(30);
        Game3PlayBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Game3PlayBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Game3PlayBtnMouseExited(evt);
            }
        });

        Game3Name.setBackground(new java.awt.Color(0, 204, 204));
        Game3Name.setForeground(new java.awt.Color(255, 255, 255));
        Game3Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Game3Name.setText("Tic Tac Toe");
        Game3Name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Game3Name.setRoundTopLeft(25);
        Game3Name.setRoundTopRight(25);

        javax.swing.GroupLayout Game3PanelLayout = new javax.swing.GroupLayout(Game3Panel);
        Game3Panel.setLayout(Game3PanelLayout);
        Game3PanelLayout.setHorizontalGroup(
            Game3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Game3Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Game3PanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(Game3PlayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addComponent(Game3Img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Game3PanelLayout.setVerticalGroup(
            Game3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Game3PanelLayout.createSequentialGroup()
                .addComponent(Game3Name, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Game3Img, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Game3PlayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        Game4Panel.setBackground(new java.awt.Color(255, 255, 255));
        Game4Panel.setForeground(new java.awt.Color(255, 255, 255));
        Game4Panel.setRoundBottomLeft(30);
        Game4Panel.setRoundBottomRight(30);
        Game4Panel.setRoundTopLeft(30);
        Game4Panel.setRoundTopRight(30);

        Game4Img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Game4PlayBtn.setBackground(new java.awt.Color(153, 153, 255));
        Game4PlayBtn.setForeground(new java.awt.Color(255, 255, 255));
        Game4PlayBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Game4PlayBtn.setText("Play ");
        Game4PlayBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Game4PlayBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Game4PlayBtn.setRoundBottomLeft(30);
        Game4PlayBtn.setRoundBottomRight(30);
        Game4PlayBtn.setRoundTopLeft(30);
        Game4PlayBtn.setRoundTopRight(30);
        Game4PlayBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Game4PlayBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Game4PlayBtnMouseExited(evt);
            }
        });

        Game4Name.setBackground(new java.awt.Color(0, 204, 204));
        Game4Name.setForeground(new java.awt.Color(255, 255, 255));
        Game4Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Game4Name.setText("Identify Shortest Path");
        Game4Name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Game4Name.setRoundTopLeft(25);
        Game4Name.setRoundTopRight(25);

        javax.swing.GroupLayout Game4PanelLayout = new javax.swing.GroupLayout(Game4Panel);
        Game4Panel.setLayout(Game4PanelLayout);
        Game4PanelLayout.setHorizontalGroup(
            Game4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Game4Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Game4PanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(Game4PlayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addComponent(Game4Img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Game4PanelLayout.setVerticalGroup(
            Game4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Game4PanelLayout.createSequentialGroup()
                .addComponent(Game4Name, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Game4Img, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Game4PlayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        Game5Panel.setBackground(new java.awt.Color(255, 255, 255));
        Game5Panel.setForeground(new java.awt.Color(255, 255, 255));
        Game5Panel.setRoundBottomLeft(30);
        Game5Panel.setRoundBottomRight(30);
        Game5Panel.setRoundTopLeft(30);
        Game5Panel.setRoundTopRight(30);

        Game5Img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Game5PlayBtn.setBackground(new java.awt.Color(153, 153, 255));
        Game5PlayBtn.setForeground(new java.awt.Color(255, 255, 255));
        Game5PlayBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Game5PlayBtn.setText("Play ");
        Game5PlayBtn.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Game5PlayBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Game5PlayBtn.setRoundBottomLeft(30);
        Game5PlayBtn.setRoundBottomRight(30);
        Game5PlayBtn.setRoundTopLeft(30);
        Game5PlayBtn.setRoundTopRight(30);
        Game5PlayBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Game5PlayBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Game5PlayBtnMouseExited(evt);
            }
        });

        Game5Name.setBackground(new java.awt.Color(0, 204, 204));
        Game5Name.setForeground(new java.awt.Color(255, 255, 255));
        Game5Name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Game5Name.setText("Identify minimum connecters");
        Game5Name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Game5Name.setRoundTopLeft(25);
        Game5Name.setRoundTopRight(25);

        javax.swing.GroupLayout Game5PanelLayout = new javax.swing.GroupLayout(Game5Panel);
        Game5Panel.setLayout(Game5PanelLayout);
        Game5PanelLayout.setHorizontalGroup(
            Game5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Game5Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Game5PanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(Game5PlayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addComponent(Game5Img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Game5PanelLayout.setVerticalGroup(
            Game5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Game5PanelLayout.createSequentialGroup()
                .addComponent(Game5Name, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(Game5Img, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Game5PlayBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        btnExitPanel.setBackground(new java.awt.Color(255, 255, 255));
        btnExitPanel.setRoundBottomLeft(30);
        btnExitPanel.setRoundBottomRight(30);
        btnExitPanel.setRoundTopLeft(30);
        btnExitPanel.setRoundTopRight(30);

        IconExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N

        btnExit.setBackground(new java.awt.Color(255, 51, 51));
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("Exit");
        btnExit.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExit.setRoundBottomLeft(30);
        btnExit.setRoundBottomRight(30);
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

        javax.swing.GroupLayout btnExitPanelLayout = new javax.swing.GroupLayout(btnExitPanel);
        btnExitPanel.setLayout(btnExitPanelLayout);
        btnExitPanelLayout.setHorizontalGroup(
            btnExitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnExitPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(IconExit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnExitPanelLayout.setVerticalGroup(
            btnExitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExitPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IconExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FitosGames, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Game1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Game4Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Game5Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(btnExitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Game2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Game3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(FitosGames, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Game1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Game2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Game3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Game5Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Game4Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnExitPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Game1PlayBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Game1PlayBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Game1PlayBtnMouseClicked

    private void Game1PlayBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Game1PlayBtnMouseEntered
        Game1PlayBtn.setBackground(Color.decode("#00CCCC"));
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_Game1PlayBtnMouseEntered

    private void Game1PlayBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Game1PlayBtnMouseExited
       
        Game1PlayBtn.setBackground(Color.decode("#9999FF"));
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_Game1PlayBtnMouseExited

    private void Game2PlayBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Game2PlayBtnMouseEntered
        Game2PlayBtn.setBackground(Color.decode("#00CCCC"));
       setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_Game2PlayBtnMouseEntered

    private void Game2PlayBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Game2PlayBtnMouseExited
        Game2PlayBtn.setBackground(Color.decode("#9999FF"));
         setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_Game2PlayBtnMouseExited

    private void Game3PlayBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Game3PlayBtnMouseEntered
        Game3PlayBtn.setBackground(Color.decode("#00CCCC"));
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_Game3PlayBtnMouseEntered

    private void Game3PlayBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Game3PlayBtnMouseExited
        Game3PlayBtn.setBackground(Color.decode("#9999FF"));
        setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_Game3PlayBtnMouseExited

    private void Game4PlayBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Game4PlayBtnMouseEntered
        Game4PlayBtn.setBackground(Color.decode("#00CCCC"));
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_Game4PlayBtnMouseEntered

    private void Game4PlayBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Game4PlayBtnMouseExited
        Game4PlayBtn.setBackground(Color.decode("#9999FF"));
         setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_Game4PlayBtnMouseExited

    private void Game5PlayBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Game5PlayBtnMouseEntered
       Game5PlayBtn.setBackground(Color.decode("#00CCCC"));
       setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_Game5PlayBtnMouseEntered

    private void Game5PlayBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Game5PlayBtnMouseExited
        Game5PlayBtn.setBackground(Color.decode("#9999FF"));
         setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_Game5PlayBtnMouseExited

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(Color.decode("#D3D3D3"));
        btnExit.setForeground(Color.decode("#FF3333"));
        setCursor(Cursor.HAND_CURSOR);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(Color.decode("#FF3333"));
        btnExit.setForeground(Color.decode("#FFFFFF"));
         setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_btnExitMouseExited

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnExitMouseClicked

    
    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private fitos_games.LableRound FitosGames;
    private javax.swing.JLabel Game1Img;
    private fitos_games.LableRound Game1Name;
    private fitos_games.PanelRound Game1Panel;
    private fitos_games.LableRound Game1PlayBtn;
    private javax.swing.JLabel Game2Img;
    private fitos_games.LableRound Game2Name;
    private fitos_games.PanelRound Game2Panel;
    private fitos_games.LableRound Game2PlayBtn;
    private javax.swing.JLabel Game3Img;
    private fitos_games.LableRound Game3Name;
    private fitos_games.PanelRound Game3Panel;
    private fitos_games.LableRound Game3PlayBtn;
    private javax.swing.JLabel Game4Img;
    private fitos_games.LableRound Game4Name;
    private fitos_games.PanelRound Game4Panel;
    private fitos_games.LableRound Game4PlayBtn;
    private javax.swing.JLabel Game5Img;
    private fitos_games.LableRound Game5Name;
    private fitos_games.PanelRound Game5Panel;
    private fitos_games.LableRound Game5PlayBtn;
    private javax.swing.JLabel IconExit;
    private fitos_games.LableRound btnExit;
    private fitos_games.PanelRound btnExitPanel;
    // End of variables declaration//GEN-END:variables
}
