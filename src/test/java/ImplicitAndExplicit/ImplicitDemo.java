package ImplicitAndExplicit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitDemo
{
    @Test
            public void Implicit() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("gopaljithakur@gmail.com");

        driver.findElement(By.id("email")).clear();
        Thread.sleep(2000);
        driver.findElement(By.name("pass")).sendKeys("GOPALK557@143");
    }
}
