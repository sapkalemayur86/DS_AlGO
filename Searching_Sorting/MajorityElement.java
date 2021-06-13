import java.util.Arrays;

/*
 *   Majority Element 
 *   Given an array A of N elements. Find the majority element in the array. 
 *   A majority element in an array A of size N is an element that appears more than N/2 times in the array.
 *    ** Easy **
 */


public class MajorityElement {

	public static void main(String[] args) {
		
		int a[]= {3,1,3,3,2};
		
		int element=majorityElement(a,a.length);
		
		if(element==-1)
			System.out.println("No Majority Element Found");
		else
			System.out.println("Majority Element is "+element);
		
	}

	private static int majorityElement(int[] a, int size) {
	 
		 Arrays.sort(a);
	        int count=1;
	       
	        if(size==1){
	            return a[0];
	        }
	        
	        for(int i=0;i<size-1;i++){
	            
	            if(a[i]==a[i+1])
	            count++;
	            else
	            count=1;
	            
	            if(count>size/2)
	            return a[i];
	            
	        }
		
		
		return -1;
	}

}
