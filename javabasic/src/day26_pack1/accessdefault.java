package day26_pack1;
class A{
	/*
	 * default members access only within the package without package not possible
	 */
	static int age=21;
	static double salary=10000;
}

public class accessdefault {
	
public static void main(String[] args) {
	System.out.println("class A static variable age="+A.age);
	System.out.println("class A static variable salary="+A.salary);
		

	}

}
