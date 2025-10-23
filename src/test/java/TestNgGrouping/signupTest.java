package TestNGGrouping;

import org.testng.annotations.Test;

public class signupTest {
	@Test(priority=1,groups= {"regression"})
	void navigatetoUrl() {
		System.out.println("User navigate to url");
	}
	@Test(priority=2,groups= {"regression"})
	void signup() {
		System.out.println("User signup to application");
	}
	@Test(priority=3,groups= {"regression"})
	void signout() {
		System.out.println("User signout from the application");
	}


}
