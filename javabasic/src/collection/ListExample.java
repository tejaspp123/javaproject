package collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample extends Object {

	public static void main(String[] args) {
		ArrayList a1= new ArrayList();
		//creating an object of an arraylist and upcasting it to list interface
		List l1=new ArrayList();
		//in collection we can store only object class object
		a1.add("pune");//string object "pune" will be upcasting to object class object
		//int will be boxed(wrapper class)to integer class object and dn that object will be upcasted to object class object 
		a1.add(121);
		a1.add(true);
		a1.add(null);
		a1.add("pune");
		System.out.println("size of list"+a1.size());
		System.out.println("elements of list"+a1);
		a1.add(1,"mumbai");
		System.out.println("size of list"+a1.size());
		System.out.println("elements of list"+a1);
		System.out.println("index at specific elements"+a1.get(2));
		/*
		 * printing one by one element of an arraylist using for loop
		 
		 */
		for(int i=0;i<a1.size();i++) {
			System.out.println("element at index:"+i+":"+a1.get(i));
		}
		for(Object obj:a1) {
			System.out.println(obj);
		}
		
		
		
		
		
		
		
		
	}

}
