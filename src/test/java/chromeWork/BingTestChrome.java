package chromeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingTestChrome {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Iaroslava/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.bing.com/");
        Thread.sleep(3000);

        WebElement searchField = driver.findElement(By.name("q"));
//        WebElement searchField = driver.findElement(By.cssSelector("#APjFqb"));
//        WebElement searchField = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea"));
        searchField.sendKeys("QA");
        searchField.submit();
        Thread.sleep(5000);

        driver.quit();

    }
}

