package TestScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.LoginCredentials;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Dropdown {
	
	public class TC02_Amazon extends BaseTest {
		WebDriver driver=null;
		
		@Test
		public void login() throws InterruptedException {
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class='nav-search-scope nav-sprite']")).click();
			
			WebElement el2 = driver.findElement(By.id("searchDropdownBox"));
//			Actions act=new Actions(driver);
//			act.moveToElement(el2).build().perform();
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			WebElement el2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchDropdownBox")));

			Select sel = new Select(el2);
			
			List<WebElement> el=sel.getOptions();
			System.out.println(el.size());
			for(int i=0;i<el.size();i++) {
				System.out.println(el.get(i).getText());
				String em=el.get(i).getText();
				if(em.contains("Bea")) {
					sel.selectByIndex(i);
					break;
					
				}
			}
		
		}
		
		@BeforeClass
		public void beforeClass() {
			if(driver==null) {
				driver=new ChromeDriver();
			}
		}
		
		@AfterClass
		public void afterClass() {
			//driver.close();
			
		}
		
	}



}