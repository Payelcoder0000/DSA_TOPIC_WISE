package heap;

public class HeapInsert {

	
	
	public static void main(String[] args) {
		
		HeapInsert hp = new HeapInsert();
		int arr[] = new int[1000];
		arr[0] = 10;
		arr[1] = 5;
		arr[2] = 3;
		arr[3] = 2;
		arr[4] = 4;
		int n= 5;
		
		hp.printHeap(arr, n);
		
		hp.insertKey(arr, n, 15);
		
		hp.printHeap(arr, n+1);
	}

	private void printHeap(int[] arr, int length) {
		
		for(int i=0; i<length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

	private void insertKey(int[] arr, int n, int key) {
		
		n = n+1;
		arr[n-1] = key;
		heapify(arr, n, n-1);
	}
	
	// Function to heapify ith node in a Heap
	// of size n following a Bottom-up approach
	private void heapify(int[] arr, int n, int i) {
		
		int parent = (i-1)/2;
		if(arr[parent] >0) {
			
			if(arr[i] > arr[parent]) {
			int temp = arr[parent];
			arr[parent] = arr[i];
			arr[i] = temp;
			
			heapify(arr, n, parent);
			}
		}
		
	}

	


}
