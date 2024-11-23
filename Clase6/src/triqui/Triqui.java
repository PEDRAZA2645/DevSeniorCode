package src.triqui;

import java.util.Scanner;

public class Triqui {

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        // 1. Identificar el primer jugador X u O
        // 2. Inicializar y mostrar el tablero
        // 3. Leer el movimiento del jugador
        // 4. verificar si hizo 3 en linea
        // si lo hizo, diga gano
        // sino
        // cambia de jugador
        // volver a 3
        var scanner = new Scanner(System.in);

        var player = 'X';
        var isFinished = false;
        var counter = 0;
        var board = initializeBoard();
        do {
            showBoard(board);

            System.out.printf("Jugador %c ingresa tu movimiento: %n", player);
            System.out.print("Fila (1-3): ");
            var row = scanner.nextInt() - 1;
            System.out.print("Columna (1-3): ");
            var column = scanner.nextInt() - 1;

            if (makeMove(board, row, column, player)) {
                counter++;
                if (checkWinner(board, player)) {
                    showBoard(board);
                    System.out.println("El jugador " + player + " ha ganado");
                    isFinished = true;
                } else {
                    player = player == 'X' ? 'O' : 'X';
                }

            } else {
                System.err.println("Movimiento inválido. Intenta de nuevo.");
            }

            if (counter == 9) {
                showBoard(board);
                System.out.println("Han quedado empatados.");
                isFinished = true;
            }

        } while (!isFinished);

        scanner.close();
    }

    private static boolean checkWinner(char[][] board, char player) {
        // Validar filas
        for (var row : board) {
            if (row[0] == player && row[1] == player && row[2] == player) {
                return true;
            }
        }
        // Validar columnas
        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        // Validar diagonales
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    private static boolean makeMove(char[][] board, int row, int column, char player) {
        if (board[row][column] != ' ') {
            // Ya hay un valor en esta posicion
            return false;
        }
        board[row][column] = player;
        return true;
    }

    private static void showBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                if (j < board[i].length - 1) {
                    System.out.print('|');
                }
            }
            System.out.println();
            if (i < board.length - 1) {
                System.out.println("-----");
            }
        }
    }

    private static char[][] initializeBoard() {
        var board = new char[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }

        return board;
    }
}