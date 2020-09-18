package webDriverConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		/*WebDriverManager.iedriver().setup();   //launch ie browser
        WebDriver driver=new InternetExplorerDriver();*/
		/*WebDriverManager.firefoxdriver().setup();   //launch firefox browser
		WebDriver driver=new FirefoxDriver();*/
	
		driver.get("https://www.google.ca/");
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
