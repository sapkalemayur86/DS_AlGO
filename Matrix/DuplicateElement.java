import java.util.HashMap;
import java.util.Map;

public class DuplicateElement {

		public static void main (String[] args) {
		int mat[][] =
	    {
	        {2, 2, 2, 4, 8},
	        {3, 7, 8, 5, 1},
	        {8, 7, 7, 3, 1},
	        {8, 1, 2, 7, 9},
	    };
	                     
	        Map<Integer,Integer> dp = new HashMap<>();
	        
	        for(int i=0;i<mat[0].length;i++)
	         dp.put(mat[0][i],1);
	         
	         for(int row=1;row<mat.length;row++)
	           for(int col=0;col<mat[0].length;col++){
	               
	               if(dp.get(mat[row][col])!=null && dp.get(mat[row][col])==row){
	                   
	                   dp.put(mat[row][col],row+1);
	                   
	                   if(row==mat.length-1){
	                       System.out.print(mat[row][col]+" ");
	                   }
	               }
	           }
		}
	}	

