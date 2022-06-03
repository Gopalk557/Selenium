package Frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ScrollDown
{
        public static void main(String[] args) throws InterruptedException
        {
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();

            driver.get("http://seleniumhq.org/download");
            driver.manage().window().maximize();

            JavascriptExecutor js = (JavascriptExecutor) driver;
            for (int i = 1; i < 10; i++)
            {
            //scroll down on the webpage
                js.executeScript("window.scrollBy(0, 1000)");
                Thread.sleep(3000);
            }
            //scroll up on the webpage
            /*for (int i = 1; i < 10; i++)
            {
                js.executeScript("window.scrollBy(0, -1000)");
                Thread.sleep(3000);
            }*/
        }
        @Test
        public void ScrollElement()throws InterruptedException
        {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("http://seleniumhq.org/download");
            driver.manage().window().maximize();
            driver.get("http://seleniumhq.org/download");
            driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();
            Thread.sleep(2000);
            // find the Applitools element on the webpage
            WebElement ele = driver.findElement(By.xpath("//img[contains(@src,'applitools')]"));
            // get the X-coordinate and store in a variable
            int x = ele.getLocation().getX();
            // get the Y-coordinate and store in a variable
            int y = ele.getLocation().getY();
            JavascriptExecutor js = (JavascriptExecutor) driver;
//Scroll to Applitools element’s x and y coordinate
            js.executeScript("window.scrollBy(" + x + ", " + y + ")");
            Thread.sleep(3000);
        }
        @Test
        public void Isselected() throws InterruptedException
        {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.facebook.com/");
            Thread.sleep(2000);
            driver.findElement(By.linkText("Create New Account")).click();
            Thread.sleep(8000);
            WebElement Male_checkbox = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
            Male_checkbox.click();
            if (Male_checkbox.isSelected())
            {
                System.out.println("Checkbox is selected");
            }
            else
            {
                System.out.println("Checkbox is NOT selected");
            }
        }
}
