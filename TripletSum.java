package triplet.sum;
import java.util.Arrays;

public class TripletSum {
	public static boolean find3Numbers(int A[], int n, int X) {
		// Your code Here
		Arrays.sort(A);
		for (int i = 0; i < n - 2; i++) {
			int left = i + 1;
			int right = n - 1;
			while (left < right) {
				if (A[left] + A[right] + A[i] == X) {
					return true;
				} else if (A[left] + A[right] + A[i] < X) {
					left++;
				} else {
					right--;
				}
			}
		}

		return false;

	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		System.out.println(arr,arr.length,16);
	}

}
