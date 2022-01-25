package selenium.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchingIEbrowser {

	

	public static void main(String[] args) {
		// set the path of IEdriverserver.exe using setproperty() of system class
		//System.setProperty("webdriver.ie.driver","C:\\Users\\Tejal Patil\\Desktop\\seleniun program\\selenium testing\\driver\\IEDriverServer.exe");
//with relative path
		System.setProperty("webdriver.ie.driver",".\\driver\\IEDriverServer.exe");
		InternetExplorerDriver idriver=new InternetExplorerDriver();
		WebDriver idriver1=new InternetExplorerDriver();
	}

}
