/* . 
 *                    Search in Rotated Sorted Array 
 *  Given the array nums after the rotation and an integer target, return the index of target 
 *  if it is in nums, or -1 if it is not in nums.

     You must write an algorithm with O(log n) runtime complexity.
 */


public class SearchInRotatedSorted {

	public static void main(String[]args) {
		
		int [] nums= {5,1,3};
		int n=nums.length;
	    int target=3;
		int ans=search(nums,0,n-1,target);
		
        System.out.print("found at "+ans);
		
		
	}

	private static int search(int[] nums, int l, int h, int target) {
		
	      
		      if(l>h)
			   return -1;
	    	
		  
		    int mid=(l+h)/2;
	    	if(nums[mid]==target)
	    		return mid;
	    	
	    	else if(nums[l]<=nums[mid]) {
	    		
	    		if(target>=nums[l] && target<=nums[mid]) {
	    			return search(nums,l,mid-1,target);
	    		}else {
	    			return search(nums,mid+1,h,target);
	    		}
	    		
	    		
	    	}else {

	    		if(target>=nums[mid] && target<=nums[h]) {
	    			return search(nums,mid+1,h,target);
	    		}else {
	    			return search(nums,l,mid-1,target);
	    		}
	    		
	    		
	    		
	    	}
	    	
	
		
		
		
	}
}
