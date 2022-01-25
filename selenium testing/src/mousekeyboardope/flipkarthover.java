package mousekeyboardope;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkarthover {

	

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//full screen
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		//enter url
		driver.get("https://www.flipkart.com");
		//remove popup
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		Thread.sleep(2000);
		List<WebElement>mainmenu=driver.findElements(By.xpath("//div[@class='_37M3Pb']/div/a/div[2]"));
		Actions action=new Actions(driver);
		System.out.println("*****main menu********");
		for(int i=0;i<mainmenu.size();i++) {
			
			System.out.println(+i+">"+mainmenu.get(i).getText());
			Thread.sleep(500);
		
		action.moveToElement(mainmenu.get(i)).perform();
	List<WebElement> submenu=driver.findElements(By.xpath("//div[@class='_2IjXr8']"));
//		List<WebElement> submenu=driver.findElements(By.xpath("//div[@class='_37M3Pb']/div/a/div[2]/div/div/div/div/div/a[@class='_6WOcW9']"));
		System.out.println("******submenu********");
		for(int j=0;j<submenu.size();j++) {
			System.out.println(+j+">"+submenu.get(j).getText());
		}
		
		
		}
		
		

	}

}
