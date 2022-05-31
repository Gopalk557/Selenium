import com.sun.jna.Structure;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Practice
{
    @Test
    public void FlipkartLogin() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(5000);
        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("+919074701348");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("body.fk-modal-visible:nth-child(2) div._2Sn47c:nth-child(17) div._2hriZF._2rbIyg div._2QfC02 div._2MlkI1 div._3wFoIb.row div._36HLxm.col.col-3-5 div:nth-child(1) form:nth-child(1) div.IiD88i._351hSN:nth-child(2) > input._2IX_2-._3umUoc._3mctLh.VJZDxU")).sendKeys("monu12345");
        Thread.sleep(3000);
        driver.findElement(By.tagName("button")).click();

    }
}
