package Practice_problems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IsEnabled
{
    @Test
    public void IsEnabledOrNot() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.engagebay.com/login");
        Thread.sleep(2000);
        driver.findElement(By.name("email")).sendKeys("gopaljithakur@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("GOPALK557@143");
        Thread.sleep(3000);
        WebElement LOGIN_button = driver.findElement(By.xpath("//button[contains(text(),'LogIn')]"));
        LOGIN_button.click();

        if (LOGIN_button.isEnabled())
        {
            System.out.println("Button is enabled");
        }
        else
        {
            System.out.println("Button is not enabled");
        }
    }
}
