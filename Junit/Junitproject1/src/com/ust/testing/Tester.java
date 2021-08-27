package com.ust.testing;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



@RunWith(Suite.class)
@SuiteClasses({Junit1.class,Junit2.class})
public class Tester {
public static void main (String args[])
{
	Result r= JUnitCore.runClasses(Tester.class);
	System.out.println(r.wasSuccessful());
}
}