package kadane;

public class Kadane {
	long maxSubarraySum(int arr[], int n) {
		// Your code here
		long max_so_far = Integer.MIN_VALUE;
		long max_ending_here = 0;

		for (int i = 0; i < n; i++) {
			max_ending_here = max_ending_here + arr[i];

			if (max_ending_here < 0) {
				max_ending_here = 0;
			}

			if (max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}
		}

		return max_so_far;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
