package AUTOIT;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class AutoItFileUpload
{
    @Test
    public void autoITFileUpload() throws InterruptedException, IOException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.freepdfconvert.com/pdf-to-word");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'Choose PDF file')]")).click();
        Thread.sleep(3000);

        Runtime runtime = Runtime.getRuntime();
        runtime.exec("D:\\CFP Automation\\FileUpload.exe");

    }
}
