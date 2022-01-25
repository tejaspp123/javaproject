package collection;

import java.util.ArrayList;

public class ArraylistExample2 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		System.out.println("initial list of element"+al);
		
		System.out.println("list of elements status:"+al.isEmpty());//adding elements to the end of the list
		al.add("Ravi");
		al.add("vijay");
		al.add("ajay");
		System.out.println("after invoking add (int index,E element)method:"+al);
		ArrayList al2=new ArrayList();
		al2.add("sonoo");
		al2.add("hanuman");
		//adding second list element to the first list 
		System.out.println("list al elements before adding list al2"+al);
		al.addAll(al2);
		System.out.println("list al element after adding list al2:"+al);
		ArrayList al3=new ArrayList();
		al3.add("john");
		al3.add("rahul");
		System.out.println("elements of al2"+al2);
		System.out.println("elements of al3"+al3);
		//adding third list element to the first list 
		al.addAll(al3);
		System.out.println(al);
		//adding second list element to the first list at specific position
		al2.addAll(1,al3);
		System.out.println("after adding al3 into al2"+al2);
		

	}

}
