package webDriverConcepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithScreenShots {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(1000);
		
		//CapturingScreemShot
		
	  // File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   //FileUtils.copyFile(SrcFile, new File("./target/Screens/File1.png"));
		
		//File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(SrcFile,new File("./target/Screens/File2.png"));
		
		
		//Right click on below target folder and go to new and click on folder and give the filder name as File1 than open its properties and copy from target screen and in the dest file give(./and paste the target destiny than give /and give the file name as(File.png)
		/*File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./target/Screens/File2.png"));*/
		
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./target/Screens/File3.png"));
		
	}

}
