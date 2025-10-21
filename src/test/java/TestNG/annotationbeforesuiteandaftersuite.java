package TestNG;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Test;

public class annotationbeforesuiteandaftersuite {

	
	@BeforeSuite
	void abc() {
		System.out.println("beforesuite executed");
	}
	@AfterSuite
	void xyz() {
		System.out.println("Aftersuite execute");
	}
	
	@Test
	void check() {
		System.out.println("check the result");

	}
}
