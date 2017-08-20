package com.automation.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.jboss.netty.util.internal.SystemPropertyUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		  
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		Select oSelect = new Select(driver.findElement(By.id("continents")));
 		oSelect.selectByVisibleText("Europe");
 		Thread.sleep(10000);
 
 		oSelect.selectByIndex(2);
		Thread.sleep(10000);
		
 		List<WebElement> oSize = oSelect.getOptions();
		
 		int iListSize = oSize.size();
 		System.out.println("List size: " +iListSize);
 		
 		for(int i =0; i < iListSize ; i++){	
			String sValue = oSelect.getOptions().get(i).getText();
			System.out.println(sValue);
			 
			if(sValue.equals("Africa")){
				oSelect.selectByIndex(i);
				break;
				}
			}	    
		driver.quit();
	}

}
