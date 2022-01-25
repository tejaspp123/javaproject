package selenium.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchingfirefoxbrowser {

	public static void main(String[] args) {
		//set the absolute path of chromedriver.exe using setproperty() using system  class
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tejal Patil\\Desktop\\seleniun program\\selenium testing\\driver\\geckodriver.exe");
		//setthe relative  path driver
				//System.setProperty("webdriver.gecko.driver",".\\driver\\geckodriver.exe");
				
				//open chrome driver
				FirefoxDriver fdriver =new FirefoxDriver();


	}

}
