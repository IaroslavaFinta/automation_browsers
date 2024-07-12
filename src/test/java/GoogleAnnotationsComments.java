import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class GoogleAnnotationsComments {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        // Define the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/EvgenyShashkov/Downloads/chromedriver"); // Update this path
        // Initialize the WebDriver
        this.driver = new ChromeDriver();
    }

    @Test
    public void test001() {
        try {
            // Navigate to Google
            String url = "https://www.google.com/";
            driver.get(url);

            // Locate the search input field, enter text, and submit the search
            WebElement searchInput = driver.findElement(By.name("q"));
            searchInput.sendKeys("QA Tester");
            searchInput.submit();

            // Initiate WebDriverWait to replace Thread.sleep
            Thread.sleep(5000);

            // Get the page source to examine its content
            String pageText = driver.getPageSource();
            assertTrue(pageText.contains("Quality assurance"));

            // Output if the test case found the relevant information
            System.out.println("You found information related to QA testers");

        } catch (Exception e) {
            e.printStackTrace();  // Handle any exceptions by printing the stack trace
        }
    }

    @AfterTest
    public void cleanUp() {
        // Quit the WebDriver and clean up resources
        if (driver != null) {
            driver.quit();
        }
    }

}
