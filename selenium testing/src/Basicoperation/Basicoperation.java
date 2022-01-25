package Basicoperation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Basicoperation {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver",".\\driver\\IEDriverServer.exe");
		InternetExplorerDriver idriver=new InternetExplorerDriver();
		//enter required url
		idriver.get("http://www.google.com");
		//print the page source code
	System.out.println("page source:"+idriver.getPageSource());
	//current page title
	String currentpagetitle=idriver.getTitle();
		//System.out.println("current page title"+currentpagetitle);
		//or
		System.out.println("current page title:"+idriver.getTitle());
		//current page url
		System.out.println("current page url:"+idriver.getCurrentUrl());
		//close current browser instance
		idriver.close();
		
		
		
		

	}

}
