package testStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paiement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://automationteststore.com/ ");
        Thread.sleep(3000);
        WebElement inscrip = driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/a"));
        inscrip.click();
        Thread.sleep(3000);
        // connexion avec log et pass
        WebElement login = driver.findElement(By.name("loginname"));
        login.sendKeys("john12354");
        Thread.sleep(3000);
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret");
        Thread.sleep(3000);
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"loginFrm\"]/fieldset/button"));
        submitButton.click();
        Thread.sleep(5000);
        // ajouter une produit dans le panier
        WebElement cart = driver.findElement(By.xpath("//*[@id=\"main_menu_top\"]/li[3]/a/span"));
        cart.click();
        Thread.sleep(3000);
        WebElement cont = driver.findElement(By.xpath("//*[@id=\"cart\"]/div/div[3]/div/a[1]"));
        cont.click();
        Thread.sleep(3000);
        WebElement ajout = driver.findElement(By.xpath("//*[@id=\"block_frame_latest_1770\"]/div/div[3]/div[2]/div[3]/a"));
        ajout.click();
        Thread.sleep(3000);
        WebElement cart1 = driver.findElement(By.xpath("//*[@id=\"main_menu_top\"]/li[3]/a/span"));
        cart1.click();
        Thread.sleep(3000);
        //checkout
        WebElement check = driver.findElement(By.xpath("//*[@id=\"cart_checkout1\"]"));
        check.click();
        Thread.sleep(3000);
        WebElement confirme = driver.findElement(By.xpath("//*[@id=\"checkout_btn\"]"));
        confirme.click();
        Thread.sleep(3000);
        // deconnexion
//        WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[10]/a"));
//        logoutButton.click();



    }
}
