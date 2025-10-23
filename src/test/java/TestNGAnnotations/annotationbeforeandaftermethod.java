package TestNGAnnotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotationbeforeandaftermethod {
	/*1-login
	2-serach
	3-logout
	4-login
	5-advsearch
	6-logout */
	
	@BeforeMethod
	void login() {
		System.out.println("user in login page");
	}
	
	@Test(priority=1)
	void search() {
		System.out.println("serach for something");
	}

	@AfterMethod
	void logout() {
		System.out.println("logout from page");
	}
	
	@Test(priority=2)
	void advserach() {
		System.out.println("advanced search");
	}
}
