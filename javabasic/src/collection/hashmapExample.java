package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> map1=new HashMap<Integer,String>();
		map1.put(1, "mango");
		map1.put(2, "apple");
		map1.put(3, "banana");
		map1.put(1, "grapes");//trying duplicate key
		map1.put(4, "banana");
		System.out.println("map elements:"+map1);
		System.out.println("iterating hashmap");
		//printing keys and values
		Set<Entry<Integer,String>> s1=map1.entrySet();
		for(Entry<Integer,String> e:s1){
			System.out.println(e.getKey()+":"+ e.getValue());
			
		}
		System.out.println("*****************");
		//or 
		for(Map.Entry<Integer,String> m:map1.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		HashMap<Integer,String> hmm=new HashMap<Integer,String>();
		hmm.put(101, "vijay");
		hmm.put(102,"ajay");
		hmm.put(103, "vinod");
		hmm.put(104, "pramod");
		System.out.println("size of map element"+hmm.size());
		System.out.println("map element"+hmm);
		System.out.println("only print keys"+hmm.keySet());
		System.out.println("only print values"+hmm.values());
		 Set<Entry<Integer,String>> e=hmm.entrySet();
		 for(Entry<Integer,String> k:e) {
			 System.out.println(k);
		 }
		 System.out.println("********************");
		 hmm.putIfAbsent(103, "gaurav");
		 System.out.println("after invoking putifabsent() method list of element"+hmm);
		 //key based remove
		 hmm.remove(101);
		 System.out.println("updated list of element"+map1);
		 //replace()
		 hmm.replace(101,"vijay");
		 System.out.println("updated list of element"+hmm);
		 for(Map.Entry<Integer, String> m:map1.entrySet()) {
			 System.out.println(m);
		 }
		 
		 
		 
		 
		
		
			
		
		
		
		
		
		
		
		
		
		

	}

}
