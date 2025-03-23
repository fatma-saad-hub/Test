package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrl {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jumia.com.tn/tunis/?srsltid=AfmBOooSI7gnVqzc4Ok1JTDQgF-hfoFXuWwVMB2TQfICC6dw-vsmHFP3");
        driver.getCurrentUrl();
        System.out.println("url: " + driver.getCurrentUrl());
        Thread.sleep(5000);
        driver.quit();
    }
}
