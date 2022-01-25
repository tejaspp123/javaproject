package constructor;

import org.omg.Messaging.SyncScopeHelper;

public class student {
int rollno=101;
float marks=15.5f;
student(int rollno,float marks){
	
	System.out.println("rollno:"+this.rollno);
	System.out.println("rollno:"+rollno);
	System.out.println("marks:"+ this.marks);
	System.out.println("marks:"+marks);
	
}
student(char ch){
	this(1,1.5f);
	
	System.out.println("ch="+'A');
}
	public static void main(String[] args) {
		//student s=new student(102,50);
		student s1=new student('F');
		

	}

}
