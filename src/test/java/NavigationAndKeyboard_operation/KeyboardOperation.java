package NavigationAndKeyboard_operation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyboardOperation
{
    @Test
    public void KeyboardOperationTest() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        Robot robot = null;
        try
        {
            robot = new Robot();
        }
        catch (AWTException e)
        {
            e.printStackTrace();
        }
        robot.mouseMove(400,600);
        Thread.sleep(6000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        Thread.sleep(100);
        robot.keyPress(KeyEvent.VK_SHIFT);
        Thread.sleep(100);
        robot.keyPress(KeyEvent.VK_I);
        Thread.sleep(100);
        robot.keyRelease(KeyEvent.VK_I);
        Thread.sleep(5000);
        robot.keyPress(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_C);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(3000);
    }
}
