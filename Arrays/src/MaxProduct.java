
	import java.io.*;
	import java.util.*;
public class MaxProduct {

       public static void main(String[] args)  {
	        
    	        int arr[]= {3,12,15,23,33,-35,30,-40,-30,-30,-30,26,28};
	            System.out.println(new Ans().maxProduct(arr, arr.length));
	        }
	    }

	


	class Ans {
	    // Function to find maximum product subarray
	    long maxProduct(int[] arr, int n) {
	        // code here
	    long max_overall=arr[0];
	        
	        long max_ending_here=arr[0], min_ending_here=arr[0];
	        
	        for(int i=1;i<n;i++){
	        	 System.out.println();
	        	 System.out.print("i ="+ arr[i]+"      ");
	        	long temp=max_ending_here;
	            max_ending_here=Math.max(arr[i],Math.max(arr[i]*max_ending_here,arr[i]*min_ending_here));
	            System.out.print("max here="+max_ending_here+"      ");
	            min_ending_here=Math.min(arr[i],Math.min(arr[i]*temp,arr[i]*min_ending_here));
	            System.out.print("min here="+min_ending_here+"      ");
	            
	            max_overall=Math.max(max_overall,max_ending_here);
	            System.out.print("choosen ="+max_overall+"      ");
	        }
	        return max_overall;
	    }
	}

