package ActionClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HidenPopUpTest
{
    WebDriver driver= null;
    @Test
    public void HiddenDivision() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
        driver = new ChromeDriver(option);
        Thread.sleep(3000);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("gopaljithakur@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("gopal12345");
        driver.findElement(By.name("login")).submit();
    }
}
