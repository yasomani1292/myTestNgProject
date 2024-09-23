package com.testNG.training;


import org.testng.annotations.Test;

public class PriorityExample {
	@Test
	public void test1()
	{
		System.out.println("Test one ");
	}
	
	@Test(priority=1)
	public void test2()
	{
		System.out.println("Test Two ");
	}
	
	@Test(priority=2)
	public void test3()
	{
		System.out.println("Test Three ");
	}
	
	@Test(priority=3)
	public void test4()
	{
		System.out.println("Test Four ");
	}

}
