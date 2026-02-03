package testngScript;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC11_Dropdown {
	
	@Test
	public void Playwithdropdown() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement el=driver.findElement(By.id("country"));
		
		Select select=new Select(el);
	    select.selectByVisibleText("Aruba");
	    List <WebElement> el3=select.getOptions();
	    for(int i=0;i<el3.size();i++) { {
	    
	    System.out.println(el3.get(i).getText());
	    }
	
//	List<WebElement> el1=el.findElements(By.tagName("option"));
//	System.out.println(el1.size());
//	for(int i=0;i<el1.size();i++) {
//	
//		System.out.println(el1.get(i).getText());
//	}
//		
//		System.out.println(select.getOptions());
//
//	}
//	

}}}
