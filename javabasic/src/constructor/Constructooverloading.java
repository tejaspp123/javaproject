package constructor;

public class Constructooverloading {
	Constructooverloading(){
		System.out.println("zero parameterised constructor");
		System.out.println(" constructor having zero parameter");
	}
	Constructooverloading(int a){
		System.out.println("parameterised constructor");
		System.out.println("constructor having int parameter");
		
	}
	Constructooverloading(double a,int b){
		System.out.println("parameterised constructor");
		System.out.println("constructor having double,int parameter");
	}
	Constructooverloading(int a,double b){
		System.out.println("parameterised constructor");
		System.out.println("constructor having int,double constructor");
	}
	

	public static void main(String[] args) {
		//Constructooverloading co1=new Constructooverloading();
		//Constructooverloading co2=new Constructooverloading(20);
		//Constructooverloading co3=new Constructooverloading(10.25,10);
		Constructooverloading co4 =new Constructooverloading(10,150.25);
		
		

	}




	}


