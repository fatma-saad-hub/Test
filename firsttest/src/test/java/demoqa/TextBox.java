package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        Thread.sleep(2000);
        // find (l'id) full name placeholder
        WebElement full_name = driver.findElement(By.id("userName"));
        full_name.sendKeys("Fatma Saad");
        // find (l'id) email //
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("fatma.saad@gmail.com");
        Thread.sleep(2000);
        // find (l'id) current address//
        WebElement current_adress = driver.findElement(By.id("currentAddress"));
        current_adress.sendKeys("borj cedria 22 av founoun ");
        Thread.sleep(2000);
        // find (l'id) permanent address//
        WebElement permanent_address = driver.findElement(By.id("permanentAddress"));
        permanent_address.sendKeys("soliman 22");
        Thread.sleep(2000);
        // id button
        WebElement button = driver.findElement(By.id("submit"));
        button.click();
    }
}
