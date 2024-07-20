package chromeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class WikipediaTestChrome {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Iaroslava/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.wikipedia.org/");

        WebElement searchField = driver.findElement(By.name("search"));
//        WebElement searchField = driver.findElement(By.cssSelector("#searchform > div > div > div.cdx-text-input.cdx-text-input--has-start-icon.cdx-text-input--status-default.cdx-search-input__text-input > input"));
//        WebElement searchField = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div/form/div/div/div[1]/input"));
        searchField.sendKeys("QA");
        searchField.submit();

        String pageText = driver.getPageSource();
        assertTrue(pageText.contains("Quality assurance"));

        System.out.println("You found information related to QA testers");

        driver.quit();

    }
}

