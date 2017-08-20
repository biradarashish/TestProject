package com.automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver;
		driver = new FirefoxDriver();
		
		System.out.println("created driver instance");
		Thread.sleep(10000);
		driver.get("https://www.tutorialspoint.com");
		
		System.out.println("Tutorial point website launched successfully..");
		Thread.sleep(5000);
		driver.quit();
		
	}
}
