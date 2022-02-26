package heap;

public class HeapDelete {

	
	
	public static void main(String[] args) {
		
		HeapDelete hp = new HeapDelete();
		int arr[] = new int[1000];
		arr[0] = 10;
		arr[1] = 5;
		arr[2] = 3;
		arr[3] = 2;
		arr[4] = 4;
		int n= 5;
		
		hp.printHeap(arr, n);
		
		int n1 = hp.deleteRoot(arr, n);
		
		hp.printHeap(arr, n1);
	}

	private void printHeap(int[] arr, int length) {
		
		for(int i=0; i<length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

	private int deleteRoot(int[] arr, int n) {
		
		int lastElement = arr[n - 1];
		 	
        arr[0] = lastElement;
        
		n = n-1;
		heapify(arr, n, 0);
		
		return n;
	}
	
	// To heapify a subtree rooted with node i which is
    // an index in arr[].Nn is size of heap
	private void heapify(int[] A, int n, int i) {
		
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
