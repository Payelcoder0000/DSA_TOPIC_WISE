package search;

public class BinearySearch {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
 
        int n= arr.length;
        // Function call
        int result = search(arr,0 , n-1, x);
        
        if(result == -1)
        	System.out.println("Not Found");
        else
        	System.out.println("Found at position "+ result);
	}

	private static int search(int[] arr, int start, int end, int x) {
		
		if(end >= start) {
		int mid = (start + end)/2; 
		if(arr[mid] ==x) return mid;
		if(x< arr[mid]) return search(arr, start, mid-1, x);
		else if( x> arr[mid]) return search(arr, mid+1, end, x);
		}
		return -1;
	}

	
}
