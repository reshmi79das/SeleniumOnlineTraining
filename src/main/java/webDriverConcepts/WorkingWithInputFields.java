package webDriverConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithInputFields {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		
		 driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=sem_lp&ut_source2=sem&ut_source3=megamenu");
			
		 WebElement uID=driver.findElement(By.id("username"));

		 
			uID.sendKeys("OldValues");
		Thread.sleep(2000);
		uID.clear();
		uID.sendKeys("seleniumtraining1");
		
		//for run time value get text will not work,get attribute wil work
		//String text=driver.findElement(By.id("username")).getText();
		//System.out.println(text);
       String usernameVal=uID.getAttribute("value");
		System.out.println("UserName entered is:" +usernameVal );
       
		                   //is empty will give a boolean value
		System.out.println("Is empty value is:" +usernameVal.isEmpty());
		if (usernameVal.isEmpty()) {
			System.out.println("Value is not entered");
		} else {
System.out.println("Value entered");
		}
		
		
       //to capture design time value(i.e the developer has developed that value during development of the application) the get text will work
       String linkText=driver.findElement(By.linkText("Forgot username or password?")).getText();
		System.out.println(linkText);
		
		
		
		
		
	}

}
