package Practice_problems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UnAndPassX_coAndY_co
{
    @Test
    public void ValidateX_Cordinate() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement unTB = driver.findElement(By.id("email"));
        int username_Xcordinate = unTB.getLocation().getX();
        System.out.println(username_Xcordinate);
        WebElement pwdTB = driver.findElement(By.name("pass"));
        int password_Xcordinate = pwdTB.getLocation().getX();
        System.out.println(password_Xcordinate);
        if (username_Xcordinate==password_Xcordinate)
        {
            System.out.println("Allignmet in same line");
        }
        else
        {
            System.out.println("Allignmet not in same line");
        }
    }
    @Test
    public void ValidateY_Cordinate() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        WebElement unTB = driver.findElement(By.id("email"));
        int username_Ycordinate = unTB.getLocation().getY();
        System.out.println(username_Ycordinate);
        WebElement pwdTB = driver.findElement(By.name("pass"));
        int password_Ycordinate = pwdTB.getLocation().getY();
        System.out.println(password_Ycordinate);
        if (username_Ycordinate==password_Ycordinate)
        {
            System.out.println("Allignmet in the same line");
        }
        else
        {
            System.out.println("Allignmet not in same line");
        }
    }
}
