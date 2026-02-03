package com.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class launch {
	WebDriver driver;
	@BeforeMethod
	@Parameters("chrome")
	public void launching(String browserName) {
		if(browserName.equals("chrome")) {
			 driver=new ChromeDriver();	
			 
				
		}
		else if(browserName.equals("firefox")) {
			 driver=new FirefoxDriver();
			
		}
		else if(browserName.equals("edge")) {
			 driver=new EdgeDriver();
			
		}

		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	  
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
