// Median of two sorted arrays

// https://practice.geeksforgeeks.org/problems/median-of-2-sorted-arrays-of-different-sizes/1

import java.util.Scanner;
import java.util.Arrays;
    
    public class Solution {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n1 = in.nextInt();
            int[] arr1 = new int[n1];
            for (int i = 0; i < n1; i++) {
                arr1[i] = in.nextInt();
            }
            int n2 = in.nextInt();
            int[] arr2 = new int[n2];
            for (int i = 0; i < n2; i++) {
                arr2[i] = in.nextInt();
            }
            int[] arr = new int[n1 + n2];
            System.arraycopy(arr1, 0, arr, 0, n1);
            System.arraycopy(arr2, 0, arr, n1, n2);
            Arrays.sort(arr);
            int median = 0;
            if (n1 % 2 == 0) {
                median = (arr[n1 / 2 - 1] + arr[n1 / 2]) / 2;
            } else {
                median = arr[n1 / 2];
            }
            System.out.println(median);
        }
    }
