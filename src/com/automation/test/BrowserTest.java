package com.automation.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.tutorialspoint.com/");
		System.out.println("Tutorial website launched..");
		
		Thread.sleep(5000);
		System.out.println("Current URL: " +driver.getCurrentUrl());
		Thread.sleep(3000);
		System.out.println("Check Url: " +driver.getCurrentUrl().equals("https://www.tutorialspoint.com/"));
		System.out.println("Title: " +driver.getTitle());
		Thread.sleep(3000);
		
		System.out.println("refresh current Page");
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		System.out.println("maximaize current window: ");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		System.out.println("Delete cookies: ");
		driver.manage().deleteAllCookies();
						
		System.out.println("Navigate to Google");
		driver.navigate().to("https://www.google.com");
		
		driver.quit();
	}
}
