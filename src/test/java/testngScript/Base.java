package testngScript;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Base  {
	
    @AfterTest
	public void quit() {
		System.out.println("AfterTest");
		
	}
    
    @BeforeTest
   	public void start() {
   		System.out.println("B4Test");
   	
   	}

}
