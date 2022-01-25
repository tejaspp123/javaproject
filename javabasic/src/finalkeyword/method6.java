package finalkeyword;

public class method6 {
	/*global variable static and non static  */
	static int rollno=101;
	double fees=1000.50;
	/* method for both static and non statc
	 * with and without parameter
	 * with and without return type*/
	static void add() {
		System.out.println("this is static method without parameter and without return type");
	}
	public double call(int i) {
		System.out.println("this is a non static method with parameter and with return type ");
		return 2.55;
		
	}

	public static void main(String[] args) {
		// call the above statement
		System.out.println("static variable rollno:"+method6.rollno);
		method6.add();
		method6 ref=new method6();
		System.out.println("fees:"+ref.fees);
		ref.call(25);
		
		
		
		

	}

}
