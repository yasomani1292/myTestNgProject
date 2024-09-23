package com.testNG.training;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestcaseGrouping {
	@Test(groups="Regression")
	public void test1()
	{
		System.out.println("Test one ");
	}
	
	@Test(groups="Regression")
	public void test2()
	{
		System.out.println("Test Two ");
	}
	
	@Test(groups="Smoke")
	public void test3()
	{
		System.out.println("Test Three ");
		
	}
	
	@Test(groups = {"Regression", "Sanity"})
	public void test4()
	{
		System.out.println("Test Four ");
	}

}
