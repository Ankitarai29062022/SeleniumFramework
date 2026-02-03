package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.LoginCredentials;

public class TC02_Amazon extends BaseTest {
	WebDriver driver=null;
	
	@Test
	public void login() throws InterruptedException {
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		LoginCredentials.amazonlogincred(driver, "", "");
	}
	
	@BeforeClass
	public void beforeClass() {
		if(driver==null) {
			driver=new ChromeDriver();
		}
	}
	
	@AfterClass
	public void afterClass() {
		driver.close();
		
	}
	
}
