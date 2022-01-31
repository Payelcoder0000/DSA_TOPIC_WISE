package sorting;

import java.util.Arrays;

class RadixSort {

// Using counting sort to sort the elements in the basis of significant places
	void countingSort(int A[], int n, int place) {
		
		int max = A[0];
		for (int i = 1; i < n; i++) {
			if (A[i] > max)
				max = A[i];
		}
		int[] count = new int[max + 1];

		for (int i = 0; i < max+1; ++i)
			count[i] = 0;

		// Calculate count of elements
		for (int i = 0; i < n; i++) {
			//System.out.print(A[i] +":"+ ((A[i] / place)%10)+" ");
			count[(A[i] / place) % 10]++;
			
		}
		//System.out.println("");

		// Calculate cumulative count
		for (int i = 1; i < max+1; i++)
			count[i] += count[i - 1];
		
		int[] output = new int[n];

		// Place the elements in sorted order
		for (int i = n - 1; i >= 0; i--) {
			output[count[(A[i] / place) % 10] - 1] = A[i];
			count[(A[i] / place) % 10]--;
		}

		for (int i = 0; i < n; i++)
			A[i] = output[i];
	}

// Function to get the largest element from an A
	int getMax(int A[], int n) {
		int max = A[0];
		for (int i = 1; i < n; i++)
			if (A[i] > max)
				max = A[i];
		return max;
	}

// Main function to implement radix sort
	void radixSortFunc(int A[], int n) {
		// Get maximum element
		int max = getMax(A, n);

		// Apply counting sort to sort elements based on place value.
		for (int place = 1; max / place > 0; place *= 10)
			countingSort(A, n, place);
	}

// Driver code
	public static void main(String args[]) {
		int[] data = { 121, 432, 564, 23, 1, 45, 788 };
		int n = data.length;
		RadixSort rs = new RadixSort();
		rs.radixSortFunc(data, n);
		System.out.println("Sorted A in Ascending Order: ");
		System.out.println(Arrays.toString(data));
	}
}