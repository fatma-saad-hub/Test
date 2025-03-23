package basics1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");
        // trouver un element avec son id
        // driver.findElement(By.id("userName"));
        // trouver l'element avec le nom du classe(on prend une seul nom du class pour un element 2 nom )
//        String classelemt = driver.findElement(By.className("form-label")).getText();
//        System.out.println("le text de cet element" +classelemt);
        // localiser l'element par le nom
        String nameelemt = driver.findElement(By.name("username")).getText();
        System.out.println("le text de ce nom" +nameelemt);
        // trouver un element avec son nom du balise(souvent non utilisé puisque on peut trouvé plus d'un meme tag dans le code html
        String tagelemt = driver.findElement(By.tagName("h1")).getText();
        System.out.println("le text de ce tag" +tagelemt);

        driver.quit();
    }
}
