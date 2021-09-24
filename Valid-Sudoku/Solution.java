// Valid Sudoku
// Leetcode: https://leetcode.com/problems/valid-sudoku/
// Runtime: 1 ms, faster than 100.00% of Java online submissions for Valid Sudoku.
// Memory Usage: 36.8 MB, less than 100.00% of Java online submissions for Valid Sudoku.

class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            HashSet<Character> box = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !row.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != '.' && !col.add(board[j][i])) {
                    return false;
                }
                if (board[3 * (i / 3) + j / 3][3 * (i % 3) + j % 3] != '.' && !box.add(board[3 * (i / 3) + j / 3][3 * (i % 3) + j % 3])) {
                    return false;
                }
            }
        }
        return true;
    }
}
