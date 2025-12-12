package testngScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC05_ScreenshotOfElementMethod2 {
WebDriver driver;
	
	@Test
	public void takeScreenshotElement() throws IOException {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement el=driver.findElement(By.xpath("//span[text()=' to ideate, get more done, and save time']"));
		
		ScreenshtoFElement(el);
		Screensht();
		
	}
	
	public void ScreenshtoFElement(WebElement el) {
		File srcfile = ((TakesScreenshot) el).getScreenshotAs(OutputType.FILE);
	    try {
			FileUtils.copyFile(srcfile, new File("screenshots/im5" + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void Screensht() {
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    try {
			FileUtils.copyFile(srcfile, new File("screenshots/im3" + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}}
