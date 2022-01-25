package collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityqueueExample {

	public static void main(String[] args) {
	Queue queue =new PriorityQueue ();
	//while adding element in queue it will always keep smallest element on top
	queue.add(123);
	queue.add(23);
	queue.add(12);
	queue.add(3);
	queue.add(123);
	System.out.println("queue sizze:"+queue.size());
	System.out.println("elements in queue:"+queue);
	// if use element() then it will print top most position & if queue is empty dn it will print no scuch type of exception
	System.out.println("head element of the queue:"+queue.element());
	// if use peek() then it will print top most position & if queue is empty dn it will print null
	System.out.println("head element of the queue:"+queue.peek());
	System.out.println("iterating queue element using for each loop");
	for(Object obj:queue) {
		System.out.println(obj);
		
	}
	System.out.println("iterating queue element using iterator");
	Iterator itr= queue.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("elements of queue:"+queue);
	//if use remove() then it will remove top most position object & if queue is empty then it will print no such type of exception
System.out.println("removing elements from queue:"+queue.remove());//3
System.out.println(" after removing elements from queue:"+queue);

System.out.println("removing elements from queue using poll():"+queue.poll());
System.out.println("print elements of queue:"+queue);
System.out.println("after removing two elements");
Iterator itr2= queue.iterator();
while(itr2.hasNext()) {
	System.out.println(itr2.next());
}


	
	

	}

}
