package testngScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base2  {
    // make driver protected so subclasses can use it
    protected WebDriver driver;

    // default no-arg constructor so TestNG can instantiate subclasses
    public Base2() {
        // Intentionally empty
    }
    
    @BeforeTest
    	public void start() {
    		System.out.println("B4Test");
    	   driver = new ChromeDriver();
    	
    	}

    @AfterTest
    	public void quit() {
    		System.out.println("AfterTest");
    		if (driver != null) {
    			driver.quit();
    		}
    	}

}