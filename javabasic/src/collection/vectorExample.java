package collection;

import java.util.Vector;

public class vectorExample {

	public static void main(String[] args) {
		//create a vector
		Vector<String> vec=new Vector<String>();
		//adding element using add() method of list
		vec.add("tiger");
		vec.add("lion");
		vec.add("dog");
		vec.add("elephant");
		System.out.println("elements are"+vec);
		vec.addElement("rat");
		vec.addElement("cat");
		vec.addElement("deer");
		System.out.println("elements are"+vec);
		
		
		

	}

}
