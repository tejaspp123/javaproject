package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashsetExample2 {


	public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("RAVI");
	list.add("VIJAY");
	list.add("AJAY");
	list.add("RAVI");
	System.out.println("list element"+list);
Set<String> set=new HashSet<>(list);
set.add("GAURAV");
System.out.println("set element"+set);
Iterator<String> itr=set. iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
	
}
System.out.println("*********************");
//set.forEach(s1->{system.out.println(s1);});
System.out.println("**********");
set.removeIf(a1-> a1.contains("RAVI"));
System.out.println("set elements"+set);







	
	

	}

}
