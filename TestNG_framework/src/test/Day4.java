package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
	@Test(enabled=false)
	public void disabledMethod() {
		System.out.println("This test case is disabled using 'enabled' flag");
	}
	
	@AfterMethod
	public void afterMethodTest() {
		System.out.println("---------------------------AfterMethod defined in Day4 class-----------------------------------");
	}
	
	@Parameters({"URL"})
	@Test
	public void mobileLoginHomeLoan(String s) {
		System.out.println("Mobile login functionality for Home loan applicant " +s);
	}
	
	@Test
	public void webLoginHomeLoan() {
		System.out.println("Web login functionality for Home loan applicant");
	}
	
	@Test(groups = {"API"})
	public void APILoginModuleHomeLoan() {
		System.out.println("REST API automation login functionality for Home loan applicant");
	}
	
	@Test
	public void mobileSignOutHomeLoan() {
		System.out.println("Mobile sign out functionality for Home loan applicant");
	}
	
	@Test
	public void webSignOutHomeLoan() {
		System.out.println("Web sign out functionality for Home loan applicant");
	}
	
	@Test(groups = {"API"})
	public void APISignOutModuleHomeLoan() {
		System.out.println("REST API automation sign out functionality for Home loan applicant");
	}
	
	@AfterSuite
	public void afterSuiteTest() {
		System.out.println("This method is the last method that will be run after all other methods in the suite");
	}
	
	@BeforeSuite
	public void beforeSuiteTest() {
		System.out.println("This method is the first method to run before all other methods in the suite");
	}

}
