package TestScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC03_StaleElementExceptionUsingForLoop {
	WebDriver  driver;
	@BeforeMethod
	public void Launching() {
	driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	
	@Test
	public void staleEl() {
		List<WebElement> elements = driver.findElements(By.xpath("//button[text()='Continue shopping']"));
		if (!elements.isEmpty()) {
		    elements.get(0).click();
		} else {
		    System.out.println("Element not found in this browser");
		}
List<WebElement> el=driver.findElements(By.xpath("//li[@class='nav-li']/div/a"));
System.out.println(el.size());
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));





		
		
	}

}
