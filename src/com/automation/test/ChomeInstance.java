package com.automation.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChomeInstance {
	public static void main(String[] args) throws InterruptedException {
		String exePath = "D:\\Software\\Selenium Setup\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		
		System.out.println("Launching chrome browser..");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com");
		System.out.println("Tutorial point launched..");
		
		Thread.sleep(5000);
		driver.quit();
	}
}
