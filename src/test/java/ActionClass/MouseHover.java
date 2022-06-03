package ActionClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHover
{
    @Test
        public void MouseHoverTest()
    {
     WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
    driver.get("http://www.actimind.com/");
    //find the menu "About Company"
    String xp = "//header/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]";
    WebElement ABOUT_COMPANY = driver.findElement(By.xpath(xp));
    //mouse hover on "About Company" menu
    Actions actions = new Actions(driver);
    actions.moveToElement(ABOUT_COMPANY).perform();
    //click on submenu "Basic Facts"
    WebElement cloud_Application = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/ul[1]/li[2]/a[1]"));
    cloud_Application.click();
    }
    @Test
        public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
            driver.get("http://www.actimind.com/");
            Actions action = new Actions(driver);

           WebElement AreaOfExpertise = driver.findElement(By.xpath("//a[contains(text(),'AREAS OF EXPERTISE']"));
            action.moveToElement(AreaOfExpertise).perform();

            WebElement cloudApp = driver.findElement(By.linkText("Cloud Applicationss"));
            action.moveToElement(cloudApp).click().perform();
//composite multiple actions can be achieved using the below statement
//action.moveToElement(AreaOfExpertise).moveToElement(cloudApp).click().build().perform();
        }
}
