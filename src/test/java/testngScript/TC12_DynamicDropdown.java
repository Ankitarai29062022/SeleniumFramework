package testngScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class TC12_DynamicDropdown {
	
	
	   @Test
	   public void dyna() {
	        // Set the path to the ChromeDriver executable
	        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        try {
	            // Replace with the actual URL of the website you are testing
	            driver.get("https://shariqsp.com/autosuggestion.html");

	            String partialText = "laptop"; // The text to enter in the input field
	            String selectionText = "laptop 4"; // The exact text of the option to select

	            // 1. Locate the input field and enter the partial text
	            WebElement inputField = driver.findElement(By.id("laptopInput"));
	            inputField.sendKeys(partialText);

	            // 2. Wait for the auto-suggestions to appear
	            // This is crucial as the suggestions are dynamically loaded
	            By suggestionsLocator = By.cssSelector("#laptopDropdown li");
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            wait.until(ExpectedConditions.visibilityOfElementLocated(suggestionsLocator));

	            // 3. Capture the list of suggestions
	            List<WebElement> suggestions = driver.findElements(suggestionsLocator);

	            // 4. Iterate through the suggestions and select the desired one
	            for (WebElement suggestion : suggestions) {
	                if (suggestion.getText().equalsIgnoreCase(selectionText)) {
	                    suggestion.click();
	                    System.out.println("Selected: " + selectionText);
	                    break;
	                }
	            }

	            // Optional: Verify the selection
	            // You may need to inspect the final selected value depending on the website's implementation
	            // WebElement selectedValueElement = driver.findElement(By.id("outputField"));
	            // System.out.println("Input field value after selection: " + selectedValueElement.getText());

	        } catch (Exception e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        } finally {
	            // Close the browser
	            // driver.quit();
	        }
	    }
	


}
