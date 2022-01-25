package constructor;

public class defaultconstructor {
int age;
double salary;

	public static void main(String[] args) {
		defaultconstructor a1 =new defaultconstructor();
		/*
		 * if class does not have any constructor then java compile itself write a constructor called as default constructor
		 */
		System.out.println(a1.age);
		System.out.println(a1.salary);
		
		
		

	}

}
