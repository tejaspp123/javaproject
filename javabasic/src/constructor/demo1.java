package constructor;

public class demo1 {
	/*
	 * there are 2 types of constructor used in java
	 * 1-non parameterised constructor
	 * 2- parameterised constructor
	 * if a class having more than one constructor then it is called as constructor overloading
	 * 2.1-type of argument should be diff
	 * 2.2-number of argument should be diff
	 * 2.3 position of argument should be diff
	 * 
	 */
	demo1(){
		System.out.println(" non parameterised constructor"); 
	}
	demo1(int a  ){
		System.out.println("type of argument should be diff");

	}
	demo1(int a ,double b ){
		System.out.println("number of argument should be diff");

	}
	demo1(double a,int b  ){
		System.out.println("position of argument should be diff");

	}
	public static void main(String[] args) {
		
			 demo1 d1=new demo1(2.2,3);
			 
			 
			 
			 
		
	
		
	}

}
