package finalkeyword;

public class final2 {
	final int speedlimit;//blank final variable
	
	final2(){
		speedlimit=70;
		System.out.println("speedlimit="+speedlimit);
		
	}
	final2(int i){
		speedlimit=i;
		System.out.println("speedlimit"+i);
	}
	void display() {
		System.out.println(speedlimit);
	}
	
	public static void main(String[] args) {
		final2 ref=new final2();
		final2 ref2=new final2(101);
		ref.display();
        
		

	}

}
