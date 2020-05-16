import java.util.HashMap;
import java.util.Map;

public class UppLowcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Google";
		int lowercase=0;
		int uppercase=0;
		for(int i=0;i<s.length();i++) {
			
			if(Character.isLowerCase(s.charAt(i))) {
				lowercase++;
			}
		}
		System.out.println(lowercase);
		
		String a = "hello world welcome to new java world";
		String aray[] = a.split("\\s+");
		
		
		int l =aray.length;
		System.out.println(aray.length);
		
		Map <String ,String> map =new HashMap<String,String>();
		for(String str:aray) {
			if(map.containsKey(str)) {
				int c=Integer.parseInt(map.get(str));
				map.put(str, String.valueOf(c+1));}
			
				else {
					map.put(str, "1");
				}
			}
		
		
		
		for (Map.Entry entry : map.entrySet()){
			
			System.out.println(entry.getKey()+":g"+entry.getValue());
			
		}
		}
		


	}

