package testNGConcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
  /* BeforeTest
   BeforeClass
   BeforeMethod
   Test
   AfterMethod
   AfterClass
   AfterTest*/
public class DifferentAnnotations {
	
	@BeforeTest
	public void connectToDB() {
		System.out.println("Before Test-Connecting to DB");
	}
	@AfterTest
	public void disconnectingToDB() {
		System.out.println("After Test-Disconnecting to DB");
	}
	
	@BeforeClass
	public void openBrowser() {
		System.out.println("Before Class-Open Browser");
	}
@AfterClass
	public void CloseBrowser() {
		System.out.println("After class-Close Browser");
	}

@BeforeMethod
public void login() {
	System.out.println("Before Method-Logging to application");
}

@AfterMethod
public void logout() {
	System.out.println("After method-Logout from application");
}
@Test
	public void bookTickets() {
		System.out.println("Booking Tickets");
	}

@Test
public void cancelTickets() {
	System.out.println("Cancelling Tickets");
}
@Test
public void faxingTickets() {
	System.out.println("Faxing Tickets");
}


}
