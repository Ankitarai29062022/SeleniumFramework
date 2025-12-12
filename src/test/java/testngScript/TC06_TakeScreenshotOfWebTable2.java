package testngScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC06_TakeScreenshotOfWebTable2 extends Base {
	
	WebDriver driver;
	
	@AfterMethod
	public void quit() {
		System.out.println("quit");
		driver.quit();
	}
	
	 @BeforeMethod
	   	public void start() {
	   		System.out.println("Starting TC06_TakeScreenshotOfWebTable");
	   	
	   	}
	
	@Test
	public void W3School() throws IOException {
		System.out.println("Running TC06_TakeScreenshotOfWebTable");
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.id("customers"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		File srcfile = ((TakesScreenshot) element).getScreenshotAs(OutputType.FILE);
		//File srcfile = ((TakesScreenshot)element).g
		FileUtils.copyFile(srcfile, new File("screenshots/anks.png"));

		
	}

}
