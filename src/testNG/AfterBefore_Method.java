package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AfterBefore_Method {
	
	@BeforeMethod
	public static void f1()
	{
		System.out.println("before method");
	}
	@AfterMethod
	public static void f2()
	{
		System.out.println("after method");
	}
	@Test
	public static void f3()
	{
		System.out.println("test method");
	}
	@Test
	public static void a()
	{
		System.out.println("a method");
	}

}
