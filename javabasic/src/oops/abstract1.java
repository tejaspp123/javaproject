package oops;
abstract class square{
	public abstract void shape();
	void area() {
		System.out.println("area of square 4*side");
	}
}
class triangle extends square{
	public void shape() {
		System.out.println("triangle have triangular type shape");
		
	}
	void area() {
		System.out.println("area of triangle=0.5*base*height");
	}
	void color() {
		System.out.println("triangle does np=ot have any color");
	}
}
class rectangle extends square{
	public void shape() {
		System.out.println("rectangle has rectangular shape");
	}
	void area() {
		System.out.println("area of rectangle=length*height");
	}
}

public class abstract1 {
	public static void main (String[]args) {
		 square s=new triangle();
		s.shape();
		s.area();
		//s.color();
		square rec=new rectangle();
		rec.shape();
		rec.area();
		
	}
	
}
