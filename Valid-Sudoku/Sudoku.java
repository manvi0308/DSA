// Valid Sudoku Interview Bit
// Problem Statement:
// Write an algorithm to determine if a number is a valid Sudoku puzzle.
// The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
// A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
//
// Solution:

public class Sudoku {
    public int isValidSudoku(char[][] board) {
        int[] row = new int[9];
        int[] col = new int[9];
        int[] box = new int[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    int boxIndex = (i / 3) * 3 + j / 3;
                    if (row[i] >> num & 1 == 1 || col[j] >> num & 1 == 1 || box[boxIndex] >> num & 1 == 1) {
                        return 0;
                    }
                    row[i] |= 1 << num;
                    col[j] |= 1 << num;
                    box[boxIndex] |= 1 << num;
                }
}
