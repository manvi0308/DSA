public class Solution {
    // Leetcode: Search a 2D Matrix
    // https://leetcode.com/problems/search-a-2d-matrix/
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int row = matrix.length;
        int col = matrix[0].length;

        int start = 0;
        int end = row * col - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = matrix[mid / col][mid % col];

            if (midVal == target) {
                return true;
            } else if (midVal < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }

}