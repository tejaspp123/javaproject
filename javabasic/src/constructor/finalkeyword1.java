package constructor;

public class finalkeyword1 {
	final public int mobno(int mob) {
		mob=9096050;
	System.out.println("mo no is="+mob);
		return 1;
		
	}

	public static void main(String[] args) {
		final int empid=100;
		double salary=35000;
	System.out.println("empid="+empid);
		System.out.println("salary="+salary);
		salary=40000;
		System.out.println("1st updated salary"+salary);
		finalkeyword1 fi1=new finalkeyword1();
		fi1.mobno(5);
		
		

	}

}
