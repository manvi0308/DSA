public class LinearSearch {
    public static int findMinimum(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }

        return min;
    }
    public static void main(String[] args) {
        int[] arr1 = {6, 7, 8, 9, 10, 1, 2, 3, 4, 5};
        System.out.println("The minimum element in the array is: " +findMinimum(arr1));
        int[] arr2 = {0, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("The minimum element in the array is: " +findMinimum(arr2));
    }
}
