package ImplicitAndExplicit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import static java.util.concurrent.TimeUnit.SECONDS;

public class FluentWait
{
    @Test
    public void FluentWait() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        //Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
           //     .withTimeout(Duration.ofSeconds(30))
               // .pollingEvery(Duration.ofSeconds(5))
              //  .ignoring(NoSuchElementException.class);
        driver.findElement(By.id("email")).sendKeys("gopaljithakur@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).clear();
        Thread.sleep(2000);
        driver.findElement(By.name("pass")).sendKeys("GOPALK557@143");
    }
}
