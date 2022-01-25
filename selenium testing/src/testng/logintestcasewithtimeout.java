package testng;

import org.testng.annotations.Test;

public class logintestcasewithtimeout {
  @Test(timeOut=2000)
  public void loginwithvaliduser() throws InterruptedException {
	  Thread.sleep(3000);
	  System.out.println("i am passed");
  }
  
  
  @Test(timeOut=2000)
  public void loginwithinvaliduser() throws InterruptedException {
	  Thread.sleep(1000);
	  System.out.println("i am passed");
  }
}
