package collection;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		System.out.println("initial list of element"+ll);
		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		System.out.println("after invoking add(E e) method:"+ll);
		//adding an element at the specific position
		ll.add(1,"Gaurav");
		System.out.println("after invoking add(int index,E element)method"+ll);
		LinkedList<String> ll2=new LinkedList<String>();
		ll2.add("sonoo");
		ll2.add("hanumat");
		//adding second list elements to the first list
		ll.addAll(ll2);
		System.out.println("after invoking the add all"+ll);
		LinkedList<String> ll3=new LinkedList<String>();
		ll3.add("john");
		ll3.add("rahul");
		//adding second list element to the first list at specific position
		ll.addAll(1,ll3);
		System.out.println("after invoking the add all"+ll);
		//adding an element at the first position
		ll.addFirst("Lokesh");
		System.out.println("after invoking the addfirst "+ll);
		//adding an element at last position
		ll.addLast("Harsh");
		System.out.println("after invoking  addLast "+ll);
		
		
		
		
		
		
		
		

	}

}
