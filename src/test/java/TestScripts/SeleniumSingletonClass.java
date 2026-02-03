package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSingletonClass {
	
	private  SeleniumSingletonClass() {
		
	}
	
	private static WebDriver driver;
	
	public static WebDriver  getdriver() {
		if(driver==null) {
			driver=new ChromeDriver();
		}
		return driver;
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		

	}

}
