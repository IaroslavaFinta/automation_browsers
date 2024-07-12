import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class GoogleAnnotations {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/Iaroslava/Downloads/chromedriver-mac-arm64/chromedriver"); // Update this path
        this.driver = new ChromeDriver();
    }

    @Test
    public void test001() {
        try {
            String url = "https://www.google.com/";
            driver.get(url);

            WebElement searchInput = driver.findElement(By.name("q"));
            searchInput.sendKeys("QA Tester");
            searchInput.submit();

            Thread.sleep(5000);

            String pageText = driver.getPageSource();
            assertTrue(pageText.contains("Quality assurance"));

            System.out.println("You found information related to QA testers");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void cleanUp() {
        if (driver != null) {
            driver.quit();
        }
    }
}
