package org.testing.assertions;

public class Asserts {
	// we create static method 
	public static void assert1(String expected, String actual) {
		//use if condition to compare the expected and actual result 
		if(expected.equals(actual))
		{
			System.out.println("Assertion is getting passed");
		}
		else {
			System.out.println("Assertion is getting failed");
		}
	}

}
