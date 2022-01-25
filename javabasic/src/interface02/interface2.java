package interface02;

import org.omg.Messaging.SyncScopeHelper;

interface grandfather{
	public void home();
	int val=25;
	
}
interface parent extends grandfather{
	public void car();
	void land();
}
class child implements parent{
	public void car() {
		System.out.println("parents have a swift dezire car");
	}
	public void land() {
		System.out.println("parent have 5 acre land");
	}
	public void home() {
		System.out.println("grandfather had its own home");
		
	}
	void bike() {
		System.out.println("child has pulser-150 bike");
	}
	
	

	}


public class interface2 {

	public static void main(String[] args) {
		child c=new child();
		c.home();
		c.land();
		c.car();
		c.bike();
		System.out.println("non static global variable:"+c.val);

	}

}
