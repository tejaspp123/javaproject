package Basicoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//open the link
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//locate the username
		WebElement usernameinputfield=driver.findElement(By.id("txtUsername"));
		//enter the username
		usernameinputfield.sendKeys("Admin");
		//locate the password
		WebElement passwordinputfield=driver.findElement(By.id("txtPassword"));
		//enter the password
		passwordinputfield.sendKeys("admin123");
		//locate login
		WebElement loginb=driver.findElement(By.id("btnLogin"));
		loginb.click();
		
		
		
		
		

	}

}
