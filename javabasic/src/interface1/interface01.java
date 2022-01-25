package interface1;
interface drawable{
	void draw();
	
	
}
class rectangle implements drawable{
	public void draw() {
		System.out.println("rectangle is drawable");
	}

}

class circle implements drawable{
	public void draw() {
		System.out.println("circle is drawable");
	}
}
public class interface01 {

	public static void main(String[] args) {
		drawable dr=new rectangle();
		dr.draw();
		drawable dd=new circle();
		dd.draw();
		

	}

}
