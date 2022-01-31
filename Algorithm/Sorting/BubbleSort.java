package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		int arr[] = {4,1,2,3};
		obj.sort(arr);
		
		for(int i: arr ) {
			System.out.println(i);
		}
	}

	private void sort(int[] arr) {
		// TODO Auto-generated method stub
		int n= arr.length;
		
		for(int i=0;i<n-1;i++) {
			//System.out.println("\ni= "+ i);
			for(int j=0;j<n-i-1;j++) {
				//System.out.print(j+ " ");
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}
}
