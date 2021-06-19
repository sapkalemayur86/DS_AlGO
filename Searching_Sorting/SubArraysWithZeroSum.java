/*
 * Zero Sum Subarrays 
 * You are given an array arr[] of size n.
 *  Find the total count of sub-arrays having their sum equal to 0
 */

import java.util.HashMap;

public class SubArraysWithZeroSum {

	public static void main(String[]args) {
		
		int arr[]= {0,0,5,5,0,0};
		System.out.println("Total SubArrays with Zero sum = "+findSubArrays(arr,arr.length));
	}

	private static int findSubArrays(int[] arr, int n) {
	 
		int count=0;
        
        HashMap<Integer,Integer>map=new HashMap<>();
        
        int i=-1;
        int sum=0;
        map.put(0,1);
        while(i<n-1){
         i++;
         sum+=arr[i];
         if(map.containsKey(sum)){
             count+=map.get(sum);
             map.put(sum,map.get(sum)+1);
            }
         else
         map.put(sum,1);
         
            
        }
        
        
        return count;
        
		
		
	}
}
