package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class Stepajouterprod {

WebDriver driver;

    @Given("je suis sur le site Automation Test Store")
    public void je_suis_sur_le_site_automation_test_store() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://automationteststore.com/ ");
        Thread.sleep(1000);


    }

    @When("je clique sur le bouton login")
    public void jeCliqueSurLeBoutonLogin() throws InterruptedException {
        WebElement loginsc= driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/a"));
        loginsc.click();
        Thread.sleep(1000);

    }

    @And("je choisie un username")
    public void jeChoisieUnUsername() throws InterruptedException {
        WebElement login = driver.findElement(By.name("loginname"));
        login.sendKeys("john12354");
        Thread.sleep(1000);


    }

    @And("je choisie un password")
    public void jeChoisieUnPassword() throws InterruptedException {
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret");
        Thread.sleep(1000);


    }

    @And("je clique sur login")
    public void jeCliqueSurLogin() throws InterruptedException {
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"loginFrm\"]/fieldset/button"));
        submitButton.click();
        Thread.sleep(1000);


    }

    @And("redirection vers le dash")
    public void redirectionVersLeDash() throws InterruptedException {
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);


    }

    @And("je clique sur le bouton Cart")
    public void jeCliqueSurLeBoutonCart() throws InterruptedException {
        WebElement cart1 = driver.findElement(By.xpath("//*[@id=\"main_menu_top\"]/li[3]/a/span"));
        cart1.click();
        Thread.sleep(1000);

    }

    @And("je clique sur le bouton continue shop")
    public void jeCliqueSurLeBoutonContinueShop() throws InterruptedException {
        WebElement shop = driver.findElement(By.xpath("//*[@id=\"maincontainer\"]/div/div/div/div/div/div/a"));
        shop.click();
        Thread.sleep(1000);

    }

    @And("je choisie et ajouter  un produit")
    public void jeChoisieEtAjouterUnProduit() throws InterruptedException {
        WebElement add = driver.findElement(By.xpath("//*[@id=\"block_frame_featured_1769\"]/div/div[3]/div[2]/div[3]/a/i"));
        Actions action = new Actions(driver);
        Thread.sleep(2000);

        action.scrollToElement(add);
        action.perform();
        add.click();
        Thread.sleep(1000);

        WebElement add1 = driver.findElement(By.xpath("//*[@id=\"block_frame_featured_1769\"]/div/div[1]/div[2]/div[3]/a"));
        Thread.sleep(2000);
        action.scrollToElement(add1);
        action.perform();
        add1.click();
        Thread.sleep(2000);

    }

    @Then("produits ajouter dans la cart")
    public void produitsAjouterDansLaCart() throws InterruptedException {
        WebElement cart = driver.findElement(By.xpath("//*[@id=\"main_menu_top\"]/li[3]/a/span"));
        cart.click();
        Thread.sleep(1000);
        String pageContent=driver.findElement(By.tagName("html")).getText();
        List<String> motRecherche= new ArrayList<>();
        motRecherche.add("Benefit Bella Bamba");
        motRecherche.add("Skinsheen Bronzer Stick");
        for(String  mot : motRecherche){
            if (pageContent.contains(mot)) {
                System.out.println("le mot " + mot + "  existe sur la page");
            }
            else {
                System.out.println("le mot " + mot + "  n'existe sur la page");
            }
        }
    }

    @And("je clique sur le bouton checkout un produit")
    public void jeCliqueSurLeBoutonCheckoutUnProduit() throws InterruptedException {
        WebElement check = driver.findElement(By.id("cart_checkout1"));
        check.click();
        Thread.sleep(1000);



    }

    @And("je clique sur le bouton Confirmer ordre")
    public void jeCliqueSurLeBoutonConfirmerOrdre() throws InterruptedException {
        WebElement confirm = driver.findElement(By.id("checkout_btn"));
        confirm.click();
        Thread.sleep(1000);


    }

    @Then("je suis dans la page confirmation ordre")
    public void jeSuisDansLaPageConfirmationOrdre() {
        String pageContent=driver.findElement(By.tagName("html")).getText();
        List<String> motRecherche= new ArrayList<>();
        motRecherche.add("YOUR ORDER HAS BEEN PROCESSED!");
        for(String  mot : motRecherche){
            if (pageContent.contains(mot)) {
                System.out.println("le mot " + mot + "  existe sur la page");
            }
            else {
                System.out.println("le mot " + mot + "  n'existe pas sur la page");
            }
        }

    }


}
