package webDriverConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithAlert {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert alert=driver.switchTo().alert();
		String txtCaptured=alert.getText();
		System.out.println("Text captured from alert is:"+txtCaptured);
		alert.accept();
		//alert.dismiss //if there is 2 button
		//alert.sendKeys("abcd");//if there is any input field
		
		driver.quit();
		
	}

}
