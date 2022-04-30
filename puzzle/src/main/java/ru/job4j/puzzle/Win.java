package ru.job4j.puzzle;

public class Win {

    public static boolean check(int[][] board) {
        boolean rsl = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && (Win.proverkaHoriz(board, i) || Win.proverkaVert(board, i))) {
                rsl = true;
                break;
            }
    }
        return rsl;
}

    public static boolean proverkaHoriz(int[][] line, int row) {
        boolean result = true;
        for (int cell = 0; cell < line[row].length; cell++) {
            if (line[row][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean proverkaVert(int[][] column, int cell) {
        boolean result = true;
        for (int row = 0; row < column.length; row++) {
            if (column[row][cell] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

}
