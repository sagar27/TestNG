package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day3 {

	@Test
	public void mobileLoginCarLoan() {
		System.out.println("Mobile login functionality for car loan applicant");
	}
	
	@Test
	public void webLoginCarLoan() {
		System.out.println("Web login functionality for car loan applicant");
	}
	
	@Test
	public void APILoginModuleCarLoan() {
		System.out.println("REST API automation login functionality for car loan applicant");
	}
	
	@Test
	public void mobileSignOutCarLoan() {
		System.out.println("Mobile sign out functionality for Car loan applicant");
	}
	
	@Test
	public void webSignOutCarLoan() {
		System.out.println("Web sign out functionality for Car loan applicant");
	}
	
	@Test
	public void APISignOutModuleCarLoan() {
		System.out.println("REST API automation sign out functionality for Car loan applicant");
	}
	
	@BeforeMethod
	public void beforeMethodTest() {
		System.out.println("-----------------------------BeforeMethod defined in Day3 class-----------------------------------");
	}
	
}
