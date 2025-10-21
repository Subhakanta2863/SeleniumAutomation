package TestNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class annotationbeforeclassafterclass {
	/*1-login
	2-serach
	3-advsearch
	4-logout */
	
	@BeforeClass
	void login() {
		System.out.println("user in login page");
	}
	@AfterClass
	void logout() {
		System.out.println("logout from page");
	}
	
	@Test(priority=1)
	void search() {
		System.out.println("serach for something");
	}

	
	
	@Test(priority=2)
	void advserach() {
		System.out.println("advanced search");
	}
}
