package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class hashsetExample {

	public static void main(String[] args) {
		//creating hashset and adding element
		Set<String> set=new HashSet<String>();
		//in set if you try to add duplicate element dn it will neglect that element
		set.add("RAVI");
		set.add("VIJAY");
		set.add("RAVI");//it dont added in set
		set.add("AJAY");
		System.out.println("before invoking remove(object) method:"+set);
		System.out.println("before invoking remove(object) method:"+set.size());
		//traversing element
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("removing ravi from set:"+set.remove("RAVI"));
		System.out.println("after invoking remove(object) method"+set);
		HashSet<String> set1= new HashSet<String>();
		set1.add("AJAY");
		set1.add("Gaurav");
		System.out.println("set1 elements"+set1);
		set.addAll(set1);
		System.out.println("updated list"+set);
		//remove all the elements from hashset
		set.removeAll(set1);
		System.out.println("after invoking removeall()"+set);
		//remove element on the basis of specified condition
		set.removeIf(str->str.contains("VIJAY"));
		System.out.println("after invoking removeif() method:"+set);
		//removing all the elements available in the set
		set.clear();
		System.out.println("after invoking clear() method"+set);
		List<String> l1=new ArrayList<String>();
		l1.add("pune");
		l1.add("mumbai");
		l1.add("banglore");
		l1.add("pune");
		System.out.println("***l1***"+l1);
		Set s1=new HashSet();
		s1.addAll(l1);
		
		System.out.println("**s1:"+s1);
		Set s2=new HashSet(l1);
		System.out.println("***s2**"+s2);
		//print the count of each word in the given string
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
