import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Paranthisis {

	
	 public static void main(String [] args) {
		 String str="[({[([{}])]})}";
		 if(isValid(str)) 
			 System.out.print("correct");
		 else
			 System.out.println("wrong");
	 }

	private static boolean isValid(String exp) {
		
       Stack <Character> st=new Stack<>();
        
        for(int i=0;i<exp.length();i++){
           
        	char x=exp.charAt(i);
        	System.out.print(x+" ");
            if(x=='[' || x=='{' || x=='('){
                st.push(x);
               
            }
              
                 if (st.isEmpty())
                   return false;
                   
                   char check;
                   switch(x)
                   {
                       case ')': check=st.pop();
                                 if(check=='{' || check=='[')
                                 return false;
                                 break;
                        
                        case '}': check=st.pop();
                                 if(check=='[' || check=='(')
                                 return false;
                                 break;
                                
                        case ']': check=st.pop();
                                 if(check=='(' || check=='{')
                                 return false;
                                 break;        
                       
                   }
           
            }
              return (st.isEmpty());
          
	}
}
