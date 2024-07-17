import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleTestEdge {

    public static void main(String[] args) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver", "/Users/Iaroslava/Downloads/chromedriver-mac-arm64/chromedriver");

        EdgeDriver driver = new EdgeDriver();

        driver.get("https://www.google.com/");
        Thread.sleep(1000);

       WebElement searchField = driver.findElement(By.name("q"));
//        WebElement searchField = driver.findElement(By.cssSelector("#APjFqb"));
//        WebElement searchField = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea"));
        searchField.sendKeys("QA");
        searchField.submit();
        Thread.sleep(2000);

        driver.quit();

    }
}

