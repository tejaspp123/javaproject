package oops;
abstract class animal{
	 public abstract void animalsound();

	
}
class pig extends animal{
	public void animalsound() {
		System.out.println("the pig says wee wee");
	}
	void colour() {
		System.out.println("the pig is black in colour");
	}

	
		
	}
class dog extends animal{
	public void animalsound() {
		System.out.println("the dog says bow bow");
	}
	void move() {
		System.out.println("the dog can move and walk");
	}
	
	
}
	


public class abstract01 {

	public static void main(String[] args) {
		pig p=new pig();
	p.animalsound();
	p.colour();
		dog d=new dog();
	d.animalsound();
	d.move();
	System.out.println("******************");
		animal a=new pig();
		a.animalsound();
		//a.colour();//not possible
		animal a1=new dog();
		a1.animalsound();
		//a1.move();
		
	

	}

}
