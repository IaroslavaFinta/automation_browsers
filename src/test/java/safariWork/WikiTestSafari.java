package safariWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import static org.junit.Assert.assertTrue;

public class WikiTestSafari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");

        WebDriver driver = new SafariDriver();

        driver.get("https://www.wiki.com/");

        WebElement searchField = driver.findElement(By.name("search"));
//        WebElement searchField = driver.findElement(By.cssSelector("body > form > table > tbody > tr:nth-child(3) > td > div > input[type=text]:nth-child(1)"));
//        WebElement searchField = driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td/div/input[1]"));
        searchField.sendKeys("QA");
        searchField.submit();

        String pageText = driver.getPageSource();
        assertTrue(pageText.contains("Quality assurance"));

        System.out.println("You found information related to QA testers");

        driver.quit();
    }
}

