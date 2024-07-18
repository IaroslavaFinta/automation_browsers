package chromeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooTestChrome {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/Iaroslava/Downloads/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.yahoo.com/");

//        WebElement searchField = driver.findElement(By.name("p"));
        WebElement searchField = driver.findElement(By.id("ybar-sbq"));
////        WebElement searchField = driver.findElement(By.cssSelector("#ybar-sbq"));
////        WebElement searchField = driver.findElement
////                (By.xpath("/html/body/header/div/div/div/div/div/div[2]/div/div[1]/div[3]/form/input[1]"));
        searchField.sendKeys("QA");
        searchField.submit();

        driver.quit();
    }
}

