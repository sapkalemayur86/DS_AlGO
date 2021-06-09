
public class BinaryString {

	public static void main(String[]args) {
		
		String str="0100110101";
		System.out.print(countSubs(str));
	}

	private static int countSubs(String str) {
		
		int count0=0;
		int count1=0;
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='0')
				count0++;
			else
				count1++;
			
			if(count0==count1) {
				count++;
			}
		}
		if(count0!=count1) {
			return -1;
		}
		return count;
	}
}
