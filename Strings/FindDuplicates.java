import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {

   public static void main(String[]args) {
	   
	   String name="MayurSapkaleM";
	   
	   Map <Character,Integer> mp =new HashMap<>();
	   
	   for(int i=0;i<name.length();i++) {
		   if(!mp.containsKey(name.charAt(i)))
			   mp.put(name.charAt(i),1);
		   else
			   mp.put(name.charAt(i),mp.get(name.charAt(i))+1);
	   }
	  
	   
	   for (Map.Entry mapElement : mp.entrySet()) {
           char key = (char)mapElement.getKey();
           int value = ((int)mapElement.getValue());

           if (value > 1)
               System.out.println(key
                                  + ", count = " + value);
       }
	   
	   
   }
	 
}
