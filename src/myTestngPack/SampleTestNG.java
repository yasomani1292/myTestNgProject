package myTestngPack;

import org.testng.annotations.*;

public class SampleTestNG {

	@BeforeSuite
	public void beforeSuiteMethod()
	{
		System.out.println("Executing before suite");
	}
	
	@AfterSuite
	public void afterSuiteMethod()
	{
		System.out.println("Executing after suite");
	}
	
	
}
