package ParallelExecution;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01 extends launch {
@Test
public void SearchShoes()  throws InterruptedException {
	//WebElement ex=driver.findElement(By.xpath("//button[text()='Continue shopping']"));
	List<WebElement> elements = driver.findElements(By.xpath("//button[text()='Continue shopping']"));
	if (!elements.isEmpty()) {
	    elements.get(0).click();
	} else {
	    System.out.println("Element not found in this browser");
	}


	WebElement el=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
	el.sendKeys("shoes");
	el.sendKeys(Keys.ENTER);
	WebElement el2=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)", el2);
	Thread.sleep(5000);
	//js.executeScript("arguments[0].click()", el2);
	WebElement el3=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]/../../following-sibling::a"));
	//driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]/../../following-sibling::a")).click();
	js.executeScript("arguments[0].click()", el3);
	
	//el2.click();
}

@Test
public void Search() {
	System.out.println("search");
}
}
