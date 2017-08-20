package com.automation.test;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEInstance {
	public static void main(String[] args) throws InterruptedException 
	{
		String service = "D:\\Software\\Selenium Setup\\IEDriverServer.exe";
		System.setProperty("webdriver.ie.driver", service);
		
		InternetExplorerDriver  driver = new InternetExplorerDriver();
		System.out.println("Launching Internet driver...");
		driver.get("https://www.tutorialspoint.com");
		Thread.sleep(5000);
		
		System.out.println("Tutorial point launched...");
		driver.quit();
		
	}
}
