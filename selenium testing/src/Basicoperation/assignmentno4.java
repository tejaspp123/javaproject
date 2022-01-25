package Basicoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignmentno4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		FirefoxDriver fdriver=new FirefoxDriver();
	
	 fdriver.get("https://demosite.executeautomation.com");
	String s1= fdriver.getTitle();
	System.out.println("title name:"+s1);
	System.out.println("title length:"+s1.length());
	String actualurl=fdriver.getCurrentUrl();
	String expectedurl=("https://demosite.executeautomation.com/");
	if( actualurl.equals(expectedurl)) {
		System.out.println("correct page open");
	}
	else {
		System.out.println("wrong page open");
	}
	
	
//locate the username
 WebElement userenameinputfield=fdriver.findElement(By.name("username"));
//	 //enter the username
 userenameinputfield.sendKeys("execution");
//	 //locate the password
 WebElement passwordinputfield=fdriver.findElement(By.name("password"));
//	 //enter the password
	 passwordinputfield.sendKeys("admin");
//	 
	 
		
		
		

	}

}
