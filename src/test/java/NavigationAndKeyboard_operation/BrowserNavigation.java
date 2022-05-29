package NavigationAndKeyboard_operation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserNavigation
{
    @Test
    public void BrowserNavigationtest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.sleep(3000);
        driver.navigate().to("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.1.1");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();
        driver.close();
    }
}
