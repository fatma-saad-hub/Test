package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jumia.com.tn/tunis/?srsltid=AfmBOooSI7gnVqzc4Ok1JTDQgF-hfoFXuWwVMB2TQfICC6dw-vsmHFP3");
        //get title
        driver.getTitle();
        //String title = driver.getTitle();
        //System.out.println(" le titre de site est : " + title);
        System.out.println("le titre de site est  :" + driver.getTitle());
    }
}
