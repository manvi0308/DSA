/*
 * Given a sorted array arr[] of size N. Find the element 
 * that appears only once in the array. All other elements
 * appear exactly twice. 
*/

/**
 * @author manvi0308
 *
 */
public class ElementOccuringOnce {

	/**
	 * Complete the function findOnce() which takes sorted array and its size as its
	 * input parameter and returns the element that appears only once.
	 */
	
	// O(N) TC
	// Simple linear traversal
	static int findOnce(int arr[], int n) 
	{
		// Complete this function
		int index = 0;
		for(int i = 0; i < n; i+=2)
		{
			if(arr[i] != arr[i+1])
			{
				index = i;
				break;
			}
		}
		
		// if the last element appears only once
		if(arr[n-2] != arr[n-1])
			index = n-1;
		
		return arr[index];
		
	}
	
	// Based on XOR of two elements property
	// O(N) TC
	static int findOnceApp2(int[] arr, int n)
	{
		int XOR = 0;
		for(int i = 0; i < n; i++)
		{
			XOR = XOR ^ arr[i];
		}
		return XOR;
	}
	
	// Based on binary search
	// O(log N) TC
	static int findOnceApp3(int[] arr, int n)
	{
		// Before the single freq element
		// the first occ of any element will be at even index
		// and the second occ of any element will be at odd index
		// After the single freq element
		// the reverse will hold true
		int low = 0;
		int high = n -1;
		if(low == high)
		{
			return arr[low];
		}
		
		int mid = low + (high - low)/2;
		
		if(mid%2 == 0)
		{
			if(arr[mid] == arr[mid + 1])
			{
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		else if(mid%2 == 1){
			if(arr[mid] == arr[mid - 1]) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		
		return mid;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 1, 2, 2, 3, 3,4,4, 50, 50, 65};
		System.out.println(findOnceApp3(arr, arr.length));
	}

}
