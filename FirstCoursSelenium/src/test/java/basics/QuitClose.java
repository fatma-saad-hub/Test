package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitClose {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qatraining.fr/");
        driver.close(); //fermeture de windows actif
        driver.quit(); // fermer tous les fenetres et tabs
}}
