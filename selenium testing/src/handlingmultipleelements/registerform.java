package handlingmultipleelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class registerform{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//enter url
		driver.get("http://demo.automationtesting.in/Register.html");
		//locate multiple elements
	List<WebElement> mfunction=driver.findElements(By.cssSelector("ul[class='nav navbar-nav']>li>a"));
	//print count
	System.out.println("count="+ mfunction.size());
	for(int i=0;i<mfunction.size();i++) {
		System.out.println(mfunction.get(i).getText());
		//enter firstname
	WebElement	fname=driver.findElement( By.cssSelector("input[placeholder='First Name']"));
	fname.clear();
	fname.sendKeys("tejas");
	//enter lastname
	WebElement	Lname=driver.findElement( By.cssSelector("input[placeholder='Last Name']"));
	Lname.clear();
	Lname.sendKeys("patil");
	//enter address
	WebElement	address=driver.findElement( By.cssSelector("div[class='col-md-8 col-xs-8 col-sm-8']>textarea"));
	 address.sendKeys("at-khirode pra raver tal-raver dist-jalgaon");
	
	
	
	
	
	
	
		
	}	

	}

}
