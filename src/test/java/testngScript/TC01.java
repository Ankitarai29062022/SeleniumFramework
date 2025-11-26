package testngScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TC01 {
	public static WebDriver driver=null;
	
	
	@Test
	public void test1() throws Throwable {
		
		//iframe Program
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		//File srcFil=(TakeScreenshotDriver).g
		//driver.quit();
		WebElement el=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(el);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Ankita");
		
		driver.switchTo().defaultContent();
        WebElement el2=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
		driver.switchTo().frame(el2);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Ankita");
		driver.switchTo().defaultContent();
        WebElement el3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
		driver.switchTo().frame(el3);
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]")).click();
		driver.switchTo().defaultContent();
		
	}

}
