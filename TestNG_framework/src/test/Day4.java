package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day4 {
	
	@AfterMethod
	public void afterMethodTest() {
		System.out.println("---------------------------AfterMethod defined in Day4 class-----------------------------------");
	}
	
	@Test
	public void mobileLoginHomeLoan() {
		System.out.println("Mobile login functionality for Home loan applicant");
	}
	
	@Test
	public void webLoginHomeLoan() {
		System.out.println("Web login functionality for Home loan applicant");
	}
	
	@Test
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
	
	@Test
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
