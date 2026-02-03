package testngScript;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC09_AllLinks {
	WebDriver driver;

	@Test
	public void linksPrint() throws IOException {
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		List<WebElement>el=driver.findElements(By.tagName("a"));
	for(int i=0;i<el.size();i++) {
		String ur=el.get(i).getAttribute("href");
		System.out.println(ur);
		URL uri=new URL(ur);
		HttpURLConnection con=(HttpURLConnection)uri.openConnection();
		
		//System.out.println(el);
	}
	System.out.println(el.size());
}
}