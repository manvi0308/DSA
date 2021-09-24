public class FindMinimum {
    static int findMinimum(int[] arr, int left, int right) {
        // Case 1: When the array is not rotated
        // {1, 2, 3, 4}
        if (right < left) {
            return arr[0];
        }
        // Case 2: When the array contains only one element or after
        // repeated iterations only one element is left to be compared
        // {1}
        if (right == left) {
            return arr[left];
        }

        int mid = left + (right - left) / 2;

        // Case 3: Check if the middle element is the minimum element
        // by comparing it with the previous element.
        // {5, 6, 7, 1, 2, 3, 4}
        if (mid > left && arr[mid] < arr[mid - 1]) {
            return arr[mid];
        }

        // Case 4: Check if the element at position ( mid + 1 ) is
        // the minimum element by comparing it with the element at mid
        // position
        // {3, 4, 5, 1, 2}
        if (mid < right && arr[mid + 1] < arr[mid]) {
            return arr[mid + 1];
        }

        // Case 5: When the minimum element lies in the left half
        // {1, 2, 3, 4, 5}
        if (arr[right] > arr[mid]) {
            return findMinimum(arr, left, mid - 1);
        }

        // Case 6: When the minimum element lies in the right half
        // {3, 4, 5, 6, 7, 1, 2}
        else {
            return findMinimum(arr, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("Minimum element in arr1 is: ");
        System.out.println(findMinimum(arr1, 0, arr1.length - 1));

        int[] arr2 = { 4, 5, 6, 7, 8, 1, 2, 3 };
        System.out.println("Minimum element in arr2 is: ");
        System.out.println(findMinimum(arr2, 0, arr2.length - 1));

        int[] arr3 = {3, 4, 5, 6, 7, 8, 1, 2};
        System.out.println("Minimum element in arr2 is: ");
        System.out.println(findMinimum(arr3, 0, arr3.length - 1));

        int[] arr4 = {2, 3, 4, 5, 6, 7, 8, 1};
        System.out.println("Minimum element in arr4 is: ");
        System.out.println(findMinimum(arr4, 0, arr4.length - 1));

    }
}
