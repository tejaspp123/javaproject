package collection;

import java.util.ArrayList;


public class ArraylistExample3 {
	public static void main(String[]args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Anuj");
		al.add("Gaurav");
		System.out.println("initial list of element"+al);
		//Removing specific element from arraylist
		System.out.println("remove vijay from collection"+al.remove("Vijay"));
		System.out.println("after involking remove(object) method"+al);
		//removing element on the basis of specific position
		System.out.println("remove index 0 from collection:"+al.remove(0));
		System.out.println("after involking remove(index) method"+al);
		System.out.println("***************************************************");
		//creating another arraylist
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");
		//adding new element to arraylist
		al.addAll(al2);
		System.out.println("updated list"+al);
		//removing all the new element from arraylist
		al.removeAll(al2);
		System.out.println("after invoking removeall() method:"+al);

		//removing elements on the basis of specified condition
		al.removeIf(str-> str.contains("Ajay"));//here we are using lamda expression
		System.out.println("after invoking removeif() method:"+al);
		//removing  all the elements available in the list
		al.clear();
		System.out.println("after invoking the clear() method"+al);
		
		
		
	}
}
