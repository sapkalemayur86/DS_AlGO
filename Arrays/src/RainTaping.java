
	import java.io.*;
	import java.util.*;
	import java.lang.*;
public class RainTaping {


		public static void main (String[] args) throws IOException {
			
			    int arr[] = {7,4,0,9};
			   
			    
			    //calling trappingWater() function
			    System.out.println(Water.trappingWater(arr, arr.length));
			}
		}



	class Water{
	    
	  
	    static int trappingWater(int arr[], int n) { 
	        
	        // Your code here
	        int left[]=new int[n];
	        int right[]=new int[n];
	        int sum=0;
	        
	        int lbig=arr[0];
	        left[0]=arr[0];
	        for(int i=1;i<n;i++){
	           
	           if(arr[i]>lbig){
	               lbig=arr[i];
	           }
	           
	           if(lbig>left[i-1]){
	               left[i]=lbig;
	           }else left[i]=left[i-1];
	           
	          
	           
	        }
	      
	        int rbig=arr[n-1]; 
	        right[n-1]=arr[n-1];
	        for(int i=n-2;i>=0;i--){
	          
	           if(arr[i]>rbig){
	               rbig=arr[i];
	           }
	           
	           if(rbig>right[i+1]){
	               right[i]=rbig;
	           }else right[i]=right[i+1];
	           
	        
	           
	        }
	        
	        for(int i=0;i<n;i++){
	           // System.out.println("left"+i +" "+left[i]+ " right "+i+" "+right[i]);
	        	int t=Math.min(left[i],right[i])-arr[i];
	            sum=sum+t;
	        }
	        
	      return sum;        
	    } 
	}

