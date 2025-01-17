package test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
	
	@Test
	public void mobileLoginPersonalLoan() {
		System.out.println("Mobile login functionality for Personal loan applicant");
	}
	
	@Test
	public void webLoginPersonalLoan() {
		System.out.println("Web login functionality for Personal loan applicant");
	}
	
	@Test
	public void APILoginModulePersonalLoan() {
		System.out.println("REST API automation login functionality for Personal loan applicant");
	}
	
	@Test
	public void mobileSignOutPersonalLoan() {
		System.out.println("Mobile sign out functionality for Personal loan applicant");
	}
	
	@Test
	public void webSignOutPersonalLoan() {
		System.out.println("Web sign out functionality for Personal loan applicant");
	}
	
	@Test
	public void APISignOutModulePersonalLoan() {
		System.out.println("REST API automation sign out functionality for Personal loan applicant");
	}
	
	@AfterTest
	public void cleanUp() {
		System.out.println("This will be executed last, but at the end of tests defined between <test> and</test> tags");
	}
	
	@BeforeTest
	public void setUp() {
		System.out.println("This will be executed first, before the tests defined between <test> and</test> tags");
	}
	
	@BeforeClass
	public void beforeclassMethod() {
		System.out.println("This BeforeClass method defined inside Day2 will execute before all test methods in THIS CLASS is executed");
	}
	
	@AfterClass
	public void afterClassMethod() {
		System.out.println("This AfterClass method defined inside Day2 will execute after all the test methods in THIS CLASS is executed");
	}

}
