package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buttons {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");
        Thread.sleep(2000);
        // double click
        Actions act = new Actions(driver);
        WebElement bt_double = driver.findElement(By.id("doubleClickBtn"));
        act.doubleClick(bt_double).perform();
        Thread.sleep(2000);
        // right click
        WebElement bt_right = driver.findElement(By.id("rightClickBtn"));
        act.contextClick(bt_right).perform();
        Thread.sleep(2000);
        //click me
        WebElement me = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/div[3]/button"));
        me.click();
//        Thread.sleep(2000);




    }
}
