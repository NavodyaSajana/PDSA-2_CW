/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fitos_games;

import EightQueenPuzzle.Controller.EightQueenPuzzleController;

/**
 *
 * @author Sajana
 */
public class FITOS_Games {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EightQueenPuzzleController ctrl = new EightQueenPuzzleController();
        ctrl.checkPatterns("0001000000000010001000000000000101000000000010001000000000000101");
    }
    
}
