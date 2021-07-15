
public class FindLongestPalindrome {

	public static void main(String[] args) {
	 String str="aaaabbaa";
	 
	 findPalindrome(str);

	}

	private static void findPalindrome(String  S) {
		
        int n=S.length();
        int max=1;
        int start=0;
        int low ,high;
        for(int i=1;i<n;i++){
            
            low=i-1;
            high=i;
           while (low >= 0 && high < S.length()
                   && S.charAt(low)
                          == S.charAt(high)){
                
                if(high-low+1>max){
                  start=low;
                  max=high-low+1;
                }
                low--;
                high++;
            }
            
            
            low=i-1;
            high=i+1;
            while (low >= 0 && high < n
                   && S.charAt(low)
                          == S.charAt(high))
             while(low>=0 && high<S.length() && S.charAt(low)==S.charAt(high) ){
                
                if(high-low+1>max){
                  start=low;
                  max=high-low+1;
                }
                low--;
                high++;
            }
            
            
            
            
        }
        for (int i=start;i<start+max;i++) {
        	System.out.print(S.charAt(i));
        }
      }

}
