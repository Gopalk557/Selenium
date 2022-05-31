package Practice_problems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidatingHomepageByCurrentUrl
{
    @Test
    public void ValidatePageByUrl() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("gopaljithakur@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("gopal12345");
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(3000);
        String expectedUrl = "submit";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Home page is displayed");
        } else{
            System.out.println("Home page is NOT displayed");
        }
    }
}
