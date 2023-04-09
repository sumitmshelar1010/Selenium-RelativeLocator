package MainPackage.SeleniumChromeDriver.locators.relativeLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorUse {
    public static void main(String[] args) {
        System.setProperty("webdriver.driver.chrome","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement we = driver.findElement(By.id("pass"));
        System.out.println(we.getText());
     WebElement we1=driver.findElement(RelativeLocator.with(By.tagName("input")).above(we));
       we1.sendKeys("hi");
        driver.close();
    }



         }

