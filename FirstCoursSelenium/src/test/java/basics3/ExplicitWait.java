package basics3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();
        driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
        WebElement elmnt2 = driver.findElement(By.name("tab"));
        //créer une instance webdriverwait avec durée de 10sec
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // verifier la visibilite
        wait.until(ExpectedConditions.elementToBeSelected(elmnt2));
        elmnt2.click();
        //verifier que l'element est cliquable
//        wait.until(ExpectedConditions.elementToBeClickable(elmnt2));


//        WebElement elmnt2 = driver.findElement(By.id("visibleAfter"));
//        elmnt2.click();
    }
}
