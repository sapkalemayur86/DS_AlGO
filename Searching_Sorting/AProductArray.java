/*
 * A Product Array Puzzle
 * Given an array arr[] of n integers, construct a Product Array prod[] (of same size) such that prod[i]
 *   is equal to the product of all the elements of arr[] except arr[i]. 
 *  Solve it without division operator in O(n) time.
 */

public class AProductArray {

	public static void main(String[] args) {
		
		int arr[]  = {10, 3, 5, 6, 2};
		int ans[]=productArray(arr,arr.length);
		System.out.println("Product Array : ");
		for(int i:ans) {
			System.out.println(i);
		}
	}

	private static int[] productArray(int[] nums, int n) {
		// code here
        int [] left = new int [n];
        int [] right = new int [n] ;
        int [] prod = new int [n];
        
        left[0]=1;
        right[n-1]=1;
        for(int i=1;i<n;i++)
        left[i]=nums[i-1]*left[i-1];
        
        for(int j=n-2;j>=0;j--)
        right[j]=nums[j+1]*right[j+1];
        
        for(int i=0;i<n;i++)
        prod[i]=left[i]*right[i];
        
        return prod;
        
	}

}
