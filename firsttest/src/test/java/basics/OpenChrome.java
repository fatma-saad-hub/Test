package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // permet de grandir la fenetre de driver
        driver.get("https://www.google.com");
        Thread.sleep(5000); //pour donner un temps pour quitter le navigateur
        driver.quit();
    }
}
