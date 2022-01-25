package testng;

import org.testng.annotations.Test;

public class testcasewithdiscription {
  @Test(description="tc:1 login with valid user")
  public void loginwithvaliduser() {
	  System.out.println("login with valid username");
  }
  
  @Test(description="tc:2 login with invalid user")
  public void loginwithinvaliduser() {
	  System.out.println("login with invalid username");
  }
  
  
  @Test(description="tc:3 login with empty user")
  public void loginwithemptyuser() {
	  System.out.println("login with empty username");
  }
}
