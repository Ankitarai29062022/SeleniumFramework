package TestScripts;

import org.openqa.selenium.WebDriver;

public class BaseTest {
    // Suppress noisy low-level logs from Selenium / java.net.http by raising log level
    static {
        try {
            java.util.logging.Logger root = java.util.logging.Logger.getLogger("");
            root.setLevel(java.util.logging.Level.SEVERE);
            // More specific loggers to be safe
            java.util.logging.Logger.getLogger("org.openqa.selenium.remote.http").setLevel(java.util.logging.Level.SEVERE);
            java.util.logging.Logger.getLogger("org.openqa.selenium.remote").setLevel(java.util.logging.Level.SEVERE);
            java.util.logging.Logger.getLogger("java.net.http").setLevel(java.util.logging.Level.SEVERE);
            java.util.logging.Logger.getLogger("jdk.internal.net.http").setLevel(java.util.logging.Level.SEVERE);
        } catch (Exception e) {
            // If anything goes wrong, don't fail tests because of logging changes
        }
    }
    
    public void maximize(WebDriver driver) throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

}