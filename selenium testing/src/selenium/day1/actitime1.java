package selenium.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream(".\\Testdata\\Actitime.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String vkey=prop.getProperty("key");
		String vvalue=prop.getProperty("value");
		String vurl=prop.getProperty("url");
		String vusername =prop.getProperty("username");
		String vpwd=prop.getProperty("password");
		System.out.println("key:"+vkey);
		System.out.println("value:"+vvalue);
		System.out.println("url:"+vurl);
		System.out.println("username:"+vusername);
		System.out.println("pwd:"+vpwd);
		
		
		
		
		// step-1 open the browser
				System.setProperty(prop.getProperty("key"),prop.getProperty("value"));
				WebDriver driver=new ChromeDriver();
				//step-2 enter the url
				driver.get(vurl);
				//implicit wait: Interface>Interface>Interface>abstract method
				/*webdriver->manage->Timeouts->implicitlywait*/
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
				//step-3 loginpage title 
				System.out.println("page title before login:"+driver.getTitle());
				//step-4 locate and enter username
				driver.findElement(By.id("username")).sendKeys(vusername);
				//step-5 locate and enter password
				driver.findElement(By.name("pwd")).sendKeys(vpwd);
				//step-6 locate and click login button
				driver.findElement(By.id("loginButton")).click();
				WebElement logoutLink=driver.findElement(By.linkText("Logout"));
				

	}

}
