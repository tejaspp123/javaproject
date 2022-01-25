package propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrm {

	public static void main(String[] args) throws IOException {
		//step1:create file inputstreamclass instance and pass property file location to its constructor
		FileInputStream fis=new FileInputStream(".\\Testdata\\orangehrm.properties");
		
		//step2: create properties file instance
		Properties prop=new Properties();
		
		//step3:call the load method and pass fileinputstream instance
		prop.load(fis);
		 
		//step4:read data
	System.out.println(prop.getProperty("key"));
	System.out.println(prop.getProperty("value"));
	System.out.println(prop.getProperty("url"));
	System.out.println(prop.getProperty("username"));
	System.out.println(prop.getProperty("password"));
	
		
		
		
		
		
		
		System.setProperty(prop.getProperty("key"),prop.getProperty("value"));
		WebDriver driver=new ChromeDriver();
		//enter url
		driver.get(prop.getProperty("url"));
		//username
	WebElement username=driver.findElement(By.id("txtUsername"));
	username.sendKeys(prop.getProperty("username"));
	//password
    WebElement pwd=driver.findElement(By.id("txtPassword"));
	pwd.sendKeys(prop.getProperty("password"));
	//login
	WebElement login=driver.findElement(By.id("btnLogin"));
	login.click();

		

	}

}
