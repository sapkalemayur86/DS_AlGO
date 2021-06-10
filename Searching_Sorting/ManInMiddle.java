/* Man IN Middle 
 * Given three distinct numbers A, B and C. Find the number with value in middle
 *  (Try to do it with minimum comparisons).
 * 
 */
public class ManInMiddle {
 
	public static void main(String[]args) {
		int a=233;
		int b=342;
		int c=234;
		
		System.out.println("Man in Middle"+ middleElement(a,b,c));
	}

	private static int middleElement(int a, int b, int c) {
		
		  if(a<b){
	            if(a>c)
	            return a;
	            else if(b<c)
	              return b;
	              else
	              return c;
	            
	        }
	        else{
	            //b<a
	            if(b>c)
	            return b;
	            else if(a<c)
	            return a;
	            else
	            return c;
	            
	        }
	}
	
}
