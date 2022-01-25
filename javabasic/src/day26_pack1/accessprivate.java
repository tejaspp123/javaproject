package day26_pack1;


public class accessprivate  {
	/*
	 * access only within the class and within the package
	 */
	private  int rollno=101;
		private int fees=10000;
		 private void student(){
			int rollno=102;
			int fees=20000;
			System.out.println("rollno:"+rollno);
			System.out.println("fees="+fees);
		 }
			
	            

	public static void main(String[] args) {
		accessprivate ref1=new accessprivate();
		System.out.println(ref1.rollno);
		System.out.println(ref1.fees);
		ref1.student();
		
		
		

	}

}
