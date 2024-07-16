package firefoxWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BingTestFirefox {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "/Users/Iaroslava/Downloads/geckodriver");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.bing.com/");
        Thread.sleep(1000);

        WebElement searchField = driver.findElement(By.name("q"));
//        WebElement searchField = driver.findElement(By.cssSelector("#sb_form_q"));
//        WebElement searchField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/form/div[1]/div/textarea"));
        searchField.sendKeys("QA");
        searchField.submit();
        Thread.sleep(2000);

        driver.quit();

    }
}

