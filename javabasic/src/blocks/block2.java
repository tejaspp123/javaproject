package blocks;

public class block2 {
	static int age;
	double salary;
	static {
		System.out.println("static initialization block of class block1");
		age=70;
	}
/*non static initialization block */
	{
	System.out.println("non static initialization  block of class block1");
	salary=50000;
	}

	public static void main(String[] args) {
		
		block2 a1=new block2();
		System.out.println("age"+age);
		System.out.println("salary"+a1.salary);


	}

}
