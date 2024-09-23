package dataprovider;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DataProviderAcceptanceExample {
	@Test(dataProvider="TestType" , dataProviderClass= DataProviderSource.class)
	public void acceptanceTest(String data)
	{
		System.out.println("scenario testing : Data("+data+")");
	}
}
