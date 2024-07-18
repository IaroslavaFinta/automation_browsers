package safariWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class WikiTestSafari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");

        WebDriver driver = new SafariDriver();

        driver.get("https://www.wikipedia.org/");

        WebElement searchField = driver.findElement(By.name("search"));
//        WebElement searchField = driver.findElement(By.cssSelector("#searchform > div > div > div.cdx-text-input.cdx-text-input--has-start-icon.cdx-text-input--status-default.cdx-search-input__text-input > input"));
//        WebElement searchField = driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div/form/div/div/div[1]/input"));
        searchField.sendKeys("QA");
        searchField.submit();

        driver.quit();
    }
}

