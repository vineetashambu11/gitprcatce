import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Treemapsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeMap<Integer,String>t =new TreeMap<Integer,String>();
		t.put(500040, "value1");
		t.put(500034, "2value");
		t.put(609087," valu3e");
		
		System.out.println(t);
		for(Entry<Integer, String> Entry:t.entrySet()) {
			System.out.println(Entry.getKey());
			System.out.println(Entry.getValue());
		}


	}

}
