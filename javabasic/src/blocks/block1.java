package blocks;

public class block1 {
	/* static initialization block SIB */
	static {
		System.out.println("static initialization block of class block1");
	}
/*non static initialization block */
	{
	System.out.println("non static initialization  block of class block1");	
	}
	public static void main(String[] args) {
		block1 ref =new block1();
		
		

	}

}
