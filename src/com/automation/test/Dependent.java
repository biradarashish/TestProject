package com.automation.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dependent {

	@Test(dependsOnMethods = { "OpenBrowser" })
	@Parameters()
	public void SignIn() {
		System.out.println("This will execute second (SignIn)");
	}

	@Test
	public void OpenBrowser() {
		System.out.println("This will execute first (Open Browser)");
	}

	@Test (dependsOnMethods = { "SignIn" })
	  public void LogOut() {
		System.out.println("This will execute third (Log Out)");
	}
}