package Basicoperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locateelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/**enter required url*/
		driver.get("https://demo.actitime.com/login.do");
		/** locate the username */
		 WebElement usernameinputfield=driver.findElement(By.id("username"));
		 /** enter username url */
		 usernameinputfield.sendKeys("admin");
		 /** locate the password */
		 WebElement passwordinputfield= driver.findElement(By.name("pwd"));
		 /** enter the password*/
		passwordinputfield.sendKeys("manager");
		 /** locate login button */
		  WebElement loginbutton=driver.findElement(By.id("loginButton"));
		  /** click on login button */
		 loginbutton.click();
		  
		 

	}

}
