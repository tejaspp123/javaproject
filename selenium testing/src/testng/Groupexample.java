package testng;

import org.testng.annotations.Test;

public class Groupexample {
  @Test(groups="regression")
  public void testcase1() {
	  System.out.println("hello i am testcase 1 of regression groups ");
  }
  
  @Test(groups="regression")
  public void testcase2() {
	  System.out.println("hello i am testcase 2 of regression groups ");
	  System.out.println("hello i am testcase 3 of regression groups ");
  }
  
  @Test(groups="smoke")
  public void testcase3() {
	  System.out.println("hello i am testcase 3 of smoke groups ");
  }
  
  @Test(groups="regression")
  public void testcase4() {
	  System.out.println("hello i am testcase 4 of regression groups ");
  }
  
  @Test(groups="smoke")
  public void testcase5() {
	  System.out.println("hello i am testcase 5 of smoke groups ");
  }
  
  
  @Test(groups="sanity")
  public void testcase6() {
	  System.out.println("hello i am testcase 6 of sanity groups ");
  }
  
}
