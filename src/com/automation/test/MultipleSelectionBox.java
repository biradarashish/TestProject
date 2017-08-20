package com.automation.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
 		
 		Select oSelect = new Select(driver.findElement(By.name("selenium_commands")));
 		Thread.sleep(10000);
 		oSelect.selectByIndex(0); 
 		Thread.sleep(10000);
		
		oSelect.deselectByIndex(0);
		Thread.sleep(10000);
 		oSelect.selectByVisibleText("Navigation Commands");
		
 		Thread.sleep(10000);
		oSelect.deselectByVisibleText("Navigation Commands");
		Thread.sleep(10000);
		List<WebElement> oSize = oSelect.getOptions();
		int iListSize = oSize.size();
 		for(int i =0; i < iListSize ; i++){	
			String sValue = oSelect.getOptions().get(i).getText();
 			System.out.println(sValue);
 		
 			oSelect.selectByIndex(i);
			Thread.sleep(2000);
			}
 		oSelect.deselectAll();
 		driver.close();
	}

}
