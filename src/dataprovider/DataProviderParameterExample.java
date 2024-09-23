package dataprovider;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProviderParameterExample {

	@Test(dataProvider="scenarioData" , dataProviderClass= DataProviderSource.class)
	public void scenario1(String scenarioData)
	{
		System.out.println("scenario testing : Data("+scenarioData+")");
	}
	@Test(dataProvider="scenarioData" , dataProviderClass= DataProviderSource.class)
	public void scenario2(String scenarioData)
	{
		System.out.println("scenario testing : Data("+scenarioData+")");
	}
	@Test(dataProvider="scenarioData" , dataProviderClass= DataProviderSource.class)
	public void scenario3(String scenarioData)
	{
		System.out.println("scenario testing : Data("+scenarioData+")");
	}
}
