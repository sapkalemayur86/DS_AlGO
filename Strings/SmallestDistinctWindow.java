import java.util.HashMap;
import java.util.HashSet;

public class SmallestDistinctWindow {
	
		public static void main(String[] args)
		{
	            String str="CCCbAbbBbbC";
	            System.out.println(findSubString(str));
	            System.out.println(findSubString(str).length());
	            
	      }
		
	
	
	    public static String findSubString( String str) {
	        
	        int len=str.length(); 
	        String ans=str;
	        HashSet<Character> set=new HashSet<>();
	        for(int i=0;i<str.length();i++){
	            set.add(str.charAt(i));
	        }
	        
	        int i=-1;
	        int j=-1;
	        HashMap <Character,Integer> map=new HashMap<>(); 
	        while(true){
	            boolean f1=false;
	            boolean f2=false;
	            while(i<str.length()-1 && map.size()<set.size()){
	                i++;
	                char ch=str.charAt(i);
	                map.put(ch,map.getOrDefault(ch,0)+1);
	                f1=true;
	            }
	            
	            while(j<i && map.size()==set.size()){
	              String result=str.substring(j+1,i+1);
	              System.out.println("Result =" +result);
	              int plen=result.length();
	              if(plen<ans.length()) {
	               ans=result;
	               System.out.println("Ans ="+ans);
	              }
	              
	              j++;
	              char ch=str.charAt(j);
	              if(map.get(ch)==1)
	              map.remove(ch);
	              else{
	                  map.put(ch,map.get(ch)-1);
	              }
	              f2=true;
	            }
	            
	            if(f1==false && f2==false){
	            
	             break;
	               
	            }
	          
	        }
	        
	        return ans;
	    }
	}

