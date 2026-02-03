package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationExample {


	private WebDriver driver;
	@BeforeClass 
	public void setUpBrowser() { 
		System.out.println("@BeforeClass - Initializing WebDriver");
		driver = new ChromeDriver(); }
	@BeforeMethod 
	public void navigateHome() 
	{ System.out.println("@BeforeMethod - Navigating to home");
	driver.get("https://google.com"); }
	@Test public void testLoginSuccess() { 
		System.out.println("Test 1 - Login Success"); }
	@Test public void testLoginFailure() { 
		System.out.println("Test 2 - Login Failure"); } 
	@AfterMethod public void captureScreenshot() { 
		System.out.println("@AfterMethod - Capturing screenshot"); } 
	@AfterClass public void closeBrowser() 
	{ System.out.println("@AfterClass - Closing WebDriver"); 
driver.quit(); }
}
