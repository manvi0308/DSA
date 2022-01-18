
public class BinarySearch {
	static int binarySearch(int[] arr, int low, int high, int X) {

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (arr[mid] == X)
				return mid;

			else if (arr[mid] > X)
				// high = mid - 1;
				return binarySearch(arr, low, mid - 1, X);
			else
				// low = mid + 1;
				return binarySearch(arr, mid + 1, high, X);

		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 2, 2, 3, 3, 4, 5, 6};
		System.out.println(binarySearch(arr, 0, arr.length-1, 5));
	}

}
