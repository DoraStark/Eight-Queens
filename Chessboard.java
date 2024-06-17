package chess;

public class Chessboard {
    private int[][] board;
    private int size;

    public Chessboard(int size) {
        this.size = size;
        board = new int[size][size];
    }

    public boolean placeQueen(int row, int col) {
        if (isSafe(row, col)) {
            board[row][col] = 1;
            return true;
        }
        return false;
    }

    public void removeQueen(int row, int col) {
        board[row][col] = 0;
    }

    public boolean isSafe(int row, int col) {
        for (int i = 0; i < size; i++) {
            if (board[row][i] == 1 || board[i][col] == 1) return false;
        }
        for (int i = -size + 1; i < size; i++) {
            if (isInBounds(row + i, col + i) && board[row + i][col + i] == 1) return false;
            if (isInBounds(row + i, col - i) && board[row + i][col - i] == 1) return false;
        }
        return true;
    }

    private boolean isInBounds(int row, int col) {
        return row >= 0 && row < size && col >= 0 && col < size;
    }

    public void printBoard() {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell == 1 ? "Q " : ". ");
            }
            System.out.println();
        }
    }

    public int getSize() {
        return size;
    }
}
