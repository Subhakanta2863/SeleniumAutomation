package TestNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	@Test
	void testtitle() {
		String act_value="opencart";
		String or_value="opencart";
		
//		if(act_value.equals(or_value)) {
//			System.out.println("The test is passed");
//		}else
//		{
//			System.out.println("test got failed");
//		}
		Assert.assertEquals(act_value, or_value);
	}

}
