package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest2 {
    // Suppress noisy low-level logs from Selenium / java.net.http by raising log level
   WebDriver driver;
    
    public void maximize(WebDriver driver) throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }
    @BeforeMethod
	public void beforeClass() {
		if(driver==null) {
			driver=new ChromeDriver();
		}
	}
	
	@AfterMethod
	public void afterClass() {
		driver.close();
		
	}

}