package sorting;

public class QuickSort {
	
	public static void main(String[] args) {
		QuickSort obj = new QuickSort();
		int arr[] = {3,4,1,2,10,7,9};
		int n = arr.length;
		obj.sort(arr, 0, n-1);
		
		for(int i: arr ) {
			System.out.println(i);
		}
	}

	private void sort(int[] arr, int p, int r) {
		// TODO Auto-generated method stub
		if(p < r) {
			int value = partition(arr,p,r);
			sort(arr,p,value-1);
			sort(arr,value+1,r);
		}
		
	}

	private int partition(int[] arr, int p, int r) {
		// TODO Auto-generated method stub
		int x = arr[r];
		int i = p-1;
		for(int j=p;j<=r-1;j++) {
			if(arr[j] < x) {
				i = i+1;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[r];
		arr[r] = temp;
		return i+1;
	}

	

}
