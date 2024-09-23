package dataprovider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterExample {
	
	@Test(dataProvider="DoubleSet")
	public void TestAddition(int actual, int expected)
	{
		int actualValue = actual+20;
		Assert.assertEquals(actualValue, expected);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		return new Object[][]{ {160, 180}, {200 , 220}, {300, 310}, {450, 470}, {560, 580}};	
	}
	
	@DataProvider(name="DoubleSet")
	public Object[][] getData2()
	{
		return new Object[][]{ {10, 30}, {20 , 40}};	
	}
	

	
}
