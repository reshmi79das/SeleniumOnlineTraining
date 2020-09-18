package webDriverConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\eclipse\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//topcasting
		
		driver.get("https://www.google.ca/");
		
		driver.manage().window().maximize();
		
		String appTitle=driver.getTitle();
		System.out.println("Title of the application is : "+appTitle);
		
		if (appTitle.equalsIgnoreCase("google")) {
			System.out.println("Pass");
		} else {
System.out.println("Fail");
		}
		
		String appUrl=driver.getCurrentUrl();
		System.out.println("URL of application is : "+appUrl);
		
		/*if (appUrl.contains("google")) {
			System.out.println("URL is correct");
		} else {
System.out.println("URL is not correct");
		}*/
		
		String updatedText=appUrl.substring(12, 18);
		System.out.println(updatedText);
		
		if (updatedText.equals("google")) {
			System.out.println("pass");
		} else {
System.out.println("fail");
		}
		
		//System.out.println(driver.getPageSource());
		
		driver.close();
		
	}

}
