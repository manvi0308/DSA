package strings;

public class MultiplyLeftAndRight {
	 // Function for finding maximum and value pair
    public static int multiply (int arr[], int n) {
        //Complete the function
    	int res = 0;
    
    	int mid = n/2;
    	
    	int s1 = 0, s2 = 0;
    	//System.out.println(mid);
    	for(int i = 0; i < mid; i++)
    	{
    		//System.out.print(arr[i]);
    		s1 = s1 + arr[i];
    	}
    	for(int i = mid; i < n; i++)
    	{
    		//System.out.print(arr[i]);
    		s2 = s2 + arr[i];
    	}
    	res = s1 * s2;
    	return res;
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 2, 3, 4};
		System.out.println(multiply(arr, arr.length));
	}

}
