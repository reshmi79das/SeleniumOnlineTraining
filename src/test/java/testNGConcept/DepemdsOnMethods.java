package testNGConcept;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DepemdsOnMethods {
	
	@Test(priority=1)
	public void login() {
		System.out.println("Logging into application");
		//Assert.fail();
		Assert.assertTrue(false);
		//Assert.assertEquals("Signin", "Login");
	}
	@Test(priority=2)
	public void bookTickets() {
		System.out.println("Booking Tickets");
		Assert.assertEquals("abcd", "Booking");
	}
	//we can use priority and dependson method together also
	@Test(priority=3,dependsOnMethods= {"login","bookTickets"})
	public void logout() {
		System.out.println("Logout from application");
	}
	

}
