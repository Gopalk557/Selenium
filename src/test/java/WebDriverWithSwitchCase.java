
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebDriverWithSwitchCase
{
    WebDriver driver;
    @Test
    @Parameters( {"BrowserType"} )
    public void MultipleBrowsers (String browserType) throws InterruptedException {
        if (browserType.equalsIgnoreCase("Chrome"))
        {
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
        }
        else if (browserType.equalsIgnoreCase("Edge"))
        {
            WebDriverManager.edgedriver().setup();
            WebDriver driver=new EdgeDriver();
        }

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("gopaljithakur@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("pass")).sendKeys("GOPALK557@143");
        System.out.println("Title of the page : " + driver.getTitle());
        System.out.println("Current URL of the page : " + driver.getCurrentUrl());
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        System.out.println(browserType + ": " + driver.getTitle());
    }
}
