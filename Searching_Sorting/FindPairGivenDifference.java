/*
 *  Find Pair Given Difference
 *   Given an array Arr[] of size L and a number N,
 *   you need to write a program to find if there exists a 
 *   pair of elements in the array whose difference is N.
 *  
 */

import java.util.Arrays;

public class FindPairGivenDifference {

	public static void main(String[] args) {
		 
	 int arr[] = {5, 20, 3, 2, 5, 80};
	 int size=arr.length;
	 int n=78;
	 
	 if(findPair(arr,size,n)==true) {
		 System.out.println("Pair Found");
		 
	 }
	 else
		 System.out.println("Pair not Found");

	}

	private static boolean findPair(int[] arr, int size, int n) {
        Arrays.sort(arr);
        
        int i=0;
        int j=1;
        while(i<size && j<size){
            if(i!=j && arr[j]-arr[i]==n){
                return true;
            }
            else if(arr[j]-arr[i]<n)
            j++;
            else
            i++;
        }
		return false;
	}

}
