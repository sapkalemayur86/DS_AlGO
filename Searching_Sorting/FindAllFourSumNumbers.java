/*
 * 						Find All Four Sum Numbers
 * Given an array of integers and another number. 
 * Find all the unique quadruple from the given array that sums up to the given number
 */

import java.util.ArrayList;
public class FindAllFourSumNumbers {

	public static void main(String[] args) {
		int arr[]= {88,84,3,51,54,99,32,60,76,68,39,12,26,86,94,39,95,70,34,78,67,1,97,2,17,92,52};
		
		System.out.print(fourSum(arr,179));

	}

	private static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int k) {
		 ArrayList<ArrayList<Integer>> res=new ArrayList<>();
         int n=arr.length;
         if(arr.length==0){
             return res;
         }
         
         for(int i=0;i<n;i++){
              for(int j=i+1;j<n;j++){
                
                int left=j+1;
                int right=n-1;
                int target=k-arr[i]-arr[j];
                while(left<right){
                   
                   int sum=  arr[left]+arr[right]  ;
                    if(sum<target)
                       left++;
                    else if(sum>target)
                        right--;
                    else{
                        ArrayList<Integer> quad=new ArrayList<>();
                        quad.add(arr[i]);
                        quad.add(arr[j]);
                        quad.add(arr[left]);
                        quad.add(arr[right]);
                        res.add(quad);
                        
                        while(left<right && arr[left]==quad.get(2))
                          left++;
                          
                        while(left<right && arr[right]==quad.get(3))
                        right--;
                        
                    }
                }
                
                while(j+1<n && arr[j+1]==arr[j])
                j++;
            }
                
                while(i+1<n && arr[i+1]==arr[i])
                i++;
            }
            
            return res;
	}

}
