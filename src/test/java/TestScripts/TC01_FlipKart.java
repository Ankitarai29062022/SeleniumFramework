package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageObjects.LoginCredentials;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01_FlipKart extends BaseTest {
    WebDriver driver=null;
    
    @Test
    public void login() throws Exception {
        driver.get("https://www.flipkart.com");
        maximize(driver);
        LoginCredentials.logincred(driver, "", "");
        
    }
    
    @BeforeClass
    public void beforeClass() {
        if(driver==null) {
            // Ensure chromedriver binary is available for this Chrome version
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
    }
    
    @AfterClass
    public void afterClass() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
        
    }
    
}