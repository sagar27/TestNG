package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {

	@Parameters({"URL"})
	@Test
	public void mobileLoginCarLoan(String s) {
		System.out.println("Mobile login functionality for car loan applicant " +s);
	}
	
	@Test(dataProvider = "getData")
	public void login(String username, String pwd) {
		
		System.out.println("Username: " +username);
		System.out.println("Password: " +pwd);
		
	}
	
	@Test
	public void webLoginCarLoan() {
		System.out.println("Web login functionality for car loan applicant");
	}
	
	@Test(groups = {"API"})
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
	
	@Test(groups = {"API"})
	public void APISignOutModuleCarLoan() {
		System.out.println("REST API automation sign out functionality for Car loan applicant");
	}
	
	@BeforeMethod
	public void beforeMethodTest() {
		System.out.println("-----------------------------BeforeMethod defined in Day3 class-----------------------------------");
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object[][] data = new Object[3][2];
		
		//set 1
		data[0][0]="usernameONE";
		data[0][1]="passwordONE";
		
		//set2
		data[1][0] = "usernameTWO";
		data[1][1] = "passwordTWO";
		
		//set3
		data[2][0] = "usernameTHREE";
		data[2][1] = "passwordTHREE";
				
		
		return data;
	}
	
	@Test
	public void failMethod() {
		Assert.assertTrue(false);
	}
}
