import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayDuplicat_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a= new ArrayList<String>();
ArrayList<String> b= new ArrayList<String>();
a.add("x");
a.add("y");
a.add("z");
a.add("z");

TreeSet<String>t =new TreeSet<String>();
t.add("y");
t.add("r");
t.add("q");

System.out.println(t);


for(String a1:a) {
	if(!b.contains(a1))
{
	b.add(a1);
}
	}
System.out.println("Using new ArrayList"+b);
Set<String> s =new LinkedHashSet<String>();
s.addAll(a);
a.clear();
a.addAll(s);
System.out.println("using set"+b);

		
	}

}
