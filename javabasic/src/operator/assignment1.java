package operator;



public class assignment1 {

	public static void main(String[] args) {
		int a=0,b;
		b=a++ + ++a + ++a  +a;
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("***********");
		int a1=0,b1;
		b1=a1-- + --a1 + --a1 + a1;
		System.out.println("a1="+a1);
		System.out.println("b1="+b1);
		System.out.println("**************");
		int a3=0,b3;
		b3=--a3 + --a3 + --a3 +a3 + ++a3 +a3++;
		System.out.println("a3="+a3);
		System.out.println("b3="+b3);
		System.out.println("*****************");
		int a4=0,b4;
		b4=a4-- +a4 + ++a4 + a4++ + ++a4 + a4++ +a4;
		System.out.println(a4);
		System.out.println(b4);

	}

}
