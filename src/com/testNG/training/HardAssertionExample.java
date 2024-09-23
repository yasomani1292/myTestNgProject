package com.testNG.training;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class HardAssertionExample {
	
	@Test
	public void test1()
	{
		System.out.println("Test one ");
		Assert.assertEquals("Facebook", "Facebook");
	}
	
	@Test
	public void test2()
	{
		
		Assert.assertEquals(404, 200);
		System.out.println("Test Two ");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test Three ");
		Assert.assertTrue(true);
		
	}
	
	@Test
	public void test4()
	{
		System.out.println("Test Four ");
		Assert.assertTrue(false, "Delibrate to fail");
	}
	
	@Test
	public void test5()
	{
		System.out.println("Test Five ");
	}

	@Test
	public void test6()
	{
		System.out.println("Test Six ");
	}


}
