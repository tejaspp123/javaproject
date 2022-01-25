package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistExample6 {

	public static void main(String[] args) {
		// Generic :with the help of genericrra we can force collection to store similar type of data
		List<Integer>l2=new ArrayList<Integer>();
		l2.add(12);
		l2.add(10);
		l2.add(2);
		l2.add(15);
		l2.add(18);
		System.out.println("size"+l2.size());
		System.out.println("elements of collection"+l2);
		Collections.sort(l2);
		System.out.println("after sorting elements of collection:"+l2);
		Collections.reverse(l2);
		System.out.println("reversing sorted elements of collection :"+l2);

	}

}
