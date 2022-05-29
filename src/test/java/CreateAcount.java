import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateAcount
{
    @Test
    public void CreateNewAccount() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "D:\\CFP Automation\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Gopal ji");
        Thread.sleep(2000);
        driver.findElement(By.name("lastname")).sendKeys("Thakur");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email__")).sendKeys("gopalk@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("gopalk@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("Gopal@143");
        Thread.sleep(2000);

        Select date = new Select(driver.findElement(By.id("day")));
        date.selectByVisibleText("20");
        Thread.sleep(2000);

        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByVisibleText("Oct");
        Thread.sleep(2000);

        Select year = new Select(driver.findElement(By.id("year")));
        year.selectByVisibleText("1996");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
        Thread.sleep(2000);
        //driver.findElement(By.name("websubmit")).click();
        //driver.close();
    }
}
