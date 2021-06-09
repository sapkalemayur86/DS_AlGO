import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class Intervals {

   public static void merge(Interval[] intervals) {
       
	   Arrays.sort(intervals,new Comparator<Interval>() {

		@Override
		public int compare(Interval o1, Interval o2) {
			if(o1.start!=o2.start) {
				return o1.start-o2.start;
			}else
				return o1.end-o2.end;
		}
		   
	   });
	   
	   Stack <Interval> st= new Stack<>();
	   
	   st.push(intervals[0]);
	   
	  
	   for(int i=1;i<intervals.length;i++) {
		
		   Interval top=st.peek();
		   
		   if(top.end<intervals[i].start) {
			  
			   st.push(intervals[i]);
		   }
		   else {
			  
			   top.end=Math.max(top.end,intervals[i].end);
		   }
	   }
	 
	    while(!st.empty()) {
	    	  
	 	   Interval i =st.pop();  
		   System.out.println(i.start+ " "+ i.end );
	
	   }
	   
	   
    }
    
    public static void main(String args[]) {
        Interval arr[]=new Interval[4];
        arr[0]=new Interval(1,3);
        arr[1]=new Interval(2,4);
        arr[2]=new Interval(5,7);
        arr[3]=new Interval(6,8);
        merge(arr);
 
    }
}

class Interval {
    int start ,end;
    
    Interval(int start,int end){
        this.start=start;
        this.end=end;
    }
}