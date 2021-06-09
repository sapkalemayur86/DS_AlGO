
public class Spiral {

  public static void main(String[]args) {
	  
	  int matrix[][] = {{1, 2, 3, 4},
			  			{5, 6, 7, 8},
			  			{9, 10, 11, 12},
			  			{13, 14, 15,16}};
	  int top=0,down=matrix.length-1;
	  int left=0,right=matrix[0].length-1;
	  
	   int d=0;
	  while(top<=down && left<=right ) {
		  switch(d) {
		  
		  case 0: for(int i=left;i<=right;i++)
			      	System.out.print(matrix[top][i]+" "); 
		  		  System.out.println();  
		          top++;
		          break;
		          
		  case 1:for(int i=top;i<=down;i++)
			  		System.out.print(matrix[i][right]+" ");
		  		 System.out.println(); 
			    right--;
			    break;
			    
		  case 2: for(int i=right;i>=left;i--)
			  		System.out.print(matrix[down][i]+" ");
		  		  System.out.println();
		  		  down--;
		  		  break;
		  		  
		  case 3: for(int i=down;i>=top;i--)
			  		System.out.print(matrix[i][left]);
		          System.out.println();
		          left++;
		 		  
		  }
		  
		     d=(d+1)%4;
		  
	  }
	  
  }
}
