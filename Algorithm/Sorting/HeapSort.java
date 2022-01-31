package sorting;

import java.util.Arrays;

public class HeapSort {

	public static void main(String args[]) {
		int[] data = { 121, 432, 564, 23, 1, 45, 788 };
		int n = data.length;
		HeapSort rs = new HeapSort();
		rs.heapSortFunc(data, n);
		System.out.println("Sorted A in Ascending Order: ");
		System.out.println(Arrays.toString(data));
	}

	private void heapSortFunc(int[] A, int n) {
	
		for(int i= n/2-1; i>=0 ; i--) {
			heapify(A, n, i);
		}
		for(int i=n-1; i>=0; i--) {
			int temp= A[i];
			A[i] = A[0];
			A[0] = temp;
			
			heapify(A, i, 0);
		}
		
	}

	private void heapify(int[] A, int n, int i) {
		// TODO Auto-generated method stub
		int largest = i;
		int l = 2*i;
		int r= 2*i+1;
		
		if(l<n && A[l] > A[largest])
			largest = l;
		if(r<n && A[r] > A[largest])
			largest = r;
		
		if(largest != i) {
			int temp= A[i];
			A[i] = A[largest];
			A[largest] = temp;
			heapify(A, n, largest);
		}
		
	}
}
