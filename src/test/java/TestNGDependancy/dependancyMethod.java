package TestNGDependancy;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependancyMethod {
	 
    @Test(priority=1)   
	void openapp() {
		System.out.println("App opened");
		Assert.assertTrue(false);
	}
    
    @Test(priority=2,dependsOnMethods= {"openapp"})
    void login() {
    	System.out.println("Login to the application");
    	Assert.assertTrue(true);
    }
    
    @Test(priority=3,dependsOnMethods= {"openapp","login"})
    void Search()
    {
    	System.out.println("Search for any object");
    	Assert.assertTrue(true);
    }
    
    @Test(priority=4,dependsOnMethods= {"Search"})
    void advancedSwrach() {
    	System.out.println("Search for any other item");
    	Assert.assertTrue(true);
    }
    
    @Test(priority=5,dependsOnMethods= {"login"})
    void logout() {
    	System.out.println("logout from the application");
    	Assert.assertTrue(true);
    }
}
