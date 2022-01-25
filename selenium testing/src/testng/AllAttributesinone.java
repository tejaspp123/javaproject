package testng;

import org.testng.annotations.Test;

public class AllAttributesinone {
  @Test(description="tc:1=loginwithvaliduser1",timeOut=2000,priority=0,enabled=true)
  public void loginwithvaliduser1() {
	  System.out.println("login successfully");
  }
  
  
  @Test(description="tc:2=create task",timeOut=2000,enabled=true,dependsOnMethods="loginwithvaliduser1")
  public void createtask() {
	  System.out.println("task created successfully");
  }
}
