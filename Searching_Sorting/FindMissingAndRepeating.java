/*  Find Missing And Repeating 
 * 
 * Given an unsorted array Arr of size N of positive integers. 
 * One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array. 
 * Find these two numbers.
 * 
 * 
 */


public class FindMissingAndRepeating {

	public static void main(String[] args) {
	
		 int arr[]= {1, 3, 3};
		 int n=arr.length;
		 int[]ans=findTwoElements(arr,n);
		 
		     System.out.println("Repeating Element is "+ ans[0]);
			 System.out.println("Missing Element is "+ ans[1]);
		 
	
	}

	private static int[] findTwoElements(int[] arr, int n) {
		  
        int ans[]={0,0};
        
          for(int i=0;i<n;i++){
          int abs_val=Math.abs(arr[i]);
           
          if(arr[abs_val-1]>0)
           arr[abs_val-1]=-arr[abs_val-1];
           else
           ans[0]=abs_val;
         }
           
           for(int i=0;i<n;i++){
              
        	   if(arr[i]>0) {
                ans[1]=i+1;
             
        	   }
           }

		    
           
           return ans;
           
	}

}
