package testngScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC04_ScreenshotOfElement {
WebDriver driver;
	
	@Test
	public void takeScreenshotElement() throws IOException {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement el=driver.findElement(By.xpath("//span[text()=' to ideate, get more done, and save time']"));
		
		File srcfile=el.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("C:\\Users\\Raian\\Autom\\AutomationScript\\screenshots\\ankita.png"));
		
		
	}
}
