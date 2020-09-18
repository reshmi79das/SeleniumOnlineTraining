package webDriverConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithDropdowns {

	public static void main(String[] args) throws InterruptedException {
String expMonth="Oct";
boolean status=false;
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		//selecting values from month dropdown
		driver.findElement(By.id("month")).sendKeys("Jan");
		
		//selecting using select class
		Select select=new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Feb");
		select.selectByValue("10");
		select.selectByIndex(9);
		
	Thread.sleep(5000);
		Select select1=new Select(driver.findElement(By.id("day")));
		select1.selectByIndex(9);
		select1.selectByValue("20");
		select1.selectByVisibleText("7");
		
		Thread.sleep(5000);
		Select select2=new Select(driver.findElement(By.id("year")));
		
		//select2.selectByIndex(2018);
		select2.selectByValue("2000");
		select2.selectByVisibleText("1995");
		
		//counting number of values in a dropdown
		List<WebElement> months=select.getOptions();
	System.out.println(	months.size());
	
	for (int i = 0; i < months.size(); i++) {
	String monthsValues=	months.get(i).getText();
	System.out.println("Value is month dropdown is :" +monthsValues);
	
	if (monthsValues.equalsIgnoreCase(expMonth)) {
		status=true;
		break;
	} else {
status=false;
	}
	
	}
		
	if (status==true) {
		System.out.println("Pass");
		
	} else {
System.out.println("Fail");
	}
		
		
	/*	//Without select how we will get all the values
		List<WebElement> months=driver.findElements(By.xpath("//*[@id=\"month\"]/option"));
		for (int i = 0; i < months.size(); i++) {
		String monthsName=	months.get(i).getText();
		System.out.println(monthsName);
		
		if (monthsName.equals("May")) {
			months.get(i).click();
			break;
		}
		
		
		}*/
		
		
	}

}
