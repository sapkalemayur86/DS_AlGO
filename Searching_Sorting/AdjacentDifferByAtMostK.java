/* 
 * Searching in an array where adjacent differ by at most k
 * 
 * A step array is an array of integers where each element has a difference of at most k with its neighbor.
 *  Given a key x, we need to find the index value of x if multiple-element exist to return the first 
 *  occurrence of the key.
 * 
 * 
 */


public class AdjacentDifferByAtMostK {

	public static void main(String[] args) {
     
		 int arr[] = { 2, 4, 5, 7, 7, 6 };
	        int x = 6;
	        int k = 2;
	        int n = arr.length;
	        System.out.println("Element " + x +
                    " is present at index "
                    + search(arr, n, x, k));

	}

	private static int search(int[] arr, int n, int x, int k) {
	  
		int i=0;
		while(i<n) {
			
			if(arr[i]==x)
				return i;
			
			i=i+Math.max(1,Math.abs(arr[i]-x)/k);
		}
		
		
		
		return -1;
	}

}
