package ActionClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandleTest
{
    @Test
            public void WindowHandle()
    {
    WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
    driver.get("http://naukri.com");

    String windowHandle = driver.getWindowHandle();
    System.out.println(windowHandle);
    }

    @Test
    public void WindowHandleTest1() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.naukri.com/");
        Thread.sleep(10000);
        WebElement Jobs = driver.findElement(By.xpath("//div[contains(text(),'Jobs')]"));
        Jobs.click();
        Set<String> allWindowHandles = driver.getWindowHandles();

        int count = allWindowHandles.size();
        System.out.println("Number of browser windows opened on the system is : " + count);
        for (String windowHandle : allWindowHandles)
        {
            driver.switchTo().window(windowHandle);
            String title = driver.getTitle();

            System.out.println("Window handle id of page -->" + title + " --> is : " + windowHandle);
//close all the browsers one by one
            //driver.close();
        }
    }
    @Test
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    driver.get("https://www.naukri.com/");
        WebElement Jobs = driver.findElement(By.xpath("//div[contains(text(),'Jobs')]"));
        Jobs.click();

    String parentWindowhandleID = driver.getWindowHandle();
    Set<String> allWindowHandles = driver.getWindowHandles();
    int count = allWindowHandles.size();
    System.out.println("Number of browser windows opened on the system is : "+ count);
    for (String windowHandle : allWindowHandles)
      {
        driver.switchTo().window(windowHandle);
        String title = driver.getTitle();

        if (!windowHandle.equals(parentWindowhandleID))
        {
            driver.close();
            System.out.println("Child Browser window with title -->"+ title +" --> is closed");
        }
      }
    }
}
