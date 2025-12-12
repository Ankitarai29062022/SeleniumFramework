package testngScript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sel4_NewWindow {
	WebDriver driver;
	@Test
	public void newWindowOpen() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.flipkart.com");
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.in");
		System.out.println(driver.getTitle());
		
		String curr=driver.getWindowHandle();
		Set<String> s=driver.getWindowHandles();
		for(String m:s)	{
			driver.switchTo().window(m);
			if(driver.getTitle().equals("Online Shopping India Mobile, Cameras, Lifestyle & more Online @ Flipkart.com")) {
				break;
			}
		}
		
		
		
		
		
		


		
		
	}

}
