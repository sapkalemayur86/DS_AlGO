import java.util.Scanner;

public class MaxProfit {
	
   public static void main(String []args) { 
   
   
   int arr[]= {90, 80, 70, 60, 50};
   
   int profit=maxProfit(arr);
   
   System.out.println(profit);
  
   }


     static int maxProfit(int[] arr) {
	
	  
	  int mpisd=0;
	  int leastsf=arr[0];
	  int dpl[]=new int[arr.length];
	  for(int i=1;i<arr.length;i++) {
		  if(arr[i]<leastsf) {
			  leastsf=arr[i];
		  }
		  mpisd=arr[i]-leastsf;
		  
		  if(mpisd>dpl[i-1]) {
			  dpl[i]=mpisd;
		  }else {
			  dpl[i]=dpl[i-1];
		  }
       }
	  
	  
	  int mpibt=0;
	  int maxat=arr[arr.length-1];
	  int []dpr=new int[arr.length];
	  
	  for(int i=arr.length-2;i>=0;i--) {
		  
		  if(maxat<arr[i]) {
			  maxat=arr[i];
		  }
		  
		  mpibt=maxat-arr[i];
		  
		 if(mpibt>dpr[i+1]) {
			 dpr[i]=mpibt;
		 }else {
			 dpr[i]=dpr[i+1];
		 }
		 
	 }
	  int op=0;
	  for(int i=0;i<arr.length;i++) {
		  if(op<dpr[i]+dpl[i]) {
			  op=dpr[i]+dpl[i];
		  }
	  }
	
	  
	  
	  return op;
}
   
   

}
