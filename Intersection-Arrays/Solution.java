
import java.util.*;

public class Solution {
    // Intersection of two Arrays II
    // Leetcode: 350
    // https://leetcode.com/problems/intersection-of-two-arrays-ii/

    public static int[] intersect(int[] nums1, int[] nums2) {
        // Base condition when either of the array is empty
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        // & Sort the arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int m = nums1.length;
        int n = nums2.length;
        int i = 0, j = 0;

        // ^ Making a new array such that it will store the Intersection elements
        List<Integer> result = new ArrayList<>();

        while (i < m && j < n) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);

                i++;
                j++;
                //result.add(nums1[i]);
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return listToArray(result);

    }

    // ! A utility function to change an ArrayList to a normal array
    public static int[] listToArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 2, 0, 5, 3 };
        int[] arr2 = { 4, 1, 5, 6 };
        int[] res = intersect(arr1, arr2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
