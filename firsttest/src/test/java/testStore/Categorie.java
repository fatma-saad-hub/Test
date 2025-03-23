package testStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Categorie {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://automationteststore.com");
        Thread.sleep(3000);
        WebElement categorie = driver.findElement(By.xpath("//*[@id=\"categorymenu\"]/nav/ul/li[3]/a"));
//        Select makeup = new Select(categorie);
//        makeup.selectByVisibleText("Cheeks");
        WebElement makeup = driver.findElement(By.xpath("//*[@id=\"categorymenu\"]/nav/ul/li[3]/div/ul[1]/li[1]"));
        makeup.click();

//        WebElement makeup = driver.findElement(By.xpath("//*[@id=\"categorymenu\"]/nav/ul/li[3]/div/ul[1]/li[2]"));
//        makeup.click();
//        Select sel =new Select(cate);
//        sel.selectByIndex(1);
    }
}
