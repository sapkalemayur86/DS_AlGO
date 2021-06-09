
public class MakeStringPalindrome {

	 public static void main(String[]args) {
		 
		 String str ="Mayur";
		 System.out.println(countToPalindorme(str));
	 }

	private static int countToPalindorme(String str) {
		int count=0;
		String s=str;
		while(s.length()>0) {
			
			if(isPalindrome(s)) {
				break;
			}else {
				s=s.substring(0,s.length()-1);
				count++;
			
			}
				
		}
		
		
		return count;
	}

	private static boolean isPalindrome(String str) {
	 
		 int start=0;
		 int end=str.length()-1;
		while(start<=end) {
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
