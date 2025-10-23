package TestNGAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotationbeforetestaftertest {
	
	@BeforeTest
	void login() {
		System.out.println("Before Test Method executed");
	}
	@AfterTest
	void logout() {
		System.out.println("After Test method executed");
	}
	
	
	@Test
	void advserach() {
		System.out.println("advanced search");
	}

}
