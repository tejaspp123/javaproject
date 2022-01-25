package testng;

import org.testng.annotations.Test;

public class logintestcasewithenabled {
  @Test(enabled=true)
  public void logintestcasewithvaliddata() {
	  System.out.println("login successfully");
  }
  
  
  @Test(enabled=true)
  public void createtask() {
	  System.out.println("task created successfully");
  }
}
