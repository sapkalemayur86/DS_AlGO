/*
 * Merge Without Extra Space
 * Given two sorted arrays arr1[] of size N and arr2[] of size M. Each array is sorted in non-decreasing order.
 *  Merge the two arrays into one sorted array in non-decreasing order without using any extra space.
 */

import java.util.Arrays;

public class MeargeArrays {

	public static void main(String[] args) {
		
		int arr1[]= {1,4,5,7};
		int arr2[]= {2,3,6,9};
		mearge(arr1,arr2,arr1.length,arr2.length);
	    for(int i:arr1)
		System.out.print(i);
	    for(int i:arr2)
		System.out.print(i);
		
	}

	private static void mearge(int[] arr1, int[] arr2, int n, int m) {
		
		 int i=0 ,j=0,k=n-1;
	      while(i<=k && j<m){
	          if(arr1[i]<arr2[j]){
	              i++;
	          }
	          else{
	              int temp=arr1[k];
	              arr1[k]=arr2[j];
	              arr2[j]=temp;
	              j++;
	              k--;
	          }
	      }
	      Arrays.sort(arr1);
	      Arrays.sort(arr2);
	}
}
