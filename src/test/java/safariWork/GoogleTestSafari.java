package safariWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class GoogleTestSafari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.safari.driver", "/usr/bin/safaridriver");

        WebDriver driver = new SafariDriver();

        driver.get("https://www.google.com/");
        Thread.sleep(3000);

       WebElement searchField = driver.findElement(By.name("q"));
//        WebElement searchField = driver.findElement(By.cssSelector("#APjFqb"));
//        WebElement searchField = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea"));
        searchField.sendKeys("QA");
        searchField.submit();
        Thread.sleep(3000);
        driver.quit();

    }
}

