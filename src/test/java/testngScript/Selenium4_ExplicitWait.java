package testngScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Selenium4_ExplicitWait {
	
	WebDriver driver;
	
	@Test
	public void explicitApplication() {
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		WebElement el=driver.findElement(By.xpath("//div[text()='Login']"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(el)).click();
		
		
	}

}
