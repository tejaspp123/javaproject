package testng;

import org.testng.annotations.Test;

public class logintestcasewithdependson {
  @Test
  public void loginvaliduser() {
	  int i=10/0;
	  System.out.println("login successfully");
  }
  
  @Test(dependsOnMethods="loginvaliduser")
  public void createtask() {
	  System.out.println("task created successfuly");
  }
}
