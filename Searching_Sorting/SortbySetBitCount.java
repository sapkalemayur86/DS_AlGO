
/*
 * Sort by Set Bit Count 
 * Given an array of integers, sort the array (in descending order) according to count of set bits in binary representation of array elements. 

   Note: For integers having same number of set bits in their binary representation, sort according to their position in the original array i.e., a stable sort.
 */
import java.util.Arrays;

import java.util.Comparator;

public class SortbySetBitCount {

	public static void main(String[] args) {
		
		Integer arr[]={5, 2, 3, 9, 4, 6, 7, 15, 32};
		
		sort(arr,arr.length);
		for(int i:arr) {
			System.out.println(i);
		}

	}

	private static void sort(Integer[] arr, int n) {
		
	  Arrays.sort(arr, new Comparator<Integer>() {
		  
		  
		    public int compare(Integer arg0, Integer arg1)
            {
               
                int c1 = Integer.bitCount(arg0);
                int c2 = Integer.bitCount(arg1);
                if (c1 <= c2)
                    return 1;
                else
                	return -1;
                }
		  
	  });
	       
		
	}

}

