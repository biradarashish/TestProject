package com.automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingByClassTest {
	public static void main(String args[]) throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.tutorialspoint.com/");
		System.out.println("Tutorial website launched..");
		
		System.out.println("Current URL: " +driver.getCurrentUrl());
		Thread.sleep(5000);
		
		WebElement searchText = driver.findElement(By.cssSelector(".form-controls.search"));
		WebElement searchBtn = driver.findElement(By.cssSelector(".search-butn"));
		WebElement logo = driver.findElement(By.cssSelector(".logo>a>img"));
		
		searchText.sendKeys("Core Java");
		Thread.sleep(3000);
		
		searchBtn.click();
		Thread.sleep(3000);
		
		System.out.println("Current URL after search: " +driver.getCurrentUrl());
		Thread.sleep(5000);
		
		driver.quit();
	}
}
