package webDriverConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithFrames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
	  /* String dragText= driver.findElement(By.id("draggable")).getText();
		System.out.println(dragText);
	String dropText=driver.findElement(By.id("droppable")).getText();
		System.out.println(dropText);*/
		
		
		WebElement scr=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		//Drag And Drop
		Actions actions=new Actions(driver);
		Thread.sleep(2000);
		//Display resolution   zoom setting
		actions.dragAndDrop( scr, target).build().perform();
		
		driver.switchTo().defaultContent();
		//driver.findElement(By.linkText("Selectable")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Selectable')]")).click();
		
	Select select=new Select(driver.findElement(By.xpath("//a[contains(text(),'Selectable')]")));	
	driver.switchTo().frame(0);

		select.selectByIndex(2);
		//driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee ui-selected']")).click();
		
	}

}
