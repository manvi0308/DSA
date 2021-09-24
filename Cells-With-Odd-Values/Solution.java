// cells with odd values in a matrix
// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
// https://leetcode.com/submissions/detail/180583838/   
// Runtime: 1 ms, faster than 100.00% of Java online submissions for Cells with Odd Values in a Matrix.
// Memory Usage: 39.8 MB, less than 100.00% of Java online submissions for Cells with Odd Values in a Matrix.


class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[][] matrix = new int[n][m];
        for (int i = 0; i < indices.length; i++) {
            int row = indices[i][0];
            int col = indices[i][1];
            for (int j = 0; j < m; j++) {
                matrix[row][j]++;
            }
            for (int j = 0; j < n; j++) {
                matrix[j][col]++;
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}