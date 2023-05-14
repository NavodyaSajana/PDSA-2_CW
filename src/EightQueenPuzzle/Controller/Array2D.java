/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EightQueenPuzzle.Controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Sajana
 */
public class Array2D {

    public int[][] create(String value) {
        int charCount = 0;
        int[][] array = new int[8][8];
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                array[row][col] = Integer.parseInt(value.charAt(charCount) + "");
                charCount++;
            }
        }
        return array;
    }

    public void display(int[][] array) {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                System.out.print(array[row][col]+"\t");
            }
            System.out.println();
        }
    }

    public boolean isEqual(int array1[][], int array2[][]) {
        int diffCount = 0;
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (array1[row][col] != array2[row][col]) {
                    diffCount++;
                }
            }
        }
        if (diffCount == 0) {
            return true;
        } else {
            return false;
        }
    }
}
