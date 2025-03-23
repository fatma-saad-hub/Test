package basics3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.tutorialspoint.com/selenium/practice/dynamic-prop.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       WebElement elem= driver.findElement(By.id("colorChange"));
//       Thread.sleep(5000);
       elem.click();
WebElement elmnt2 = driver.findElement(By.id("visibleAfter"));
        elmnt2.click();}}
