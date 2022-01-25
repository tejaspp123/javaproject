package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistExample4 {

	public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	System.out.println("is Arraylist empty:"+al.isEmpty());
	al.add("Ravi");
	al.add("Vijay");
	al.add("Ajay");
	ArrayList<String> al2=new ArrayList<String>();
	al.retainAll(al2);
	System.out.println("iterating the elements after retaining the elements of al2");
	Iterator itr =al.iterator();
	while (itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	

	}

}
