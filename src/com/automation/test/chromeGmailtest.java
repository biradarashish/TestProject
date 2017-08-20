package com.automation.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeGmailtest {
	public static void main(String args[]) throws InterruptedException{
		String wrongPwdMsg = "Wrong password. Try again.";
		
		String exePath = "D:\\Software\\Selenium Setup\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		System.out.println("Launching chrome browser..");
		
		WebDriver driver = new ChromeDriver();		
		
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		
		WebElement loginName = driver.findElement(By.cssSelector("#Email"));
		WebElement loginBtn = driver.findElement(By.cssSelector("#next"));
				
		loginName.sendKeys("biradarashish");
		Thread.sleep(3000);
		loginBtn.click();
		
		Thread.sleep(5000);
		WebElement pwd = driver.findElement(By.cssSelector("#Passwd"));
		Thread.sleep(2000);
		
		pwd.sendKeys("abchnghdnf");
		driver.findElement(By.cssSelector("#signIn")).click();
		
		WebElement erromsg = driver.findElement(By.cssSelector("#errormsg_0_Passwd"));
		System.out.println(erromsg.getText());
		String typeName = driver.findElement(By.cssSelector("#signIn")).getAttribute("type");
		System.out.println(typeName);
		
		System.out.println((erromsg.getText().equalsIgnoreCase(wrongPwdMsg)));
		
		WebElement forgotPwd = driver.findElement(By.xpath(".//*[@id='link-forgot-passwd']"));
		forgotPwd.click();
		
		driver.navigate().back();
		
		driver.quit();
	}
}
