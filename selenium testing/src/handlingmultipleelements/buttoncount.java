package handlingmultipleelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttoncount {

	public static void main(String[] args) throws InterruptedException {
		//step1:open browser
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//step2:full screen browser
		driver.manage().window().maximize();
		//step3:enter required url
		driver.get("http://demo.automationtesting.in/Register.html");
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement signupBtn=driver.findElement(By.name("signup"));
		System.out.println(signupBtn.isDisplayed()+":"+signupBtn.isEnabled());
		System.out.println("button Name:"+signupBtn.getText());
		System.out.println("name attribute value:"+signupBtn.getAttribute("name"));
		System.out.println("class attribute value:"+signupBtn.getAttribute("class"));
		System.out.println("type attribute value:"+signupBtn.getAttribute("type"));
		 List<WebElement> buttons=driver.findElements(By.tagName("button"));
		 System.out.println("button counts:"+buttons.size());
		 for(int i=0;i<buttons.size();i++) {
			 System.out.println(buttons.get(i).getAttribute("class"));
		 }
				 
		 
		
		
		
		
		
		
	
		
		

	}

}
