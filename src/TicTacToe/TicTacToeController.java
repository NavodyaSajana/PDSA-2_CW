/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicTacToe;

/**
 *
 * @author Sajana
 */
import java.util.Scanner;

public class TicTacToeController {

    private static final char HUMAN_PLAYER = 'X';
    private static final char AI_PLAYER = 'O';
    private static final char EMPTY_CELL = ' ';

    private char[][] board;

    public TicTacToeController() {
        board = new char[3][3];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY_CELL;
            }
        }
    }

    private void printBoard() {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n---------");
        }
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY_CELL) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isGameOver() {
        return checkWin(HUMAN_PLAYER) || checkWin(AI_PLAYER) || isBoardFull();
    }

    private boolean checkWin(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    private int minimax(char player) {
        if (checkWin(HUMAN_PLAYER)) {
            return -1;
        } else if (checkWin(AI_PLAYER)) {
            return 1;
        } else if (isBoardFull()) {
            return 0;
        }

        int bestScore;
        if (player == AI_PLAYER) {
            bestScore = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == EMPTY_CELL) {
                        board[i][j] = AI_PLAYER;
                        int score = minimax(HUMAN_PLAYER);
                        board[i][j] = EMPTY_CELL;
                        bestScore = Math.max(score, bestScore);
                    }
                }
            }
        } else {
            bestScore = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == EMPTY_CELL) {
                        board[i][j] = HUMAN_PLAYER;
                        int score = minimax(AI_PLAYER);
                        board[i][j] = EMPTY_CELL;
                        bestScore = Math.min(score, bestScore);
                    }
                }
            }
        }

        return bestScore;
    }

    private void makeAIMove() {
        int bestScore = Integer.MIN_VALUE;
        int bestRow = -1;
        int bestCol = -1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY_CELL) {
                    board[i][j] = AI_PLAYER;
                    int score = minimax(HUMAN_PLAYER);
                    board[i][j] = EMPTY_CELL;

                    if (score > bestScore) {
                        bestScore = score;
                        bestRow = i;
                        bestCol = j;
                    }
                }
            }
        }

        board[bestRow][bestCol] = AI_PLAYER;
    }

    private void makeHumanMove(int row, int col) {
        board[row][col] = HUMAN_PLAYER;
    }

    //This methoed based on CLI and can be use for testing purposes in this class

    public boolean isCellEmpty(int row, int col) {
        return board[row][col] == EMPTY_CELL;
    }

    //this method is designed to use in GUI
    public String play(int row, int col) {
        //use getBoard() method without using printBoard() in the implementation.
        //printBoard();
        if (!isGameOver()) {
            makeHumanMove(row, col);
            if (!isGameOver()) {
                makeAIMove();
            }
            if (isGameOver()) {
                if (checkWin(HUMAN_PLAYER)) {
                    return "HUMAN";
                } else if (checkWin(AI_PLAYER)) {
                    return "AI";
                } else {
                    return "DRAW";
                }
            }
            printBoard();
        }
        return " ";
    }
    
    public char[][] getBoard(){
        return board;
    }

}
