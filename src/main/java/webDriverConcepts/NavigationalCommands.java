package webDriverConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Eclipse\\eclipse\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//topcasting
		
		//majority use get
		driver.get("https://www.google.ca/");//google appl   it will wait till the title and page is loaded completely
		//driver.navigate().to("https://www.google.ca/");//it will wait only the title loaded but it will not wait untill the page loaded complstely 
		
		
		
        driver.get("http://www.amazon.ca");		//amazon app
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}

}
