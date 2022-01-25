package operator;

public class logicaloperator {

	public static void main(String[] args) {
		boolean bool1=true,bool2=true;
		System.out.println("***logical && operator****");
		System.out.println("bool1&&bool2:"+(bool1&&bool2));
		
		System.out.println("***logical ||operator****");
		System.out.println("bool1||bool2:"+(bool1||bool2));
		
		System.out.println("***logical !() operator****");
		System.out.println("bool1&&bool2:"+!(bool1&&bool2));
		
		
		
		boolean sub1=true,sub2=false,sub3=true;
		System.out.println("(sub1&&sub2)||(sub1&&sub3)-"+!((sub1&&sub2)||(sub1&&sub3)));
		
	}

}
