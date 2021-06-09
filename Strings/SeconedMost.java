import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SeconedMost {

	 public static void main(String[]args) {
		 
		String [] arr= {"ccc", "aaa", "ccc",
						"ddd", "aaa", "aaa"};
		System.out.println(seconedMostReapeted(arr));
	 }

	private static String seconedMostReapeted(String[] arr) {
		
		HashMap<String, Integer> occ = new HashMap<String,Integer>(arr.length){
            @Override
            public Integer get(Object key) {
                 return containsKey(key) ? super.get(key) : 0;
            }
        };
		
		for(int i=0;i<arr.length;i++) {
			occ.put(arr[i],occ.get(arr[i])+1);
		}
		
		System.out.print(occ);
	 
	   Iterator hmIterator =occ.entrySet().iterator();
	   int max=Integer.MIN_VALUE;
	   int max2=Integer.MIN_VALUE;
	   while (hmIterator.hasNext()) {
           Map.Entry mapElement = (Map.Entry)hmIterator.next();
           
           int x = ((int)mapElement.getValue());
            if(x>max) {
            	max2=max;
            	max=x;
            	
            }else if(x>max2 && x!=max) {
            	max2=x;
            }
       }
	   
	    hmIterator = occ.entrySet().iterator();
       while (hmIterator.hasNext()) 
       {
           Map.Entry<String, Integer> entry = (Entry<String, Integer>) hmIterator.next();
           
           System.out.println("max2 ="+max2);
           int v = entry.getValue();
           if (v == max2)
                return entry.getKey();
       }
        
		
	    
		return "mayur";
	}
}
