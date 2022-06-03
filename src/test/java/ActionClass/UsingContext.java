package ActionClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class UsingContext
{
    @Test
            public void ValidatingContext() throws InterruptedException, AWTException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.patelcollege.com/about-pcst");
        Thread.sleep(3000);
        WebElement MPU = driver.findElement(By.xpath("//a[contains(text(),'MPU')]"));

        Actions actions = new Actions(driver);
        actions.contextClick(MPU).perform();
        Thread.sleep(3000);

        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_W);
        r.keyRelease(KeyEvent.VK_W);

        driver.quit();
     }
}
