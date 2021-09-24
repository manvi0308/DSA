public class Demo {
    public static int findMinimumOne(int[] arr, int left, int right) {
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == arr[right]) {
                right--;
            } else if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return arr[right];

    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6 };
        System.out.println("The minimum element in the arr1 is: " + findMinimumOne(arr1, 0, arr1.length - 1));

        int[] arr2 = { 5, 6, 7, 1, 1, 2, 3, 4 };
        System.out.println("The minimum element in the arr1 is: " + findMinimumOne(arr2, 0, arr2.length - 1));

    }
}
