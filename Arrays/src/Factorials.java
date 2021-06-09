
public class Factorials {

	 
    // This function finds factorial of
    // large numbers and prints them
    static void factorial(int n)
    {
        int[] res = new int[500];
        int res_size=1;
        res[0]=1;
        
        for(int X=2;X<=n;X++)
        	res_size=multiply(X,res,res_size);
        
     
        
        for(int i=res_size-1;i>=0;i--) {
        	System.out.print(res[i]);
        }
        
    }
     
    // This function multiplies x with the number
    // represented by res[]. res_size is size of res[] or
    // number of digits in the number represented by res[].
    // This function uses simple school mathematics for
    // multiplication. This function may value of res_size
    // and returns the new value of res_size
    static int multiply(int x, int res[], int res_size)
    {
    	int carry=0;
    	
        for(int i=0;i<res_size;i++)
        {
        	int prod=res[i]*x+carry;
        	res[i]=prod%10;
        	carry=prod/10;
        }
        
        while(carry!=0) {
        	res[res_size]=carry%10;
        	carry=carry/10;
        	res_size++;
        }
        return res_size;
    }
 
    // Driver program
    public static void main(String args[])
    {
        factorial(5);
    }
}
