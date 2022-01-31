package sorting;

public class CountingSort {
	
	public static void main(String[] args) {
		CountingSort obj = new CountingSort();
		int arr[] = {3,4,1,5,7,9};
		int n = arr.length;
		obj.countSort(arr, n);
		
		for(int i: arr ) {
			System.out.print(i +" ");
		}
	}

	 void countSort(int array[], int size) {
		   

		    // Find the largest element of the array
		    int max = array[0];
		    for (int i = 1; i < size; i++) {
		      if (array[i] > max)
		        max = array[i];
		    }
		    int[] count = new int[max + 1];

		    // Initialize count array with all zeros.
		    for (int i = 0; i < max+1; ++i) {
		      count[i] = 0;
		    }

		    // Store the count of each element
		    for (int i = 0; i < size; i++) {
		      count[array[i]]++;
		    }

		    // Store the cummulative count of each array
		    for (int i = 1; i <max+1; i++) {
		      count[i] += count[i - 1];
		    }

		    int[] output = new int[size];
		    
		    // Find the index of each element of the original array in count array, and
		    // place the elements in output array
		    for (int i = size - 1; i >= 0; i--) {
		      output[count[array[i]] - 1] = array[i];
		      count[array[i]]--;
		    }

		    // Copy the sorted elements into original array
		    for (int i = 0; i < size; i++) {
		      array[i] = output[i];
		    }
	 }

}
