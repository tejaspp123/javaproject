package Basicoperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println( driver.getPageSource());
		/** open the google homepage*/
          driver.get("https://www.google.com");
          /*enter current webpage url*/
          System.out.println("current webpage URL:"+driver.getCurrentUrl());
         
         // driver.close();

	}

}
