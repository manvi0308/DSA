package intersectionofarrays;

import java.util.ArrayList;

public class Intersection {
	// handling duplicates
	static void union(int[] a1, int[] a2) {
		// finding the size of the frequency array
		int m = a1[a1.length - 1];
		int n = a2[a2.length - 1];
		int size = ((m > n) ? m : n);
		// System.out.println(size);
		int[] freq = new int[size + 1]; // CHECK HERE

		// First element will always be present
		System.out.println(a1[0]);
		freq[a1[0]]++;

		// Iterating over a1 while comparing adjacent elements
		for (int i = 1; i < a1.length; i++) {
			if (a1[i] != a1[i - 1]) {
				System.out.println(a1[i]);
				freq[a1[i]]++;
			}
		}

		// Iterating over a2 and checking for only those
		// elements which are not present in a1

		for (int i = 0; i < a2.length; i++) {
			if (freq[a2[i]] == 0) {
				System.out.println(a2[i]);
				freq[a2[i]]++;

			}
		}

	}

	// handling duplicates
	static void intersection(int[] a1, int[] a2) {
		int m = a1.length;
		int n = a2.length;
		int i = 0, j = 0;
		ArrayList<Integer> al = new ArrayList<>();
		while (i < m && j < n) {
			if (a1[i] == a2[j]) {
				// if present
				if (al.contains(a1[i])) {
					i++;
					j++;
				} else {
					// if not present
					al.add(a1[i]);
					System.out.println(a1[i]);
					i++;
					j++;
				}
			}

			else if (a1[i] > a2[j]) {
				j++;
			} else {
				i++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 1, 2, 4, 5, 6 };
		int arr2[] = { 2, 3, 5, 7 };
		union(arr1, arr2);
		System.out.println("Intersection");
		intersection(arr1, arr2);
	}

}
