/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IdentifyShortestPath.View;

import IdentifyShortestPath.Controller.IdentifyShortestPath;
import fitos_games.Home;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author malith
 */
public class IdentifyShortestPathGame extends javax.swing.JFrame {

    /**
     * Creates new form IdentifyMinimumConnectors
     */
    public IdentifyShortestPathGame() {
        initComponents();
        this.setTitle("Identify shortest path Game");

        hideDistance();
        setDistance();
        String randomCity = pickRandomCity();
        System.out.println(randomCity);
        lblEndToCityInput.setText(randomCity);
    }

    private IdentifyShortestPath ctrl = new IdentifyShortestPath();
    private int[] distance = new int[12];

    private void setDistance() {

        for (int c = 0; c < 11; c++) {
            distance[c] = ctrl.generateRandom();
        }

        AtoI.setText(distance[0] + "KM");
        AtoJ.setText(distance[1] + "KM");
        AtoF.setText(distance[2] + "KM");
        AtoB.setText(distance[3] + "KM");
        AtoE.setText(distance[4] + "KM");
        EtoG.setText(distance[5] + "KM");
        BtoE.setText(distance[6] + "KM");
        BtoC.setText(distance[7] + "KM");
        CtoH.setText(distance[8] + "KM");
        DtoH.setText(distance[9] + "KM");
        DtoJ.setText(distance[10] + "KM");
    }

    public String pickRandomCity() {

        String AlphaNumericStr = "BCDEFGHIJ";

        StringBuilder s = new StringBuilder(1);

        int i;

        for (i = 0; i < 1; i++) {
            int ch = (int) (AlphaNumericStr.length() * Math.random());
            s.append(AlphaNumericStr.charAt(ch));
        }
        return s.toString();
    }

    public void hideDistance() {

        //AtoB.setVisible(false);
        AtoC.setVisible(false);
        AtoD.setVisible(false);
        //AtoE.setVisible(false);
        //AtoF.setVisible(false);
        AtoG.setVisible(false);
        AtoH.setVisible(false);
        //AtoI.setVisible(false);
        //AtoJ.setVisible(false);

        //BtoC.setVisible(false);
        BtoD.setVisible(false);
        //BtoE.setVisible(false);
        BtoF.setVisible(false);
        BtoG.setVisible(false);
        BtoH.setVisible(false);
        BtoI.setVisible(false);
        BtoJ.setVisible(false);

        CtoD.setVisible(false);
        CtoE.setVisible(false);
        CtoF.setVisible(false);
        CtoG.setVisible(false);
        //CtoH.setVisible(false);
        CtoI.setVisible(false);
        CtoJ.setVisible(false);

        DtoE.setVisible(false);
        DtoF.setVisible(false);
        DtoG.setVisible(false);
        //DtoH.setVisible(false);
        DtoI.setVisible(false);
        //DtoJ.setVisible(false);

        EtoF.setVisible(false);
        //EtoG.setVisible(false);
        EtoH.setVisible(false);
        EtoI.setVisible(false);
        EtoJ.setVisible(false);

        FtoG.setVisible(false);
        FtoH.setVisible(false);
        FtoI.setVisible(false);
        FtoJ.setVisible(false);

        GtoH.setVisible(false);
        GtoI.setVisible(false);
        GtoJ.setVisible(false);

        HtoI.setVisible(false);
        HtoJ.setVisible(false);

        ItoJ.setVisible(false);
    }

    class AtoB extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.blue);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityA.getX() + 69;
            int y1 = CityA.getY() + 48;
            int x2 = CityB.getX();
            int y2 = CityB.getY();
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class AtoC extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.blue);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityA.getX() + 69;
            int y1 = CityA.getY() + 48;
            int x2 = CityB.getX();
            int y2 = CityB.getY();
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class AtoD extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.blue);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityA.getX() + 69;
            int y1 = CityA.getY() + 48;
            int x2 = CityD.getX();
            int y2 = CityD.getY();
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class AtoE extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.blue);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityA.getX() + 69;
            int y1 = CityA.getY() + 48;
            int x2 = CityE.getX() + 30;
            int y2 = CityE.getY() - 10;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class AtoF extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.blue);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityA.getX() + 69;
            int y1 = CityA.getY() + 48;
            int x2 = CityF.getX();
            int y2 = CityF.getY();
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class AtoG extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.blue);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityA.getX() + 69;
            int y1 = CityA.getY() + 48;
            int x2 = CityG.getX() + 20;
            int y2 = CityG.getY() - 10;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class AtoH extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.blue);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityA.getX() + 69;
            int y1 = CityA.getY() + 48;
            int x2 = CityH.getX();
            int y2 = CityH.getY();
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class AtoI extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.blue);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityA.getX() + 69;
            int y1 = CityA.getY() + 48;
            int x2 = CityI.getX() - 10;
            int y2 = CityI.getY() + 25;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class AtoJ extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.blue);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityA.getX() + 69;
            int y1 = CityA.getY() + 48;
            int x2 = CityJ.getX();
            int y2 = CityJ.getY();
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class BtoC extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.red);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityB.getX();
            int y1 = CityB.getY();
            int x2 = CityC.getX();
            int y2 = CityC.getY() + 16;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class BtoD extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.red);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityB.getX();
            int y1 = CityB.getY();
            int x2 = CityD.getX();
            int y2 = CityD.getY() + 60;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class BtoE extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.red);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityB.getX();
            int y1 = CityB.getY();
            int x2 = CityE.getX() + 60;
            int y2 = CityE.getY() + 48;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class BtoF extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.red);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityB.getX();
            int y1 = CityB.getY();
            int x2 = CityF.getX() + 20;
            int y2 = CityF.getY() + 48;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class BtoG extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.red);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityB.getX();
            int y1 = CityB.getY();
            int x2 = CityG.getX() + 78;
            int y2 = CityG.getY() + 35;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class BtoH extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.red);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityB.getX();
            int y1 = CityB.getY();
            int x2 = CityH.getX();
            int y2 = CityH.getY() + 20;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);
            g2d.drawLine(CityB.getX(), CityB.getY(), CityH.getX(), CityH.getY() + 20);

        }
    }

    class BtoI extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.red);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityB.getX();
            int y1 = CityB.getY();
            int x2 = CityI.getX();
            int y2 = CityI.getY() + 48;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class BtoJ extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.red);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityB.getX();
            int y1 = CityB.getY();
            int x2 = CityJ.getX();
            int y2 = CityJ.getY() + 60;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class CtoD extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.yellow);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityC.getX();
            int y1 = CityC.getY();
            int x2 = CityD.getX();
            int y2 = CityD.getY() + 60;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class CtoE extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.yellow);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityC.getX();
            int y1 = CityC.getY();
            int x2 = CityE.getX() + 60;
            int y2 = CityE.getY() + 48;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class CtoF extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.yellow);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityC.getX();
            int y1 = CityC.getY();
            int x2 = CityF.getX() + 20;
            int y2 = CityF.getY() + 48;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class CtoG extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.yellow);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityC.getX();
            int y1 = CityC.getY();
            int x2 = CityG.getX() + 80;
            int y2 = CityG.getY() + 25;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class CtoH extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.yellow);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityC.getX();
            int y1 = CityC.getY();
            int x2 = CityH.getX();
            int y2 = CityH.getY() + 20;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class CtoI extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.yellow);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityC.getX();
            int y1 = CityC.getY();
            int x2 = CityI.getX() + 40;
            int y2 = CityI.getY() + 52;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class CtoJ extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.yellow);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityC.getX();
            int y1 = CityC.getY();
            int x2 = CityJ.getX() + 50;
            int y2 = CityJ.getY() + 60;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class DtoE extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.pink);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityD.getX();
            int y1 = CityD.getY();
            int x2 = CityD.getX() - 400;
            int y2 = CityD.getY() - 58;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

            g2d.drawLine(CityD.getX() - 400, CityD.getY() - 58, CityE.getX() + 60, CityE.getY() + 10);

        }
    }

    class DtoF extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.pink);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityD.getX();
            int y1 = CityD.getY();
            int x2 = CityD.getX() - 350;
            int y2 = CityD.getY() - 18;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);
            g2d.drawLine(CityD.getX() - 350, CityD.getY() - 18, CityF.getX() + 65, CityF.getY());

        }
    }

    class DtoG extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.pink);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityD.getX();
            int y1 = CityD.getY();
            int x2 = CityG.getX() + 80;
            int y2 = CityG.getY() + 25;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class DtoH extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.pink);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityD.getX();
            int y1 = CityD.getY();
            int x2 = CityD.getX() - 80;
            int y2 = CityD.getY() + 100;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

            g2d.drawLine(CityD.getX() - 80, CityD.getY() + 100, CityH.getX(), CityH.getY());

        }
    }

    class DtoI extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.pink);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityD.getX();
            int y1 = CityD.getY();
            int x2 = CityI.getX() + 40;
            int y2 = CityI.getY() + 52;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class DtoJ extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.pink);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityD.getX();
            int y1 = CityD.getY();
            int x2 = CityJ.getX() + 65;
            int y2 = CityJ.getY() + 10;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class EtoF extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.black);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityE.getX() + 75;
            int y1 = CityE.getY() + 45;
            int x2 = CityF.getX() - 10;
            int y2 = CityF.getY() + 30;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class EtoG extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.black);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityE.getX() + 75;
            int y1 = CityE.getY() + 45;
            int x2 = CityG.getX() + 80;
            int y2 = CityG.getY();
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class EtoH extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.black);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityE.getX() + 75;
            int y1 = CityE.getY() + 45;
            int x2 = CityH.getX() - 10;
            int y2 = CityH.getY() + 20;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class EtoI extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.black);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityE.getX() + 75;
            int y1 = CityE.getY() + 45;
            int x2 = CityI.getX();
            int y2 = CityI.getY() + 52;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class EtoJ extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.black);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityE.getX() + 75;
            int y1 = CityE.getY() + 45;
            int x2 = CityE.getX() + 400;
            int y2 = CityE.getY() - 140;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

            g2d.drawLine(x2, y2, CityJ.getX(), CityJ.getY() + 20);

        }
    }

    class FtoG extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.ORANGE);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityF.getX() + 75;
            int y1 = CityF.getY() + 25;
            int x2 = CityF.getX() + 120;
            int y2 = CityF.getY() + 100;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

            g2d.drawLine(x2, y2, CityG.getX() + 80, CityG.getY());

        }
    }

    class FtoH extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.ORANGE);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityF.getX() + 75;
            int y1 = CityF.getY() + 25;
            int x2 = CityH.getX() - 10;
            int y2 = CityH.getY() + 20;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);
            g2d.drawLine(x2, y2, CityH.getX() - 10, CityH.getY() + 20);

        }
    }

    class FtoI extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.ORANGE);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityF.getX() + 75;
            int y1 = CityF.getY() + 25;
            int x2 = CityI.getX();
            int y2 = CityI.getY() + 52;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class FtoJ extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.ORANGE);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityF.getX() + 75;
            int y1 = CityF.getY() + 25;
            int x2 = CityJ.getX();
            int y2 = CityJ.getY() + 45;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class GtoH extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.CYAN);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityG.getX() + 75;
            int y1 = CityG.getY() + 25;
            int x2 = CityH.getX() - 10;
            int y2 = CityH.getY() + 20;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class GtoI extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.CYAN);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityG.getX() + 75;
            int y1 = CityG.getY() + 25;
            int x2 = CityG.getX() + 350;
            int y2 = CityG.getY() - 350;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

            g2d.drawLine(x2, y2, CityI.getX(), CityI.getY() + 52);

        }
    }

    class GtoJ extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.CYAN);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityG.getX() + 75;
            int y1 = CityG.getY() + 25;
            int x2 = CityJ.getX();
            int y2 = CityJ.getY() + 45;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class HtoI extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.MAGENTA);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityH.getX();
            int y1 = CityH.getY();
            int x2 = CityI.getX() + 35;
            int y2 = CityI.getY() + 50;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class HtoJ extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.MAGENTA);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityH.getX();
            int y1 = CityH.getY();
            int x2 = CityJ.getX() + 35;
            int y2 = CityJ.getY() + 50;
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

        }
    }

    class ItoJ extends JLabel {

        private String text;

        public void setText(String text) {
            this.text = text;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.gray);
            Stroke stroke = new BasicStroke(2f);
            g2d.setStroke(stroke);
            int x1 = CityI.getX() + 15;
            int y1 = CityI.getY() + 50;
            int x2 = CityJ.getX() + 35;
            int y2 = CityJ.getY();
            g2d.drawLine(x1, y1, x2, y2);

            Font font = new Font("Arial", Font.PLAIN, 12);
            g2d.setFont(font);
            FontMetrics fontMetrics = g2d.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(text);
            int textHeight = fontMetrics.getHeight();
            int textX = (x1 + x2 - textWidth) / 2;
            int textY = (y1 + y2 + textHeight) / 2;
            g2d.drawString(text, textX, textY);

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

        CityA = new javax.swing.JLabel();
        CityB = new javax.swing.JLabel();
        CityC = new javax.swing.JLabel();
        CityD = new javax.swing.JLabel();
        CityE = new javax.swing.JLabel();
        CityF = new javax.swing.JLabel();
        CityG = new javax.swing.JLabel();
        CityH = new javax.swing.JLabel();
        CityI = new javax.swing.JLabel();
        CityJ = new javax.swing.JLabel();
        btnIdentifyShortestPathCheck = new fitos_games.LableRound();
        btnExit = new fitos_games.LableRound();
        lblStartFromCity = new javax.swing.JLabel();
        txtIdentifyShortestPathAnswer = new javax.swing.JTextField();
        AtoB = new AtoB();
        AtoC = new AtoC();
        AtoD = new AtoD();
        AtoE = new AtoE();
        AtoF = new AtoF();
        AtoG = new AtoG();
        AtoH = new AtoH();
        AtoJ = new AtoJ();
        AtoI = new AtoI();
        BtoC = new BtoC();
        BtoD = new BtoD();
        BtoE = new BtoE();
        BtoF = new BtoF();
        BtoG = new BtoG();
        BtoH = new BtoH();
        BtoI = new BtoI();
        BtoJ = new BtoJ();
        CtoD = new CtoD();
        CtoE = new CtoE();
        CtoF = new CtoF();
        CtoG = new CtoG();
        CtoH = new CtoH();
        CtoI = new CtoI();
        CtoJ = new CtoJ();
        DtoE = new DtoE();
        DtoF = new DtoF();
        DtoG = new DtoG();
        DtoH = new DtoH();
        DtoI = new DtoI();
        DtoJ = new DtoJ();
        EtoF = new EtoF();
        EtoG = new EtoG();
        EtoH = new EtoH();
        EtoI = new EtoI();
        EtoJ = new EtoJ();
        FtoG = new FtoG();
        FtoH = new FtoH();
        FtoI = new FtoI();
        FtoJ = new FtoJ();
        GtoH = new GtoH();
        GtoI = new GtoI();
        GtoJ = new GtoJ();
        HtoI = new HtoI();
        HtoJ = new HtoJ();
        ItoJ = new ItoJ();
        lblStartFromCityInput = new javax.swing.JLabel();
        lblEndToCityInput = new javax.swing.JLabel();
        EndToCityInput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CityA.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CityA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CityA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cityA.png"))); // NOI18N
        CityA.setText("A");
        getContentPane().add(CityA, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 63, -1, -1));

        CityB.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CityB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cityB.png"))); // NOI18N
        CityB.setText("B");
        getContentPane().add(CityB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 720, -1, -1));

        CityC.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CityC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cityC.png"))); // NOI18N
        CityC.setText("C");
        getContentPane().add(CityC, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 640, -1, -1));

        CityD.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CityD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cityD.png"))); // NOI18N
        CityD.setText("D");
        getContentPane().add(CityD, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 190, -1, -1));

        CityE.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CityE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cityE.png"))); // NOI18N
        CityE.setText("E");
        getContentPane().add(CityE, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        CityF.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CityF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cityF.png"))); // NOI18N
        CityF.setText("F");
        getContentPane().add(CityF, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        CityG.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CityG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cityG.png"))); // NOI18N
        CityG.setText("G");
        getContentPane().add(CityG, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 652, -1, -1));

        CityH.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CityH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cityH.png"))); // NOI18N
        CityH.setText("H");
        getContentPane().add(CityH, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 470, -1, -1));

        CityI.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CityI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cityI.png"))); // NOI18N
        CityI.setText("I");
        getContentPane().add(CityI, new org.netbeans.lib.awtextra.AbsoluteConstraints(683, 36, -1, -1));

        CityJ.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CityJ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cityJ.png"))); // NOI18N
        CityJ.setText("J");
        getContentPane().add(CityJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, -1, -1));

        btnIdentifyShortestPathCheck.setBackground(new java.awt.Color(153, 153, 255));
        btnIdentifyShortestPathCheck.setForeground(new java.awt.Color(255, 255, 255));
        btnIdentifyShortestPathCheck.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIdentifyShortestPathCheck.setText("Check");
        btnIdentifyShortestPathCheck.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnIdentifyShortestPathCheck.setRoundBottomLeft(60);
        btnIdentifyShortestPathCheck.setRoundBottomRight(60);
        btnIdentifyShortestPathCheck.setRoundTopLeft(60);
        btnIdentifyShortestPathCheck.setRoundTopRight(60);
        btnIdentifyShortestPathCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIdentifyShortestPathCheckMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIdentifyShortestPathCheckMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIdentifyShortestPathCheckMouseExited(evt);
            }
        });
        getContentPane().add(btnIdentifyShortestPathCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 310, 233, 55));

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
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 390, 233, 55));

        lblStartFromCity.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblStartFromCity.setForeground(new java.awt.Color(0, 0, 0));
        lblStartFromCity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStartFromCity.setText("Start From City");
        lblStartFromCity.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblStartFromCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 70, 233, 47));

        txtIdentifyShortestPathAnswer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtIdentifyShortestPathAnswer.setForeground(new java.awt.Color(0, 0, 0));
        txtIdentifyShortestPathAnswer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdentifyShortestPathAnswer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtIdentifyShortestPathAnswer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdentifyShortestPathAnswerMouseClicked(evt);
            }
        });
        txtIdentifyShortestPathAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentifyShortestPathAnswerActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdentifyShortestPathAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 220, 233, 58));
        getContentPane().add(AtoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(AtoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(AtoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(AtoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(AtoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 852));
        getContentPane().add(AtoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(AtoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(AtoJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(AtoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(BtoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(BtoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(BtoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(BtoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(BtoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(BtoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(BtoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(BtoJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(CtoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(CtoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(CtoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(CtoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(CtoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(CtoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(CtoJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(DtoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(DtoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(DtoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(DtoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(DtoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(DtoJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(EtoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(EtoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(EtoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(EtoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(EtoJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(FtoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(FtoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(FtoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(FtoJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(GtoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(GtoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(GtoJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(HtoI, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(HtoJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));
        getContentPane().add(ItoJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 850));

        lblStartFromCityInput.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblStartFromCityInput.setForeground(new java.awt.Color(0, 0, 0));
        lblStartFromCityInput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStartFromCityInput.setText("A");
        lblStartFromCityInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblStartFromCityInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 70, 60, 47));

        lblEndToCityInput.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblEndToCityInput.setForeground(new java.awt.Color(0, 0, 0));
        lblEndToCityInput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEndToCityInput.setText("J");
        lblEndToCityInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lblEndToCityInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 130, 60, 47));

        EndToCityInput.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        EndToCityInput.setForeground(new java.awt.Color(0, 0, 0));
        EndToCityInput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EndToCityInput.setText("End To City");
        EndToCityInput.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(EndToCityInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 130, 233, 47));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIdentifyShortestPathCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIdentifyShortestPathCheckMouseClicked
        if (txtIdentifyShortestPathAnswer.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Fill the answer text", "Error...", JOptionPane.ERROR_MESSAGE);
        } else if (!txtIdentifyShortestPathAnswer.getText().matches("^[0-9]*")) {
            JOptionPane.showMessageDialog(this, "You can only provide the numbers", "Error...", JOptionPane.ERROR_MESSAGE);
        } else {
            int distanceOfCities = ctrl.start(distance, lblEndToCityInput.getText());
            System.out.println("Distance of cities = " + distanceOfCities);
            if (distanceOfCities == Integer.parseInt(txtIdentifyShortestPathAnswer.getText())) {
                JOptionPane.showMessageDialog(this, "Congradulations You won the game", "Done...", JOptionPane.INFORMATION_MESSAGE);
                saveUserDetails();
            } else {
                JOptionPane.showMessageDialog(this, "Seems Like values are mismatching try again", "Error...", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnIdentifyShortestPathCheckMouseClicked

    private void saveUserDetails() {
        String cities = AtoI.getText() + " "
                + AtoJ.getText() + " "
                + AtoF.getText() + " "
                + AtoB.getText() + " "
                + AtoE.getText() + " "
                + EtoG.getText() + " "
                + BtoE.getText() + " "
                + BtoC.getText() + " "
                + CtoH.getText() + " "
                + DtoH.getText() + " "
                + DtoJ.getText();

        String playerName = JOptionPane.showInputDialog(this, "Enter Your Name", "", JOptionPane.QUESTION_MESSAGE);

        try {
            if (ctrl.savePlayerDetails(playerName, cities)) {
                JOptionPane.showMessageDialog(this, "Player details saved successfully", "Saved", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Unable to save player details please try again", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Message : "+ex, "Error", JOptionPane.ERROR_MESSAGE);
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Message : "+ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnIdentifyShortestPathCheckMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIdentifyShortestPathCheckMouseEntered
        // TODO add your handling code here:
        btnIdentifyShortestPathCheck.setBackground(Color.white);
        btnIdentifyShortestPathCheck.setForeground(Color.decode("#9999FF"));
    }//GEN-LAST:event_btnIdentifyShortestPathCheckMouseEntered

    private void btnIdentifyShortestPathCheckMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIdentifyShortestPathCheckMouseExited
        // TODO add your handling code here:
        btnIdentifyShortestPathCheck.setBackground(Color.decode("#9999FF"));
        btnIdentifyShortestPathCheck.setForeground(Color.white);
    }//GEN-LAST:event_btnIdentifyShortestPathCheckMouseExited

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
        Home hm = new Home();
        hm.setVisible(true);
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

    private void txtIdentifyShortestPathAnswerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdentifyShortestPathAnswerMouseClicked
        // TODO add your handling code here:
        txtIdentifyShortestPathAnswer.setText("");

    }//GEN-LAST:event_txtIdentifyShortestPathAnswerMouseClicked

    private void txtIdentifyShortestPathAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentifyShortestPathAnswerActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtIdentifyShortestPathAnswerActionPerformed

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
            java.util.logging.Logger.getLogger(IdentifyShortestPathGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IdentifyShortestPathGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IdentifyShortestPathGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IdentifyShortestPathGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IdentifyShortestPathGame().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AtoB;
    private javax.swing.JLabel AtoC;
    private javax.swing.JLabel AtoD;
    private javax.swing.JLabel AtoE;
    private javax.swing.JLabel AtoF;
    private javax.swing.JLabel AtoG;
    private javax.swing.JLabel AtoH;
    private javax.swing.JLabel AtoI;
    private javax.swing.JLabel AtoJ;
    private javax.swing.JLabel BtoC;
    private javax.swing.JLabel BtoD;
    private javax.swing.JLabel BtoE;
    private javax.swing.JLabel BtoF;
    private javax.swing.JLabel BtoG;
    private javax.swing.JLabel BtoH;
    private javax.swing.JLabel BtoI;
    private javax.swing.JLabel BtoJ;
    private javax.swing.JLabel CityA;
    private javax.swing.JLabel CityB;
    private javax.swing.JLabel CityC;
    private javax.swing.JLabel CityD;
    private javax.swing.JLabel CityE;
    private javax.swing.JLabel CityF;
    private javax.swing.JLabel CityG;
    private javax.swing.JLabel CityH;
    private javax.swing.JLabel CityI;
    private javax.swing.JLabel CityJ;
    private javax.swing.JLabel CtoD;
    private javax.swing.JLabel CtoE;
    private javax.swing.JLabel CtoF;
    private javax.swing.JLabel CtoG;
    private javax.swing.JLabel CtoH;
    private javax.swing.JLabel CtoI;
    private javax.swing.JLabel CtoJ;
    private javax.swing.JLabel DtoE;
    private javax.swing.JLabel DtoF;
    private javax.swing.JLabel DtoG;
    private javax.swing.JLabel DtoH;
    private javax.swing.JLabel DtoI;
    private javax.swing.JLabel DtoJ;
    private javax.swing.JLabel EndToCityInput;
    private javax.swing.JLabel EtoF;
    private javax.swing.JLabel EtoG;
    private javax.swing.JLabel EtoH;
    private javax.swing.JLabel EtoI;
    private javax.swing.JLabel EtoJ;
    private javax.swing.JLabel FtoG;
    private javax.swing.JLabel FtoH;
    private javax.swing.JLabel FtoI;
    private javax.swing.JLabel FtoJ;
    private javax.swing.JLabel GtoH;
    private javax.swing.JLabel GtoI;
    private javax.swing.JLabel GtoJ;
    private javax.swing.JLabel HtoI;
    private javax.swing.JLabel HtoJ;
    private javax.swing.JLabel ItoJ;
    private fitos_games.LableRound btnExit;
    private fitos_games.LableRound btnIdentifyShortestPathCheck;
    private javax.swing.JLabel lblEndToCityInput;
    private javax.swing.JLabel lblStartFromCity;
    private javax.swing.JLabel lblStartFromCityInput;
    private javax.swing.JTextField txtIdentifyShortestPathAnswer;
    // End of variables declaration//GEN-END:variables
}
