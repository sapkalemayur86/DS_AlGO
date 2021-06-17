/*
 * Stickler Thief 
 * Stickler the thief wants to loot money from a society having n houses in a single line.
 *  He is a weird person and follows a certain rule when looting the houses. 
 *  According to the rule, he will never loot two consecutive houses. At the same time,
 *  he wants to maximize the amount he loots. The thief knows which house has what amount of money
 *  but is unable to come up with an optimal looting strategy. He asks for your help to find the
 *  maximum money he can get if he strictly follows the rule. Each house has a[i] amount of money present in it.
 */
public class SticklerThief {

	public static void main(String[] args) {
		int []arr= {5,5,10,100,10,5};
		
		System.out.println(FindMaxSum(arr,arr.length));

	}

	private static int FindMaxSum(int[] arr, int n) {
		  if (n == 0)
		        return 0;
		        if (n == 1)
		            return arr[0];
		        if (n == 2)
		            return Math.max(arr[0], arr[1]);
		       int []dp=new int[n];
		       dp[0]=arr[0];
		       dp[1] = Math.max(arr[0], arr[1]);
		       
		       for(int i=2;i<n;i++){
		           dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i]);
		       }
		       
		       return dp[n-1];
	}

}
