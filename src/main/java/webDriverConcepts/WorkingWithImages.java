package webDriverConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithImages {

	public static void main(String[] args) {

   WebDriverManager.chromedriver().setup();
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.amazon.ca/");
//total number of images on a page
List<WebElement> images=driver.findElements(By.tagName("img"));
System.out.println("Toatal number of images on Amazon application is  : "+images.size());

for (int i = 0; i < images.size(); i++) {
String imgSrcVal=images.get(i).getAttribute("src");
System.out.println(imgSrcVal);

}
		
		
	}

}
