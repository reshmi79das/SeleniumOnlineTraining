package webDriverConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWindows {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
		String facebookTitle=driver.getTitle();
		System.out.println("Facebook Title is : "+facebookTitle);
		//clicking on create account button
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		//clicking on cookies policy link
		System.out.println("Clicking on cookies policy link");
		driver.findElement(By.id("cookie-use-link")).click();
		Thread.sleep(5000);
		
		Set<String> winIds=driver.getWindowHandles();
		System.out.println("Total number of windows opened :"+winIds.size());
	Thread.sleep(5000);
	
		Iterator<String> itr=	winIds.iterator();
	String faceBookWindowId=itr.next();
	String cookiesWindowId=itr.next();
	System.out.println(faceBookWindowId+"---------------"+cookiesWindowId);
	driver.switchTo().window(cookiesWindowId);
		System.out.println("cookies policy title is : "+driver.getTitle());
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Test1234");

	driver.switchTo().window(faceBookWindowId);
	System.out.println(driver.getTitle());

//	driver.quit();
	
	}

}
