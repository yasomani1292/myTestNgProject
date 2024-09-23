package com.testNG.training;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiTestDependency {
	
	
	@Test
	public void start()
	{
		System.out.println("Starting the server");
	}
	
	@Test(dependsOnMethods = "start")
	public void init()
	{
		System.out.println("Initiated the server");
	}
	
	@Test(dependsOnMethods = "init")
	public void process()
	{
		Assert.assertTrue(false);
		System.out.println("Processing the server");	
	}
	
	@Test(dependsOnMethods = {"process", "init"})
	public void stop()
	{
		System.out.println("Stopping the server");
	}


}
