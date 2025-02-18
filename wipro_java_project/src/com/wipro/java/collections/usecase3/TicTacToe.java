package com.wipro.java.collections.usecase3;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3]; // Game board
    private static char currentPlayer = 'X'; // Starting player

    // Method to initialize the game board
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' '; // Empty space
            }
        }
    }

    // Method to print the game board
    public static void printBoard() {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
            System.out.println("---------");
        }
    }

    // Method to check if the current player wins
    public static boolean checkWin() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }
        // Check diagonals
        if ((board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
            (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)) {
            return true;
        }
        return false;
    }

    // Method to check if the board is full (for a draw)
    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false; // Empty space found, board is not full
                }
            }
        }
        return true; // No empty spaces, board is full
    }

    // Method to switch players
    public static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    // Method to handle a player's move
    public static boolean makeMove(int row, int col) {
        if (row < 1 || row > 3 || col < 1 || col > 3 || board[row - 1][col - 1] != ' ') {
            return false; // Invalid move
        }
        board[row - 1][col - 1] = currentPlayer; // Place the player's mark
        return true; // Move is valid
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        initializeBoard();
        printBoard();

        // Game loop
        while (true) {
            System.out.println("Player " + currentPlayer + "'s turn.");
            System.out.print("Enter row (1-3): ");
            int row = scanner.nextInt();
            System.out.print("Enter column (1-3): ");
            int col = scanner.nextInt();

            if (!makeMove(row, col)) {
                System.out.println("Invalid move! Try again.");
                continue; // Skip to next iteration of the loop
            }

            printBoard(); // Print the board after each move

            if (checkWin()) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }

            if (isBoardFull()) {
                System.out.println("It's a draw!");
                break;
            }

            // Switch player after each valid move
            switchPlayer();
        }

        scanner.close();
    }
}
