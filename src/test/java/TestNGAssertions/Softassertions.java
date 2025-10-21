package TestNGAssertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassertions {
	@Test
	void test() {
		SoftAssert sa=new SoftAssert();//create object for soft assert class
		
    	String s1="100";
    	String s2="100";
    	System.out.println("The test got passed");
		//sa.assertEquals(s1,s2);//true
    	//sa.assertNotEquals(s1, s2);//false
    	//sa.assertSame(s1, s2);//True
    	//sa.assertNotSame(s1, s2);//false
    	//sa.assertTrue(true);//true
    	//sa.assertTrue(false);//false
    	//sa.assertFalse(false);//True
    	sa.assertFalse(true);//false
    	System.out.println("Run test after hard assert");
    	sa.assertAll();//use after all softassert method
    }
}
