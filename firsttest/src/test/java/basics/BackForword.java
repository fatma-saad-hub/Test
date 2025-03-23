package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackForword {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        Thread.sleep(5000);
        driver.get("https://www.jumia.com.tn/tunis/?srsltid=AfmBOooSI7gnVqzc4Ok1JTDQgF-hfoFXuWwVMB2TQfICC6dw-vsmHFP3");
        driver.navigate().back(); // return to google
        Thread.sleep(5000); // temps dans une fenetre de navigation
        driver.navigate().forward(); // return to jumia
        Thread.sleep(5000); // temps dans une fenetre de navigation
        driver.navigate().refresh();
    }
}
