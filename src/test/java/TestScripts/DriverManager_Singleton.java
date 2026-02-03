package TestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager_Singleton {
	
	private DriverManager_Singleton(){
		
	}
	
	private static WebDriver driver;
	
	public static WebDriver getdriver() {
		if (driver==null) {
			driver=new ChromeDriver();
		}
		return driver;
	}
	
	
	

	public static void main(String[] args) {
		DriverManager_Singleton st=new DriverManager_Singleton();
		System.out.println(st.getdriver());
		
		DriverManager_Singleton st2=new DriverManager_Singleton();
		System.out.println(st2.getdriver());

	}

}
