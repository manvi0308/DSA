/*
 * *
 * Given a sorted array arr[] of size N without duplicates, 
 * and given a value x. Floor of x is defined as the largest
 *  element K in arr[] such that K is smaller than or equal to 
 *  x. Find the index of K(0-based indexing).
 */

/**
 * @author manvi0308
 *
 */
public class FloorInASortedArray {
	// Function to find floor of x
	// arr: input array
	// n is the size of array
	static int findFloor(long arr[], int n, long x) {
        int low = 0;
        int high = n - 1; // 0 based indexing
        int mid;
        int index = n-1;
        while(low <= high)
        {
        	mid = low + (high - low)/2;
        	if(arr[mid] == x)
        	{
        		index = mid - 1;
        	}
        	else if(arr[mid] < x)
        	{
        		low = mid + 1;
        	}
        	else {
        		high = mid - 1;
        	}
        }
        
        return index;
        
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arr = {1, 2, 3, 4, 5, 6};
		long x = 2;
		System.out.println(findFloor(arr, arr.length, x));
	}

}
