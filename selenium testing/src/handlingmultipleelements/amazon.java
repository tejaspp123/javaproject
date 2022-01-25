package handlingmultipleelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//enter url
		driver.get("https://www.amazon.com/");
		List<WebElement> function=driver.findElements(By.cssSelector("div[id='nav-xshop']>a"));
		System.out.println("function size:"+function.size());
		for(int i=0; i<function.size();i++) {
			System.out.println(function.get(i).getText());
		}
		
		
		

	}

}
