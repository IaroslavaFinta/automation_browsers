package safariWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import static org.junit.Assert.assertTrue;

public class BingTestSafari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");

        WebDriver driver = new SafariDriver();

        driver.get("https://www.bing.com/");

        WebElement searchField = driver.findElement(By.name("q"));
//        WebElement searchField = driver.findElement(By.cssSelector("#sb_form_q"));
//        WebElement searchField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/form/div[1]/div/textarea"));
        searchField.sendKeys("QA");
        searchField.submit();

        String pageText = driver.getPageSource();
        assertTrue(pageText.contains("Quality assurance"));

        System.out.println("You found information related to QA testers");

        driver.quit();
    }
}

