package main;

import towers.EmptyTowerException;
import towers.Hanoi;
import towers.TowerOrderException;
import chess.Chessboard;
import chess.EightQueens;

public class Main {
    public static void main(String[] args) {
        // TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome! ");

        for (int i = 1; i <= 5; i++) {
            // TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        // Run Towers of Hanoi
        try {
            Integer[] init = new Integer[]{8, 7, 6, 5, 4, 3, 2, 1};
            Hanoi<Integer> hanoi = new Hanoi<>(init);
            hanoi.run();
        } catch (TowerOrderException | EmptyTowerException e) {
            System.err.println("Error in Towers of Hanoi: " + e.getMessage());
        }

        // Run 8 Queens Problem
        try {
            Chessboard board = new Chessboard(8);
            if (EightQueens.solve(board, 0)) {
                board.printBoard();
            } else {
                System.out.println("No solution found for 8 queens.");
            }
        } catch (Exception e) {
            System.err.println("Error in 8 Queens Problem: " + e.getMessage());
        }
    }
}
