
public class FindWordInMatrix {
	
	public static void main(String[]args) {
		
		String str="GEEKS";
		int ans=0;
		 char[][] a ={
		            {'D','D','D','G','D','D'},
		            {'B','B','D','E','B','S'},
		            {'B','S','K','E','B','K'},
		            {'D','D','D','D','D','E'},
		            {'D','D','D','D','D','E'},
		            {'D','D','D','D','D','G'}
		           };
		 
		 
		 
		 for(int i=0;i<a.length;i++)
			 for(int j=0;j<a[0].length;j++) {
		      ans+=find(i,j,str,a,str.length(),0);
			 }
		 
		 System.out.println(ans);
	}

	private static int find(int row, int col, String str, char[][] a, int size, int currentchar) {
		// TODO Auto-generated method stub
		int found=0;
		char temp=str.charAt(currentchar);
		
		if(row>=0 && col>=0 && row<a.length && col<a[0].length) {
			if(a[row][col]==temp) {
				a[row][col]='0';
				currentchar++;
				
				if(currentchar==size)
					found++;
				else {
					found+=find(row+1,col,str,a,size,currentchar);
					found+=find(row-1,col,str,a,size,currentchar);
					found+=find(row,col+1,str,a,size,currentchar);
					found+=find(row,col-1,str,a,size,currentchar);
				}
				a[row][col]=temp;
			}
			
			
				
			}
		
		return found;
	}

	
}
