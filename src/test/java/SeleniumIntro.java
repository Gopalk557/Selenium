import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumIntro
{
    @Test
    public void introToSelenium() throws InterruptedException {
        System.setProperty(
                "webdriver.chrome.driver",
                "D:\\CFP Automation\\Selenium\\chromedriver.exe");
        // Instantiate a ChromeDriver class.
        WebDriver driver = new ChromeDriver();
        // Maximize the browser
        driver.manage().window().maximize();
        // Launch Website
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("Test@gmail.com");
        Thread.sleep(2000);
        //driver.findElement(By.id("email")).clear();
        //Thread.sleep(2000);
        driver.findElement(By.name("pass")).sendKeys("Test@123");
    }
}
