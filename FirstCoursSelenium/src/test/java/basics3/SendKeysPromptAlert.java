package basics3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class SendKeysPromptAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
        // recherche de l'element et  click button
        driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[4]/button")).click();
        Thread.sleep(2000);
        // recuperer le texte d'une alerte
        driver.switchTo().alert().sendKeys("fatma");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }
}