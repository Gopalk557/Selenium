import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateAcount {
    @Test
    public void introToSelenium() throws InterruptedException
    {
        System.setProperty(
                "webdriver.chrome.driver",
                "D:\\CFP Automation\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("Firstname")).sendKeys("Gopal");
        Thread.sleep(2000);
        driver.findElement(By.name("Surname")).sendKeys("Thakur");
        Thread.sleep(2000);
        driver.findElement(By.id("Email")).sendKeys("gopalk5@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("Pass")).sendKeys("Gopal@123");

    }
}
