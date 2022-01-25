package constructor;

public class A{
	int age=45;
		double salary=50000;
	A(){
		int age=25;
		double salary=22500;
		System.out.println("age"+age);
		System.out.println("ngv age"+this.age);
		System.out.println("salary"+salary);
		System.out.println("ngv salary="+this.salary);
		
	}
A(int age,double salary){
	age=75;
	salary=35000;
	System.out.println("age"+age);
	System.out.println("ngv age"+this.age);
	System.out.println("salary"+salary);
	System.out.println("ngv salary="+this.salary);
	
	
	
}

	public static void main(String[] args) {
		
A a1=new A();
		
		

	}

}
