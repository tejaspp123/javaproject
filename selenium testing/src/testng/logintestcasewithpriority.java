package testng;

import org.testng.annotations.Test;

public class logintestcasewithpriority {
  @Test(priority=5)
  public void logintestcasewithvaliduser() {
	  System.out.println("logintestcasewithvaliduser");
  }
  
  
  
  @Test(priority=6)
  public void logintestcasewithinvaliduser() {
	  System.out.println("logintestcasewithvaliduser");
  }
  
  
  @Test(priority=0)
  public void logintestcasewithemptyuser() {
	  System.out.println("logintestcasewithemptyuser");
  }
}
