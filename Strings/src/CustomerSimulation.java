import java.util.HashSet;

public class CustomerSimulation {
 
	public static void main(String[]args) {
		
		System.out.println(runCustomerSimulation(2, "ABBAJJKZKZ".toString())); 
	    System.out.println(runCustomerSimulation(3, "GACCBDDBAGEE".toString())); 
	    System.out.println(runCustomerSimulation(3, "GACCBGDDBAEE".toString())); 
	    System.out.println(runCustomerSimulation(1, "ABCBCA".toString())); 
	    System.out.println(runCustomerSimulation(1, "ABCBCADEED".toString())); 
	}

	private static int runCustomerSimulation(int pc, String str) {
		
		int result=0;
		int i =0;
		int left=pc;
	    HashSet<Character> hs=new HashSet<>();
	    HashSet<Character> png=new HashSet<>();
		while(i<str.length()) {
			char ch=str.charAt(i);
			
			if(!hs.contains(ch) && left>0) {
				hs.add(ch);
			    left--; 
			   // System.out.println("from 1");
			}
			else if(hs.contains(ch)) {
				left++;
				// System.out.println("from 2");
			}
			else if(!hs.contains(ch) && left==0){
				if(!png.contains(ch))
				    png.add(ch);
				else
					result++;
				// System.out.println("from 3");
			}
			i++;
			
		}
		
		
		return result;
	}
}
