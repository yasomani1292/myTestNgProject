package com.testNG.training;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippingExample {
	@Test
	public void test1()
	{
		System.out.println("Test one ");
	}
	
	@Test(enabled=false)
	public void test2()
	{
		System.out.println("Test Two ");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test Three ");
		throw new SkipException("Skipped this test3");
	}
	
	@Test
	public void test4()
	{
		System.out.println("Test Four ");
	}
}
