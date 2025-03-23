package exemple;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Training {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://demoqa.com/buttons");
        Thread.sleep(2000);
        // navigate().to() 3andeha historique tnajem tnavigui men fentre lfenetre
        driver.navigate().to("https://www.google.com/");
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();

//        //gestion des attentes



        
    }
}
