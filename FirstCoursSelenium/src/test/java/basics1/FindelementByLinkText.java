package basics1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementByLinkText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/links");
        // le lien by.linkText est juste pour le tag link<a>
        String text = driver.findElement(By.linkText("Home")).getText();
        System.out.println("le text est :" +text);
}}
