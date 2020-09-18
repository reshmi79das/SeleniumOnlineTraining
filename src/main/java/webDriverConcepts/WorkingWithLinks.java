package webDriverConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithLinks {

	public static void main(String[] args) {
String expLinks="Privacy Policy";
boolean status=false;

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		
		 driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=sem_lp&ut_source2=sem&ut_source3=megamenu");
         //1.Click on a link
		//driver.findElement(By.linkText("Log in with SSO")).click();
		 //2.capture the link name
		 System.out.println(driver.findElement(By.linkText("Log in with SSO")).getText());

		 //3.count number of link
		List<WebElement> links= driver.findElements(By.tagName("a"));
		int totalLinks=links.size();
		System.out.println("Total no. of links on Survey Monkey login page is :"+totalLinks);
		 
		//4.print all the links names

		for (int i = 0; i <totalLinks; i++) {
			
			String linksName=links.get(i).getText();
			//System.out.println("Links name is:"+linksName);
			
			//to print only if it is not empty
			if (!(linksName.isEmpty())) {
				System.out.println("Links name is:"+linksName);

			}
			
			
			/*if (linksName.equalsIgnoreCase(expLinks)) {
				//System.out.println("pass-Link is available");
				status=true;
				break;//to terminate your execution break ia needed 
			} else {
	//System.out.println("Fail-Link is misssing");
				status=false;
			}
			
		}
		if (status==true) {
			System.out.println("Pass-Link is available");
		} else {
			System.out.println("Fail-Link is not available");
*/
		}
		
		
		
		
		 //5.verify if some links is present
		
		
		
		
		
		
		
	}

}
