package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("inside main");

	}
	
	@Test
	public void testngmethod(){
		System.out.println("inside testngmethod");
	}
	@Parameters({"URL"})
	@Test
	public void Demo(String s) {
		System.out.println("Hello " +s);
	}
	
	@Test
	public void Demo1() {
		System.out.println("Bye");
	}
}
