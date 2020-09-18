package webDriverConcepts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWaits {
	//thread.sleep is hard wait it is unnecessaraly waiting for that much of time you gave
	//implicit and explicit wait are soft wait.(in will wait until the page have been loaded) 
	//implicit wait applies for all the steps
	//explicit wait only that steps where you need more time 

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		//ImplicitWaitForAllTheSteps
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String facebookTitle=driver.getTitle();
		System.out.println("Facebook Title is : "+facebookTitle);
		//clicking on create account button
		driver.findElement(By.linkText("Create New Account")).click();
		
		//clicking on cookies policy link
		System.out.println("Clicking on cookies policy link");
		driver.findElement(By.id("cookie-use-link")).click();
		

		//ExplicitWait  diff in selenium webdriver 3 and 4 is not supporting explicitWait in 4, they will come up with a new explicitwait 
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
		
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Test1234");
		
		
		//driver.quit();

	}

}
