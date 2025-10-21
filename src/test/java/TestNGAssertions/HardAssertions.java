package TestNGAssertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
    @Test
	void test() {
    	String s1="100";
    	String s2="100";
    	System.out.println("The test got passed");
		//Assert.assertEquals(s1,s2);//true
    	//Assert.assertNotEquals(s1, s2);//false
    	//Assert.assertSame(s1, s2);//True
    	//Assert.assertNotSame(s1, s2);//false
    	//Assert.assertTrue(true);//true
    	//Assert.assertTrue(false);//false
    	//Assert.assertFalse(false);//True
    	Assert.assertFalse(true);//false
    	System.out.println("Run test after hard assert");//not possible for hard assertions 
		
	
	}
}
