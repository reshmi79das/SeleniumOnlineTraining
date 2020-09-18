package testNGConcept;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionsConcept {
	
	//if anything fail it will not continue,it will stop your execution
	
/*
	@Test
	public void hardAssertion() {
		Assert.assertEquals("Reshmi", "Reshmi");
		Assert.assertEquals(100, 50);
		Assert.assertEquals(true, false);
		Assert.assertTrue(true);
		
		}*/
	//if anything fail it will still continue but finally it will show as a failures
	@Test
	public void softAssertion() {
		SoftAssert sa= new SoftAssert();
		sa.assertEquals("Reshmi", "Reshmi");
		sa.assertEquals(100, 50);
		sa.assertEquals(true, false);
		sa.assertTrue(true);
		sa.assertAll();
		
		
	}
	
	
	
}
