package oops;
class grandfather{
	grandfather(){
		System.out.println("i am a grandfather");
	}
	void home() {
		System.out.println("grandfather home");
	}
	
}
class father extends grandfather{
	father(){
		System.out.println("i am a father");
	}
	void car() {
		System.out.println("father car");
	}
	
}
class child extends father{
	child(){
		System.out.println("i am a child");
	}
	void bike() {
		System.out.println("child bike");
	}
}

public class inheritance2 extends child {

	public static void main(String[] args) {
		grandfather g1=new grandfather();
		g1.home();
		System.out.println("**************************");
		father f1=new father();
		f1.car();
		f1.home();
		System.out.println("*******************");
 		child c1=new child();
		c1.home();
		c1.car();
		c1.bike();
		System.out.println("*************************");
		father f2=new child();
		f2.home();
		f2.car();
		
		

	}

}
