package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import javax.swing.*;

public class Droppable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/droppable");
        WebElement dragg = driver.findElement(By.xpath("//*[@id=\"draggable\"]")); //element to drag
        WebElement dropp = driver.findElement(By.xpath("//*[@id=\"droppable\"]")); // zone to dropp an element
        Actions action = new Actions(driver);
        // drag and drop
        action.dragAndDrop(dragg, dropp).perform();
        Thread.sleep(2000);
        WebElement acc = driver.findElement(By.xpath("//*[@id=\"droppableExample-tab-accept\"]"));
        acc.click();
        Thread.sleep(2000);
        WebElement dragg1 = driver.findElement(By.xpath("//*[@id=\"acceptable\"]"));
        WebElement dropp1 = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        action.dragAndDrop(dragg1, dropp1).build().perform();
    }
}
