/*  First and last occurrences of x  
   
   Given a sorted array arr containing n elements with possibly duplicate elements, 
   the task is to find indexes of first and last occurrences of an element x in the given array.
  
 */


public class FirstandLast {
	
	public static void main(String[]args) {
		
		int[] arr= {1, 3, 5, 5, 5, 5, 67, 123, 125};
		int num=5;
		
		int first=-1;
		int last=-1;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=num)
				continue;
			
			if(first==-1)
				first=i;
			
			 last=i;
			
		}
		
		System.out.println("firstIndex ="+ first);
		System.out.println("LastIndex ="+ last);
		
	}

}
