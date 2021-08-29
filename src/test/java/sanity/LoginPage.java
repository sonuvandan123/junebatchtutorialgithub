package sanity;

import org.testng.annotations.Test;

public class LoginPage
{
	
	@Test(groups={"Smoke"})
	void m1()
	{
		System.out.println("Test Case One");
	}
	@Test(groups={"sanity"})
	void m2()
	{
		System.out.println("Test Case two");
	}
	@Test(groups={"sanity"})
	void m3()
	{
		System.out.println("Test Case Three");
	}
	@Test(groups={"Smoke"})
	void m4()
	{
		System.out.println("Test Case four");
	}
	
}
