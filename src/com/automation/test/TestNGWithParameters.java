package com.automation.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

class Listener implements ISuiteListener, ITestListener
{

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ISuite arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub
		
	}
	
}

public class TestNGWithParameters {
	private static WebDriver driver;
	 
	  @Test
	  @Parameters({ "sUsername", "sPassword" })
	  public void test(String sUsername, String sPassword) {
	 
		  driver = new FirefoxDriver();
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      driver.get("http://www.store.demoqa.com");
	      driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	      driver.findElement(By.id("log")).sendKeys(sUsername);
	      driver.findElement(By.id("pwd")).sendKeys(sPassword);
	 
	      driver.findElement(By.id("login")).click();
	      driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
	      driver.quit();
	 
	  }
}
