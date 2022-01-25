package testng;

import org.testng.annotations.Test;

public class logintestcase {
  @Test
  public void loginwithvalidusername() {
	  System.out.println("loginwithvalidusername");
  }
  
  @Test
  public void loginwithinvalidusername() {
	  System.out.println("loginwithinvalidusername");
  }
  
  @Test
  public void loginwithemptyusername() {
	  System.out.println("loginwithvalidusername");
  }
}
