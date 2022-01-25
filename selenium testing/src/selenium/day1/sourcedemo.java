package selenium.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sourcedemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver cdriver=new ChromeDriver();
		/** enter URl */
		cdriver.get("https://www.saucedemo.com/");
		/** locate the username*/
		//WebElement usernameinputfield=cdriver.findElement(By.id("user-name"));
		/** enter the username*/
	//	usernameinputfield.sendKeys("standard_user");
		//or
		cdriver.findElement(By.id("user-name")).sendKeys("tandard_user");
		
		/** locate & enter the password */
		 cdriver.findElement(By.id("password")).sendKeys("secret_sauce");
		/*
		 * locate and enter on login */
		 cdriver.findElement(By.id("login-button")).click();
		 /** enter page title */
		 System.out.println("page title:"+cdriver.getTitle());
		 /*
		  * enter current url */
		 System.out.println("current url:"+cdriver.getCurrentUrl());
		 cdriver.close();
		 

	}

}
