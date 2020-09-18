package testNGConcept;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyGoogleApplication {

	@Test
	public void launchGoogleApplication() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String appTitle=driver.getTitle();
		
		//if else is called verification method if it fail it will run furthar
		//we will use assertion ,if your test is failed it will not run furthur
		//assertion are of two type hard and soft
		
		/*if (appTitle.equalsIgnoreCase("Google")) {
			System.out.println("Pass-Google application is opened");
		} else {
			System.out.println("Fail-Google application is not opened");

		}*/
		//Hard essertion
		AssertJUnit.assertEquals(appTitle, "Facebook");
		
		System.out.println("Statement after failure");
		
		
		driver.quit();
		
	}
	
	
	
	
	
	
	
}
