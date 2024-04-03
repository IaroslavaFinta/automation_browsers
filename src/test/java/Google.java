import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class Google {

    public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver", "/Users/EvgenyShashkov/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com");

        WebElement inputField = driver.findElement(By.name("q"));
        inputField.sendKeys("QA");
        inputField.submit();

        WebElement results = driver.findElement(By.id("result-stats"));
        WebDriverWait waitForResults = new WebDriverWait(driver, 15);
        waitForResults.until(ExpectedConditions.visibilityOf(results));

        String pageText = driver.getPageSource();
        assertTrue(pageText.contains("Quality assurance"));

        System.out.println("Test passed. We found QA related information");

        Thread.sleep(3000);

        driver.quit();

    }

}
