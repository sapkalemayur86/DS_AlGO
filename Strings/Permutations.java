
public class Permutations {

	
	 public static void main(String[] args) {
		 
		 String str="ABC";
		 
		 permut(str,0,str.length()-1);
		 
		 
	 }

	 private static void permut(String str, int l, int h) {
		
		 if(l==h) {
			 System.out.println(str);
		 }
		 else
			 for(int i=l;i<=h;i++) {
				str = swap(str,l,i);
				 permut(str,l+1,h);
			     str= swap(str,l,i);
				 
			 }
		
	}

	private static String swap(String str, int l, int i) {
		 char temp;
		 char[]array=str.toCharArray();
		 temp=array[l];
		 array[l]=array[i];
		 array[i]=temp;	
		 
		 return String.valueOf(array);
		
	}
}
