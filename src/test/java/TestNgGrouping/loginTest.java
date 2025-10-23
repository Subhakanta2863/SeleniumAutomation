package TestNGGrouping;

import org.testng.annotations.Test;

public class loginTest {
	@Test(priority=1,groups= {"sanity"})
	void openapp() {
		System.out.println("User is open the application");
	}
	@Test(priority=2,groups= {"sanity"})
	void login() {
		System.out.println("User login to application");
	}
	@Test(priority=3,groups= {"sanity"})
	void logout() {
		System.out.println("User logout from the application");
	}

}
