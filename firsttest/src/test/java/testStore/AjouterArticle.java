package testStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AjouterArticle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://automationteststore.com/index.php?rt=checkout/cart ");
        Thread.sleep(3000);
//        WebElement inscrip = driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/a"));
//        inscrip.click();
//        Thread.sleep(3000);
        // connexion avec log et pass
//        WebElement login = driver.findElement(By.name("loginname"));
//        login.sendKeys("john12354");
//        Thread.sleep(3000);
//        WebElement password = driver.findElement(By.name("password"));
//        password.sendKeys("secret");
//        Thread.sleep(3000);
//        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"loginFrm\"]/fieldset/button"));
//        submitButton.click();
//        Thread.sleep(5000);
        // ajouter une produit dans le panier
//        WebElement cart = driver.findElement(By.xpath("//*[@id=\"main_menu_top\"]/li[3]/a/span"));
//        cart.click();
        Thread.sleep(3000);
        WebElement cont = driver.findElement(By.xpath("//*[@id=\"maincontainer\"]/div/div/div/div/div/div/a"));
        cont.click();
        Thread.sleep(3000);
//        ajouter article
        WebElement add = driver.findElement(By.xpath("//*[@id=\"block_frame_featured_1769\"]/div/div[1]/div[2]/div[3]/a"));
        add.click();
        Thread.sleep(3000);
        WebElement add1 = driver.findElement(By.xpath("//*[@id=\"block_frame_featured_1769\"]/div/div[3]/div[2]/div[3]/a/i"));
        add1.click();
        WebElement add2 = driver.findElement(By.xpath("//*[@id=\"block_frame_latest_1770\"]/div/div[2]/div[2]/div[3]/a"));
        add2.click();
        Thread.sleep(3000);
        // naviguer vers la cart
        Thread.sleep(3000);
        WebElement cart2 = driver.findElement(By.xpath("//*[@id=\"main_menu_top\"]/li[3]/a/span"));
        cart2.click();
        Thread.sleep(3000);
        WebElement qte = driver.findElement(By.id("cart_quantity50"));
        qte.click();
        qte.clear();
        qte.sendKeys("5");
        Thread.sleep(3000);
        WebElement qte1 = driver.findElement(By.id("cart_quantity52"));
        qte1.click();
        qte1.clear();
        qte1.sendKeys("6");
        Thread.sleep(3000);
        WebElement qte2 = driver.findElement(By.id("cart_quantity65"));
        qte2.click();
        qte2.clear();
        qte2.sendKeys("3");
        Thread.sleep(5000);
        //update le changement de qte
        WebElement update = driver.findElement(By.id("cart_update"));
        update.click();
        Thread.sleep(6000);
        // remove product
        WebElement remove = driver.findElement(By.xpath("//*[@id=\"cart\"]/div/div[1]/table/tbody/tr[3]/td[7]/a/i"));
        remove.click();
        //checkout
//        Thread.sleep(3000);
//        WebElement check = driver.findElement(By.xpath("//*[@id=\"cart_checkout1\"]"));
//        check.click();
        // deconnexion
//        WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[10]/a"));
//        logoutButton.click();



        }
    }