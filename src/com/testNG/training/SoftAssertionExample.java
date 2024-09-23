package com.testNG.training;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionExample {
	@Test
	public void test1()
	{
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Test case one started");
		softAssert.assertEquals(5,  5,  "First Hard assert got failed");
		System.out.println("hard assert success... ");
		softAssert.assertTrue("Hello".equals("hello"), "Second hard assert failed");
		System.out.println("**** Test case one got executed succefully ****");
		
	}
	
	@Test
	public void test2()
	{
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Test case two started");
		softAssert.assertEquals("Hello",  "Hello",  "First soft assert got failed");
		System.out.println("hard assert success... ");
		softAssert.assertTrue(false, "Second hard assert failed");
		softAssert.assertTrue(false, "Third hard assert failed");
		System.out.println("**** Test case Two got executed succefully ****");
		softAssert.assertAll();
		System.out.println("Test Two ");
	}
	
	@Test
	public void test3()
	{
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Test case Three started");
		softAssert.assertEquals(5, 5,  "First hard assert got failed");
		System.out.println("hard assert success... ");
		softAssert.assertTrue("Hello".equals("Hello"), "Second hard assert failed");
		System.out.println("**** Test case Three got executed succefully ****");
		
	}
	
}
