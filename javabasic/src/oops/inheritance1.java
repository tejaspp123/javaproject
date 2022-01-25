package oops;
class A{
	A(){
		System.out.println("class A constructor");
	}
	void display() {
		System.out.println("class A display method");
	}
	
}
class B extends A{
	B(){
		super();
		System.out.println("class B constructor");
	}
	void call() {
		System.out.println("class B call method");
	}
	
}
	


public class inheritance1 extends B {

	public static void main(String[] args) {
		B b1=new B();
		b1.call();
		b1.display();
	
		
		
		

	}

}
