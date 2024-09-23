package myTestngPack;

import org.testng.annotations.Test;

public class FacebookLogin {
	@Test
	public void loginWithValidCredentials()
	{
		System.out.println("Hi, I'm logged in");
	}
	
	@Test
	public void loginWithInvalidCredentials() {
		System.out.println("Hi, I'm not able to logged-in");
	}
	
}
