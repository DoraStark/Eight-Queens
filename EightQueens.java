package chess;

public class EightQueens {
    public static boolean solve(Chessboard board, int row) {
        int size = board.getSize();
        if (row == size) return true;
        for (int col = 0; col < size; col++) {
            if (board.placeQueen(row, col)) {
                if (solve(board, row + 1)) return true;
                board.removeQueen(row, col);
            }
        }
        return false;
    }
}
