

import java.util.ArrayList;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDuplicate s= new StringDuplicate();
		s.removeDuplicates("vineeeta");
		
		
	}
		public String removeDuplicates(String str) {
		
		char array[]=str.toCharArray();
		int count =0;
		ArrayList<Character> a = new ArrayList<Character>();
		
		for(char c:array) {
			if (!a.contains(c)) {
				a.add(c);
			}
			
			
			else{
				if(a.contains(c)) {
					count++;
					System.out.println(c+":"+count);
				}
				
			
		}
		}
		StringBuffer sb = new StringBuffer();
		for (char c1:a) {
			sb.append(c1);
			
		}
		System.out.println(sb);
		
		return sb.toString();
		
		
	}

}
