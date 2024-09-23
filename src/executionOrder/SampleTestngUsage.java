package executionOrder;

import org.testng.annotations.*;

public class SampleTestngUsage {


	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite from sample");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before test from sample");
	}
	
	
	
}
