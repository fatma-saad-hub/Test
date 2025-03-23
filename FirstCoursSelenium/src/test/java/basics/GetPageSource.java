package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://qatraining.fr/");
            String pageSource = driver.getPageSource();
            System.out.println("the current page source is " +pageSource);

        }
}
