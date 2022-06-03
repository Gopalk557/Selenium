package ActionClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop
{
 @Test
 public void DragandDropTest()
     {
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-dragdrop/index.html");
     String xp1 = "//h1[.='Block 1']";
     WebElement block1 = driver.findElement(By.xpath(xp1));
     String xp2 = "//h1[.='Block 3']";
     WebElement block3 = driver.findElement(By.xpath(xp2));
     Actions actions = new Actions(driver);
     actions.dragAndDrop(block1, block3).perform();

     }
}
