package testngScript;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;





public class TC02_TakingScreenshotScrollable{
	
	public static void main(String args[]) throws IOException, InterruptedException {
	
		WebDriver driver;
	
//	@Test
//	public void test1() throws Throwable {
	
	
		
	
		 driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		

    File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(srcfile, new File("screenshots/im1" + ".png"));
    
    File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    String screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
    
   
    
		WebElement el=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		File src = el.getScreenshotAs(OutputType.FILE);
		
		// Take the full-page screenshot using AShot
//        Screenshot screenshot = new AShot()
//                .shootingStrategy(ShootingStrategies.viewportPasting(1000)) // Scrolls down every 1000ms
//                .takeScreenshot(driver);

        // Save the screenshot to a file
//        File destinationFile = new File("screenshots/fullPageScreenshot" + ".png");
//        ImageIO.write(screenshot.getImage(), "PNG", destinationFile);
		
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
