package com.automation.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFlow {

	@Test
	public void TC0(){
		System.out.println("Test: ");
	}
	
	@BeforeSuite
	public void TC1(){
		System.out.println("Before suite: ");
	}
	
	@AfterSuite
	public void TC2(){
		System.out.println("After suite: ");
	}
	
	@BeforeClass
	public void TC3(){
		System.out.println("Before class: ");
	}
	
	@AfterClass
	public void TC4(){
		System.out.println("After class: ");
	}
	
	@BeforeMethod
	public void TC5(){
		System.out.println("Before method: ");
	}
	
	@AfterMethod
	public void TC6(){
		System.out.println("After method: ");
	}
	
	@BeforeTest
	public void TC7(){
		System.out.println("Before Test: ");
	}
	
	@AfterTest
	public void TC8(){
		System.out.println("After Test: ");
	}
	
}
