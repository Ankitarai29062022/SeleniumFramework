package testngScript;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC08_02_BrokenLink {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
        Set <String>s=new HashSet<String>();

		// Navigate to BStackDemo Website
		driver.get("https://bstackdemo.com/");
		driver.manage().window().maximize();

        List<WebElement> el=driver.findElements(By.tagName("a"));
        
        for(WebElement e:el) {
        	String linkurl=e.getAttribute("href");
        	
        	URL url=new URL(linkurl);
        HttpURLConnection con=(HttpURLConnection)url.openConnection();
        con.setConnectTimeout(5000);
        con.connect();
        
        if(con.getResponseCode()!=200) {
        	s.add(linkurl);
        	//In this case none is broken
        }
     

	}
        System.out.println(s);

	}}