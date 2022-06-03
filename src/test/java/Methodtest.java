import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Methodtest
{
    WebDriver driver = null;
    @BeforeMethod
    public void initialization()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void IsSelectedtest() throws InterruptedException {

        driver.get("https://semantic-ui.com/modules/checkbox.html");
        WebElement Onceaday = driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[2]/div[4]/div[1]/div[4]/div[1]/div[1]/div[3]/div[1]/label[1]"));
        Onceaday.click();
        Thread.sleep(2000);
        System.out.println("IsSelected: " + Onceaday.isSelected());
    }
    @AfterMethod
    public void closeDriver()
    {
        try
        {
            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
        e.printStackTrace();
        }
    }

}
