package com.ust.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

class Junit1 {

	@BeforeClass
	public static void beforeAllTest()
	{
		System.out.println("before all test starts");
	}
	@Before
	public void beforeTest()
	{
		System.out.println("before test ");
	}
	 @AfterClass
	  public static void afterTest()
	  {
		System.out.println("after test");
	 }
	 @After
	 public void  afterAllTest()
	{
		System.out.println("after all");
	}

	
	@Test(timeout=500)
	public void test() {
		//fail("Not yet implemented");
		String str="Java Training";
		assertEquals("Java Training", str);
		
	}
  @Test
  public void test1() {
   int i=5;
   assertNotEquals(5, 5*3);
 }
  
}
