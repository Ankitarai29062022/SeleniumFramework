package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginCredentials {
	
	private static final String loginBtn="//span[text()='Login']";
	private static final String amazonloginBtn="//button[text()='Continue shopping']";
	public static void logincred(WebDriver driver,String username,String Password) {
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath(loginBtn)).click();
		
	}
	
	public static void amazonlogincred(WebDriver driver,String username,String Password) {
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath(amazonloginBtn)).click();
		
	}

}
