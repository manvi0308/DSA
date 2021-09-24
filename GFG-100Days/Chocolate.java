
public class Chocolate {
      // Function for finding maximum and value pair
      public static int chocolates (int arr[], int n) {
        //Complete the function
        int start = 0;
        int end = n - 1;
        while(start < end)
        {
            if(arr[start] > arr[end])
            {
                start++;
            }else{
                end--;
            }
        }

        return arr[start];
        
    }
    public static void main(String[] args) {
        int arr[ ] = {5, 9, 2, 6};
        System.out.println(chocolates(arr, arr.length));
    }
}
