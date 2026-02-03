package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC03_StaleElementException {
	WebDriver  driver;
	@BeforeMethod
	public void Launching() {
	driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	
	@Test(retryAnalyzer = retryclass.class)
	public void staleEl() {
		List<WebElement> elements = driver.findElements(By.xpath("//button[text()='Continue shopping']"));
		if (!elements.isEmpty()) {
		    elements.get(0).click();
		} else {
		    System.out.println("Element not found in this browser");
		}


		WebElement el=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		el.sendKeys("shoes");
		el.sendKeys(Keys.ENTER);
		Assert.fail();
		driver.navigate().back();
		try {
			el.sendKeys("shoes");
		}
		catch(StaleElementReferenceException e) {
		    el=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
			el.sendKeys("shoes");
			
		}
		el.sendKeys(Keys.ENTER);
		
		
	}

}
