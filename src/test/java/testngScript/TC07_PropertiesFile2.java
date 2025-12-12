package testngScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC07_PropertiesFile2 extends Base {
    WebDriver driver;
    @AfterMethod
	public void quit() {
		System.out.println("quit");
		driver.quit();
	}
    
    @BeforeMethod
   	public void start() {
   		System.out.println("Starting TC07_PropertiesFile");
   	
   	}

    @Test
    public void PrpCall() throws IOException {
    	System.out.println("Running TC07_PropertiesFile");
        driver = new ChromeDriver();

        // Correct way to build the path
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/Config.properties");

        Properties config = new Properties();
        config.load(fis);

        driver.get(config.getProperty("googleurl"));
    }
}
