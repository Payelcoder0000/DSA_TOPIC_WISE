package search;

public class LinearSearch {
	
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
 
        // Function call
        int result = search(arr, x);
        
        if(result == 1)
        	System.out.println("Found");
        else
        	System.out.println("Not found");
	}

	private static int search(int[] arr, int x) {
		
		for (int i=0; i<arr.length; i++) {
			if(arr[i] ==x)
				return 1;
		}
		
		return -1;
	}

}
