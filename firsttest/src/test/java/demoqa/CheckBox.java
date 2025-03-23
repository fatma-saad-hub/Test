package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/checkbox");
        Thread.sleep(2000);
        WebElement box = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[3]"));
        box.click();
        Thread.sleep(2000);
        WebElement fleche = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button/svg/path"));
        fleche.click();
        Thread.sleep(2000);
        WebElement onecheck = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label"));
        onecheck.click();
    }
}
