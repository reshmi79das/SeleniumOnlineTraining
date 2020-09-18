package webDriverConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithRadiosAndCheckBoxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//label[contains(text(),'Round Trip')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Multicity')]")).click();
	if (driver.findElement(By.id("MultiCityModelAlert")).isDisplayed()==true) {
		driver.findElement(By.id("MultiCityModelAlert")).click();

	}
		
		
			driver.findElement(By.xpath("//label[contains(text(),' Student')]")).click();
	
		
		
	}

}
