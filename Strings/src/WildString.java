
public class WildString {
	
	    public static void main(String args[])
	    {
	        
	         
	           String wild="g*ks";
	           String pattern="geeks";

	    	    boolean flag = match(pattern, wild);
	            if(flag)
	            System.out.println("Yes");
	            else
	            System.out.println("No");
	       
	    }


	    static boolean match(String pattern, String wild)
	    {
	        boolean [][] dp=new boolean [wild.length()+1][pattern.length()+1];
	        
	        
	        for(int i=dp.length-1;i>=0;i--){
	            
	        	for(int j=dp[0].length-1;j>=0;j--){
	        		 
	        		if(i==dp.length-1 && j==dp[0].length-1){
	                    dp[i][j]=true;
	                }else if(i==dp.length-1){
	                    dp[i][j]=false;
	                }else if(j==dp[0].length-1){
	                    if(wild.charAt(i)=='*')
	                    dp[i][j]=dp[i+1][j];
	                    else{
	                        dp[i][j]=false;
	                    }
	                }else{
	                    
	                    if(wild.charAt(i)=='?'){
	                        dp[i][j]=dp[i+1][j+1];
	                        
	                    }else if(wild.charAt(i)=='*'){
	                        dp[i][j]=dp[i+1][j] || dp[i][j+1];
	                    }else if(wild.charAt(i)==pattern.charAt(j)){
	                    	dp[i][j]=dp[i+1][j+1];
	                    }else{
	                        dp[i][j]=false;
	                    }
	                }
	                
	                
	            }
	        }
	        
	        
	        return dp[0][0];
	    }
	
}
