package com.automation.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioAndCheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		driver.manage().window().maximize();	
		List<WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));
		
		boolean bValue = false;
		
		bValue = rdBtn_Sex.get(0).isSelected();
		System.out.println("bvalue: " +bValue);
		
		if(bValue == true){
			rdBtn_Sex.get(1).click();
		}else{
			rdBtn_Sex.get(0).click();
		}
		
		Thread.sleep(5000);
		WebElement rdBtn_Exp = driver.findElement(By.id("exp-2"));
		rdBtn_Exp.click();
		
		List<WebElement> chkBx_Profession = driver.findElements(By.name("profession"));
		int iSize = chkBx_Profession.size();
		
		for(int i=0; i < iSize ; i++ ){
			String sValue = chkBx_Profession.get(i).getAttribute("value");
			System.out.println("sValue : " +sValue);
			if (sValue.equalsIgnoreCase("Automation Tester")){
				chkBx_Profession.get(i).click();
			break;
			}
		}
		
		Thread.sleep(5000);
		WebElement oCheckBox = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
		oCheckBox.click();
		driver.quit();
	}
}
