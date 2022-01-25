package constructor;

public class thiskeywordex2 {
	double mobno=123456;
	int prize=700;
	int rollno=50;
	double fees=1200;
	public void call(double mobno,int prize) {
		
		mobno=90960506;
		prize=500;
		System.out.println(mobno);
		System.out.println(prize);
		System.out.println(this.mobno);
		System.out.println(this.prize);
		
	}
	void display() {
		int rollno=60;
		double fees=1300;
		System.out.println(rollno);
		System.out.println(fees);
		System.out.println(this.rollno);
		System.out.println(this.fees);
		
		
		
	}

	public static void main(String[] args) {
		 thiskeywordex2 ab=new  thiskeywordex2();
		 ab.display();

	}

}
