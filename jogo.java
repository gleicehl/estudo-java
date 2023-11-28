import java.util.Scanner;

// Classe que representa o tabuleiro
class Board {
    private char[][] board;

    public Board() {
        board = new char[3][3];
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }

    public boolean isCellEmpty(int row, int col) {
        return board[row][col] == ' ';
    }

    public void setMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    public boolean checkWin(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) {
                return true;
            }
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) {
                return true;
            }
        }
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) {
            return true;
        }
        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol) {
            return true;
        }
        return false;
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

// Classe que controla o fluxo do jogo
class Game {
    private Board board;
    private char currentPlayerSymbol;

    public Game() {
        board = new Board();
        currentPlayerSymbol = 'X';
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        int row, col;

        do {
            board.printBoard();
            System.out.println("Player " + currentPlayerSymbol + ", enter your move (row[1-3] column[1-3]): ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
        } while (!isValidMove(row, col));

        board.setMove(row, col, currentPlayerSymbol);

        if (board.checkWin(currentPlayerSymbol)) {
            board.printBoard();
            System.out.println("Player " + currentPlayerSymbol + " wins!");
        } else if (board.isBoardFull()) {
            board.printBoard();
            System.out.println("It's a draw!");
        } else {
            currentPlayerSymbol = (currentPlayerSymbol == 'X') ? 'O' : 'X';
            startGame();
        }
        scanner.close();
    }

    private boolean isValidMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            System.out.println("Invalid move. Please try again.");
            return false;
        } else if (!board.isCellEmpty(row, col)) {
            System.out.println("Cell already occupied. Please try again.");
            return false;
        }
        return true;
    }
}

// Classe principal que executa o jogo
public class jogo {
    public static void main(String[] args) {
        Game game = new Game();
        game.startGame();
    }
}
