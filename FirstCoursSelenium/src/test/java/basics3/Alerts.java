package basics3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        // recherche de l'element et  click button
        driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/button")).click();
        Thread.sleep(2000);
        // cliquer sur ok de l'alerte
        driver.switchTo().alert().accept();
    }
}
