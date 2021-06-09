import java.util.ArrayList;

public class FindValidIP {

	public static void main(String[]args) {
		
		String S="255511135";
		ArrayList<String>ip=findIp(S);
		for(int i=0;i<ip.size();i++) {
			System.out.println(ip.get(i));
		}
		
	}

	private static ArrayList<String> findIp(String s) {
		
		ArrayList<String>result=new ArrayList<>();
	
        String str=s;		 
		for(int i=1;i<s.length()-2;i++)
			for(int j=i+1;j<s.length()-1;j++)
				for(int k=j+1;k<s.length();k++) {
					
					str=str.substring(0, k)+"."+str.substring(k);
					str=str.substring(0, j)+"."+str.substring(j);
					str=str.substring(0, i)+"."+str.substring(i);
					
					if(isValid(str)) {
						result.add(str);
					}
					
					str=s;
					
				}
		
				
		
		
		
		
		return result;
	}

	private static boolean isValid(String str) {
		String a[] = str.split("[.]");
        for (String s : a) {
            int i = Integer.parseInt(s);
            if (s.length() > 3 || i < 0 || i > 255) {
                return false;
            }
            if (s.length() > 1 && i == 0)
                return false;
            if (s.length() > 1 && i != 0
                && s.charAt(0) == '0')
                return false;
        }
 
        return true;
	}



}