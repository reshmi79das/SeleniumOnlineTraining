package testNGConcept;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SurveyMonkeyLogin {
	
	@Test
	public void login() {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=sem_lp&ut_source2=sem&ut_source3=megamenu");
		String actText=driver.findElement(By.xpath("//label[contains(text(),'Enter your username')]")).getText();
	
		AssertJUnit.assertEquals(actText, "Enter your username","'Enter your username' text is not matching");
		
		
		/*	
		if (actText.equalsIgnoreCase("Enter your username")) {
			System.out.println("Survey monkey application is launched");
		} else {
			System.out.println("Some other application is launched");

		}*/
		
		driver.findElement(By.id("username")).sendKeys("seleniumTraining1");
		driver.findElement(By.id("password")).sendKeys("selenium1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	   
		String dashboardText=	driver.findElement(By.linkText("Dashboard")).getText();
     
		AssertJUnit.assertEquals(dashboardText, "Dashboard","Dashboard text is not matching");
		/*if (dashboardText.equalsIgnoreCase("Dashboard")) {
    	System.out.println("Logged in successfully");
   } else {
   System.out.println("Login is not successfully");
  }		*/
		
		
	driver.quit();	
	}

}
