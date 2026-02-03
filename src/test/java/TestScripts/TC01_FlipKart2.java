package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.LoginCredentials;

public class TC01_FlipKart2 extends BaseTest2 {
	WebDriver driver;
	
	@Test
	public void login() throws Exception {
		driver.get("https://www.flipkart.com");
		maximize(driver);
		LoginCredentials.logincred(driver, "", "");
		
	}
	
//	@BeforeClass
//	public void beforeClass() {
//		if(driver==null) {
//			driver=new ChromeDriver();
//			
//
//		}
//	}
//	
//	@AfterClass
//	public void afterClass() {
//		driver.close();
//		
//	}
	
}
