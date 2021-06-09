
public class EditDistance {
  
 public static void main(String[]args) {
	 
	 String s="geek";
	 String t="gesek";
	 int count=findTotalOpration(s,t);
	 System.out.println(count);
 }
 
private static int findTotalOpration(String s, String t) {
	
	int m=s.length();
    int n=t.length();
    int [][]dp=new int[m+1][n+1];
    
    for(int i=0;i<=m;i++) {
    	System.out.println();
         for(int j=0;j<=n;j++){
            
            if(i==0){
                dp[i][j]=j;
            }
            else if(j==0){
                dp[i][j]=i;                
                
            }
            else if(s.charAt(i-1)!=t.charAt(j-1)){
            	dp[i][j]= 1+Math.min(dp[i-1][j-1],
                        Math.min(dp[i-1][j],dp[i][j-1]));
            	
            }
            else {
            	dp[i][j]=dp[i-1][j-1];
            
            }
            System.out.print(dp[i][j]+" ");
        }
    }
        
        return dp[m][n];
    
}
	
}
