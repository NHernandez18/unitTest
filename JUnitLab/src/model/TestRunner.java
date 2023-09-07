package model;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runners.AllTests;

/**
 * Nicholas Hernandez - NHernandez6
 * CIS175 - Fall 2023
 * Sep 6, 2023
 */
public class TestRunner {
	
	public static void main(String[] args) {
		 Result result = JUnitCore.runClasses(AllTests.class);
		 
		 for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		 }
		 
		 System.out.println(result.wasSuccessful());
	}
}