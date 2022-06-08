package ActionClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopUpExample
{
    @Test
    public void AlertPopUpTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
        driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.sendKeys("Gopal Thakur");
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
        System.out.println(alert.getText());
        alert.dismiss();
    }
}
