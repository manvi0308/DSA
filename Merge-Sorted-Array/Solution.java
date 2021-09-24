// Merge Sorted Array
// Leetcode: 88
// Problem: https://leetcode.com/problems/merge-sorted-array/
// Solution: https://leetcode.com/submissions/detail/180581697/
// Runtime: 1 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
// Memory Usage: 39.8 MB, less than 100.00% of Java online submissions for Merge Sorted Array.

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}