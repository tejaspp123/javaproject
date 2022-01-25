package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArraylistExample1 {

	public static void main(String[] args) {
	ArrayList list =new ArrayList();//creating arraylist
	list.add("Mango");//auto upcasting from string to object class object
	list.add("Apple");
	list.add("Banana");
	list.add("Grapes");
	//printing the arraylist object
	System.out.println("size of list"+list.size());
	System.out.println("Elements of list"+list);
	System.out.println("Travaersing list through for loop");
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	System.out.println("traversing list through for-each loop:");
	for(Object fruit:list) {
	System.out.println(fruit);
		
	}
	//accessing the element
	System.out.println("Returning the element"+list.get(1));//it will return the 2nd element ,because index start from 0
	//changing the element
	list.set(1,"Dates");
	System.out.println("elements of list"+list);
	//sorting the list
	Collections.sort(list);//by default it sort the passed collection element in assending order and store it in the same collection
	System.out.println("size of list"+list.size());
	System.out.println("elements of list"+list);
	System.out.println("traversing list through foreach()method:");
	//the foreach() method is a new feature,introduced in java 8
	list.forEach(a->{//here,we are using lamda expression
		System.out.println(a);
	});
	System.out.println("traversing list through iterator interface:");
	Iterator itr=list.iterator();
	/*
	 * list element:[Banana,Dates,Grapes,Mango]
	 * iterator is a interface in collection ,which is use to iterate collection elements
	 * iterator interface has following method  to iterate collection elements
	 * 1.hasnext()--->boolean--->true next element is present,false no next element
	 * 2.next()--->object-->it will return next element from collection 
	 * 3.remove()-->void-->element deletion
	 * iterator object can be use to iterate a collection only once ,for 2nd iteration create new iterator object
	 */
//	System.out.println(itr.hasNext());
//	System.out.println(itr.next());//banana
//	System.out.println(itr.next());//date
//	System.out.println(itr.next());//grapes
//	System.out.println(itr.next());//mango
//	System.out.println(itr.next());//no such element exception
	while(itr.hasNext()){
	
	System.out.println(itr.next());
	}

	}
	}


