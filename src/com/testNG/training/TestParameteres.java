package com.testNG.training;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameteres {

	@Test
	@Parameters("browser")
	public void testCaseOne(String browser)
	{
		System.out.println("browser passed as :-" + browser);
	}
	
	@Test
	@Parameters({"username" , "password"})
	public void testCaseTwo(String username, String password)
	{
		System.out.println("Parameter for user Name passed as:-" + username);
		System.out.println("Parmeter for password passed as:-" + password);
	}
	
	
}
