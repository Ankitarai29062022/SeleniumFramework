package testngScript;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02_BrokenLINKpRACTICE {

    public static void main(String[] args) throws Throwable {
        WebDriver driver = new ChromeDriver();
        Set<String> brokenLinks = new HashSet<>();

        driver.get("https://bstackdemo.com/");
        List<WebElement> elements = driver.findElements(By.tagName("a"));

        for (WebElement m : elements) {
            String linkurl = m.getAttribute("href");

            if (linkurl == null || linkurl.isEmpty()) {
                continue; // skip invalid links
            }

            URL url = new URL(linkurl);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setConnectTimeout(5000);
            con.connect();

            if (con.getResponseCode() >= 400) {
                System.out.println(linkurl + " is broken. Response code: " + con.getResponseCode());
                brokenLinks.add(linkurl);
            } else {
                System.out.println(linkurl + " is valid. Response code: " + con.getResponseCode());
            }
        }

        driver.quit();

        System.out.println("\nBroken links found:");
        brokenLinks.forEach(System.out::println);
    }
}