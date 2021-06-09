import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class FindAnagrams {
  
	    public static void main (String[] args) {
	        
		        
		  
		       
		        ArrayList<String> string_list=new ArrayList<>();
		        string_list.add("god");
		        string_list.add("cat");
		        string_list.add("dog");
		        string_list.add("tac");
		        string_list.add("act");
		        
		        List <List<String>> ans = Anagrams(string_list);
		        
		        Collections.sort(ans, new Comparator<List<String>>(){
	            public int compare(List<String> l1, List<String> l2) {
	                    String s1 =  l1.get(0);
	                    String s2 = l2.get(0);
	                    
	                    return s1.compareTo(s2);
	                }
	            });
		        
		        for(int i=0;i<ans.size();i++)
		        {
		            for(int j=0;j<ans.get(i).size();j++)
		            {
		                System.out.print(ans.get(i).get(j) + " ");
		            }
		            System.out.println();
		        }
		       
		       
	          
		    }
		
	    

	 


	    public static List<List<String>> Anagrams(ArrayList<String> string_list) {
	        
	     HashMap<HashMap<Character,Integer>,ArrayList<String>> map=new HashMap<>();
	     
	     
	     
	     for(String str: string_list){
	    	 HashMap<Character,Integer> fmap=new HashMap<>();
	         System.out.println("for "+ str);
	    	 for(int i=0;i<str.length();i++){
	             char ch=str.charAt(i);
	             fmap.put(ch,fmap.getOrDefault(ch,0)+1);
	         }
	         System.out.println("for "+ str+"fmap is"+fmap);
	        
	         if(map.containsKey(fmap)==false){
	        	  System.out.println("from false case" );
	        	  ArrayList<String> temp=new ArrayList<>();
	              temp.add(str);
	              map.put(fmap,temp);
	          
	              
	         }else{
	              ArrayList<String> temp= map.get(fmap);
	              temp.add(str);
	             
	         }
	         
	         System.out.println("for "+ str+"map is"+map);
	         
	         
	     }
	     
	     ArrayList<ArrayList<String>> res=new ArrayList<>();
	     
	     for(ArrayList<String> list:map.values()){
	          System.out.println("List is"+ list);
	    	 res.add(list);
	         
	     }
	     
	     return (List)res;
	        
	    }
	}



