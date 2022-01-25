package constructor;

public class thisstatement {
	thisstatement(){
		this(1);
		System.out.println("non para constructor");
	}
	thisstatement(int a){
		
		System.out.println("int type constructor");
	}
	thisstatement(double a){
		System.out.println("double type constructor");
	}
	public static void main(String[] args) {
		thisstatement th=new thisstatement();
	

	}

}
