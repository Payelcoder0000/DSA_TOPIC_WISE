package sorting;

public class SelectionSort {
	
	public static void main(String[] args) {
		SelectionSort obj = new SelectionSort();
		int arr[] = {3,2,5,10,1,1000};
		obj.sort(arr);
		
		for(int i: arr ) {
			System.out.println(i);
		}
	}

	private void sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			
			int key_pos = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[key_pos]) {
					key_pos = j;
				}
			}
			int temp = arr[key_pos];
			arr[key_pos] = arr[i];
			arr[i]= temp;
		}
		
		
	}

}
