package ImplicitAndExplicit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitDemo
{
        @Test
        public void ExplicitWait() throws InterruptedException
{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("gopaljithakur@gmail.com");
        //Thread.sleep(2000);
        //driver.findElement(By.id("email")).clear();
        Thread.sleep(2000);
        driver.findElement(By.name("pass")).sendKeys("GOPALK557@143");
        new WebDriverWait(driver, Duration.ofSeconds(3)).
                until(ExpectedConditions.elementToBeClickable(By.name("login")));
        //driver.findElement(By.name("login")).click();
}
}
