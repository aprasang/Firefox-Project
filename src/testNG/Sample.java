package testNG;

import org.testng.annotations.Test;

public class Sample {
 /* @Test
  public void f() {
	  System.out.println("hi in f");
  }
  @Test
  public void f1() {
	  System.out.println("hi in f1");
  }
  @Test
  public void f2() {
	  System.out.println("hi in f2");
  }*/
	
	@Test(priority=-1)
	public void f1()
	{
		System.out.println("first");
	}
	@Test(priority=1)
	public void f2()
	{
		System.out.println("second");
	}
	@Test(priority=0)
	public void f3()
	{
		System.out.println("third");
	}
}
