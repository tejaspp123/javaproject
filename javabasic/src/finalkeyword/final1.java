package finalkeyword;

public class final1 {
	final int age=21;
	double salary=25000;
	public static void main(String[] args) {
		final1 s1=new final1();
		final1 s2=new final1();
	
		System.out.println("age="+s1.age);
		System.out.println("salary="+s1.salary);
		  s1.salary=35000;
		System.out.println("updated salary="+ s1.salary);
		s2.salary=50000;
		System.out.println("2nd updated salary="+s2.salary);
		

	}

}
