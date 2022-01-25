package mousekeyboardope;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//enter url
		driver.get("https://jqueryui.com/droppable/");
		//switch to frame
				driver.switchTo().frame(0);
				//locate draggable
			WebElement src=driver.findElement(By.id("draggable"));
			//locate droppable
			WebElement target=driver.findElement(By.id("droppable"));
			Actions action=new Actions(driver);
			//action.dragAndDrop(src, target).build().perform();
			//by co-ordinate
			action.dragAndDropBy(src, 150,50).build().perform();
			
		
		

	}

}
