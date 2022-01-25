package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapExample {

	public static void main(String[] args) {
	Map m1=new HashMap();
		//adding element
		m1.put("key1","admin");
		m1.put("key2","person");
		m1.put(null,"admin");
		m1.put("key3","man");
		m1.put("key4","fan");
		System.out.println("count element:"+m1);
		System.out.println("size of element:"+m1.size());
		//if want only keys then use keyset()
		System.out.println("only keys print:"+m1.keySet());
		//if want only values then use values()
		System.out.println("only values print:"+m1.values());
		//if want keys&values then use entryset()
		Set<Entry> s1=m1.entrySet();
		for(Entry l:s1){
		System.out.println(l); 
		

	}

}
}
