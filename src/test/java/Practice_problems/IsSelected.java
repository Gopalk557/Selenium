package Practice_problems;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IsSelected
{
    @Test
    public void IsSelectedOrNot()
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
        WebElement password = driver.findElement(By.name("pass"));
        password.click();
        if (password.isSelected())
        {
            System.out.println("Checkbox is selected");
        }else
        {
            System.out.println("Checkbox is NOT selected");
        }
    }
}
