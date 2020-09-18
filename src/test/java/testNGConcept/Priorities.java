package testNGConcept;

import org.testng.annotations.Test;

public class Priorities {
	
	@Test(priority=1)
	public void login() {
		System.out.println("Login into application");
	}
	@Test(priority=2)
	public void bookingTickets() {
		System.out.println("Booked Tickets");
	}
	@Test(priority=3)
	public void logout() {
		System.out.println("logging out from application");
	}

}
