package handlingmultipleelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gsmarena1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//enter url
		driver.get("https://www.gsmarena.com/");
	List<WebElement> option=driver.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
	System.out.println("count"+option.size());
	for(int i=0;i<option.size();i++)
	{
		System.out.println(option.get(i).getText());
	}

	}

}
