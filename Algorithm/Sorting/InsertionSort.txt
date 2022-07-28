package sorting;

public class InsertionSort {
	
	void sort_method(int arr[]) {
		for(int j=1; j<arr.length; j++) {
			int key = arr[j];
			int i= j-1;
			while(i>=0 && arr[i] >key) {
				arr[i+1] = arr[i];
				i = i-1;
			}
			arr[i+1] = key;
		}
		
		
	}
	
	public static void main(String args[]) {
		
		int arr[] = {3,2,1,4};
		InsertionSort obj = new InsertionSort();
		obj.sort_method(arr);
		for(int i: arr ) {
			System.out.println(i);
		}
		
	}

}
