package TestNGAnnotations;

import org.testng.annotations.Test;

public class priorityTestNG{
	
	
	
	@Test(priority=4) // @Test annotation which is used to makes method as test case
	void navigatetologinpage() {
		System.out.println("User put the url");
	}
	
	
	
	@Test(priority=2)
	void login() {
		System.out.println("User is in the login page");
	}
	
	
	
	@Test(priority=1)
	void logout() {
		System.out.println("User logout from the application");
	}
	
}