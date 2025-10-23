package TestNGGrouping;

import org.testng.annotations.Test;

public class paymentTest {
	@Test(priority=2,groups= {"sanity","regression","functional"})
	void paymentinrupess() {
		System.out.println("Payment accepted by Indian Ruppess");
	}
	@Test(priority=3,groups= {"sanity","regression","functional"})
	void paymentindollar() {
		System.out.println("Payment accepted in US Dollar");
	}

}
