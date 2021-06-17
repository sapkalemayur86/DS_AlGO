/*
 * Count triplets with sum smaller than X
 * Given an array arr[] of distinct integers of size N and a sum value X,
 *  the task is to find count of triplets with the sum smaller than the given sum value X.
 */

import java.util.Arrays;

public class CountTriplets {

	public static void main(String[] args) {
		
		int arr[]= {-2, 0, 1, 3};
		int x=2;
		System.out.println("total triplataes having sum less than "+x+" =  "+countTriplets(arr,x));
	}

	private static int countTriplets(int[] arr, int sum) {
        int n=arr.length;
        Arrays.sort(arr);
        int count=0;
        for(int i=0;i<n;i++){
            int left=i+1;
            int right=n-1;
            while(left<right){
                if((arr[i]+arr[left]+arr[right])>=sum)
                right--;
                
                else{
                    count+=right-left;
                    left++;
                }
                
            }
            
        }
        return count;
	}

}
