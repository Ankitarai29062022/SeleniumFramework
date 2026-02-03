package com.qa.testcases;



	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class TC02 extends launch {
	@Test
	public void SearchToys() throws InterruptedException {
		
	
		WebElement el=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		el.sendKeys("clothes");
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
	}



