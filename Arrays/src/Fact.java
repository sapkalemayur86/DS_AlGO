import java.io.*;
import java.util.*;

class Fact
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
            int N = 5;
            
            ArrayList<Integer> ans = Solution.factorial(N);
            for (Integer val: ans) 
                System.out.print(val); 
            System.out.println();
        }   
    }


class Solution {
    static ArrayList<Integer> factorial(int N){
        //code here
        
        ArrayList<Integer> res=new ArrayList<Integer>();
        res.add(1);
        int size=1;
          
        for(int x=2;x<=N;x++)
         size=multiplay(x,res,size);
         
         System.out.println("Size of list="+res.size());
         return res;
        
        
    }
    
    static int multiplay(int x,ArrayList<Integer>res,int size){
    	
        
        int carry=0;
        for(int i=0;i<size;i++){
            int product=res.get(i)*x+carry;
            res.set(0,product%10);
            System.out.println("at index ="+res.indexOf(product%10));
            carry=product/10;
        }
       
        while(carry!=0){
        	 System.out.println("size ="+size);
        	 System.out.println();
        	 if(size<res.size()-1) 
        		 res.add(carry%10);
             else 
        		 
        	     res.set(size,carry%10);
                 
        	     carry=carry/10;
                 size++;	 
        	 
        		 
            
        }
        return size;
    }
}