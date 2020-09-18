package webDriverConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\eclipse\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//topcasting
		
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=sem_lp&ut_source2=sem&ut_source3=megamenu");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("seleniumtraining1");//id -1st
        //driver.findElement(By.id("password")).sendKeys("selenium1234");
		driver.findElement(By.name("password")).sendKeys("selenium1234");//name-2nd
		//driver.findElement(By.xpath("//button[@type='submit']")).click();//xpath-3rd
		                       //Css selector--4th
		driver.findElement(By.cssSelector("#sign_in_form > fieldset > div > div:nth-child(5) > button")).click();
		
		//System.out.println(driver.findElement(By.id("userAcctTab_MainMenu")).getText());
	String text=driver.findElement(By.id("userAcctTab_MainMenu")).getText();
		System.out.println(text);
		
	/*	if (text.contains("Training1")) {
			System.out.println("Pass");
		} else {
System.out.println("Fail");
		}*/
		
		String value= text.substring(8, 17);
		System.out.println(value);
		
		if (value.equalsIgnoreCase("training1")) {
			System.out.println("Pass");
		} else {
System.out.println("Fail");
		}
		//5th classname
		//driver.findElement(By.linkText("Log in with SSO")).click();//link text--6th
		//driver.findElement(By.partialLinkText("in with")).click();//partial linktext not recom
	}

}
