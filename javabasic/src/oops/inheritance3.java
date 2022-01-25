package oops;
class fruit{
	fruit(){
		System.out.println("fruits have more collection");
	}
	void place() {
		System.out.println("orange are in nagpur and mumbai");
	}
	void taste() {
		System.out.println("fruit are sweet in nature");
	}
}
class apple extends fruit{
	void shape() {
		System.out.println("apple are round in nature");
	}
	
}
class mango extends fruit{
	void colour() {
		System.out.println("mango are yellow in colour");
	}
	
}
class orange extends fruit{
	 orange(){
		 System.out.println("orange is a fruit");
	 }
	void place() {
		
		System.out.println("orange are in nagpur");
	}
	
}

public class inheritance3 {

	public static void main(String[] args) {
		fruit o=new orange();
		o.place();
		o.taste();
		
		

	}

}
