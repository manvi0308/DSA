/*
 * Given two sorted arrays of distinct elements. 
 * There is only 1 difference between the arrays.
 * First array has one element extra added in
 * between. Find the index of the extra element.
*/

/**
 * @author manvi0308
 *
 */
public class IndexOfExtraElement {

	/**
	 * You don't have to take any input. Just complete the provided function
	 * findExtra() that takes array A[], B[] and size of A[] and return the valid
	 * index (0 based indexing)
	 */
	 public static int findExtra(int a[], int b[], int n) 
	 {
		 int index = n-1;
		 
		 int low = 0, high = n - 2;
		 int mid;
		 
		 while(low <= high)
		 {
			 mid = low + (high - low)/2;
			 if(a[mid] == b[mid])
			 {
				 low= mid + 1;
			 }
			 else {
				 index = mid;
				 high = mid - 1;
			 }
		 }
		 return index;
		 
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4, 5, 6}; // 3 is the extra element
		int[] b = {1, 2, 4, 5, 6};
		System.out.println("Extra element is: " + a[findExtra(a, b, a.length)]);
	}

}
