package ImplicitAndExplicit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitDemo
{
        @Test
        public void ExplicitWait() throws InterruptedException
{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, 20);
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("gopaljithakur@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).clear();
        Thread.sleep(2000);
        driver.findElement(By.name("pass")).sendKeys("GOPALK557@143");
}
}
