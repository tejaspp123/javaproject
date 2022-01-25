package switching;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class draganddropframe extends seleniumutils {
	WebDriver driver;
//  @Test(priority=0)
//  public void draganddropframe() {
//	  driver=setUp("chrome","https://www.jqueryui.com");
//	  driver.findElement(By.xpath("//a[text()='Droppable']")).click();
//	  //locate the element inside the frame from main menu
//	  driver.switchTo().frame(0);
//	WebElement src= driver.findElement(By.id("draggable"));
//	WebElement target= driver.findElement(By.id("droppable"));
//	Actions action=new Actions(driver);
//	action.dragAndDrop(src, target).build().perform();
//	   }
  @Test(priority=1)
  public void sortableoperation() throws InterruptedException {
	  driver=setUp("chrome","https://www.jqueryui.com");
	  driver.findElement(By.xpath("//a[text()='Sortable']")).click();
	  //locate the frame
	  driver.switchTo().frame(0);
	List <WebElement> list= driver.findElements(By.xpath("//ul[@id='sortable']/li"));
	
		Actions action=new Actions(driver);
	
	for(int i=list.size()-1;i>0;i--) {
		action.dragAndDrop(list.get(i), list.get(0)).build().perform();
	}
	
	
//	WebElement item1= driver.findElement(By.xpath("//ul[@id='sortable']/li[1]"));
//	WebElement item2= driver.findElement(By.xpath("//ul[@id='sortable']/li[2]"));
//	WebElement item3= driver.findElement(By.xpath("//ul[@id='sortable']/li[3]"));
//	WebElement item4= driver.findElement(By.xpath("//ul[@id='sortable']/li[4]"));
//	WebElement item5= driver.findElement(By.xpath("//ul[@id='sortable']/li[5]"));
//	WebElement item6= driver.findElement(By.xpath("//ul[@id='sortable']/li[6]"));
//	WebElement item7= driver.findElement(By.xpath("//ul[@id='sortable']/li[7]"));
//	Thread.sleep(2000);
//	Actions action=new Actions(driver);
//	action.dragAndDrop(item7, item1).build().perform();
//	Thread.sleep(2000);
//	action.dragAndDrop(item6, item1).build().perform();
//	Thread.sleep(2000);
//	action.dragAndDrop(item5, item1).build().perform();
//	Thread.sleep(2000);
//	action.dragAndDrop(item4, item1).build().perform();
//	Thread.sleep(2000);
//	action.dragAndDrop(item3, item1).build().perform();
//	Thread.sleep(2000);
//	action.dragAndDrop(item2, item1).build().perform();
//	
//	
  }
private WebElement get(int i) {
	// TODO Auto-generated method stub
	return null;
}

}
