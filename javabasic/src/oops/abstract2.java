package oops;
abstract class RBI{
	public abstract double getrateofinterestforhomeloan();
}
class SBI extends RBI{
	public double getrateofinterestforhomeloan() {
		System.out.println("SBI getrateofinterestforhomeloan=6.5");
		return 6.5;
	}
}
	class PNB1 extends RBI{
		public double getrateofinterestforhomeloan() {
			System.out.println("PNB getrateofinterestforhomeloan=6.7");
			return 6.7;
		}
		
	}
	class ICICI extends RBI{
		public double getrateofinterestforhomeloan() {
			System.out.println("ICICI getrateofinterestforhomeloan=6.9");
			return 6.9;
		}
		
	}
	


public class abstract2 {

	public static void main(String[] args) {
	   RBI ref=new SBI();
	ref.getrateofinterestforhomeloan();
	 RBI ref1=new PNB1();
		ref1.getrateofinterestforhomeloan();
		RBI ref2=new ICICI();
		ref2.getrateofinterestforhomeloan();
			
		
		
		

	}

}
