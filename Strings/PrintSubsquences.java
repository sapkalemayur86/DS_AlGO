
public class PrintSubsquences {
	
	public static void main(String[]args) {
		
		String s="abc";
		String output="";
		printSubs(s,output);
		
	}

	private static void printSubs(String s, String result) {
		if(s.length()==0) {
			System.out.println(result);
		
		}
		else {
			printSubs(s.substring(1),result);
			printSubs(s.substring(1),result+s.charAt(0));
		}
	}

}
