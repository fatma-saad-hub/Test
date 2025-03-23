package Stepdefinitions;

import PageFactory.AjoutProd;
import PageFactory.Cart;
import PageFactory.Login;
import PageFactory.Logout;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import outils.ElementUtiles;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ScenarioAll {
        WebDriver driver = new ChromeDriver();
        AjoutProd ajoutProd = new AjoutProd(driver);
        Login login = new Login(driver);
        Cart cart = new Cart(driver);
        Logout logout = new Logout(driver);
        ElementUtiles elementUtiles = new ElementUtiles(driver);

        @Given("ouvrir le site swag labs")
        public void ouvrir_le_site_swag_labs() {
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

        }


        @And("je saisie login")
        public void jeSaisieLogin() {
            login.setUsername("standard_user");

        }

        @And("je saisis  Password")
        public void jeSaisisPassword() {
            login.setPassword("secret_sauce");

        }

        @And("je click sur login")
        public void jeClickSurLogin() {
            login.clickLoginButton();

        }

        @Then("Redirection vers dash produits")
        public void redirectionVersDashProduits() {
            elementUtiles.confirmation("https://www.saucedemo.com/inventory.html");
//            String ExpectedUrl="https://www.saucedemo.com/inventory.html";
//            String CurrentUrl = driver.getCurrentUrl();
//            if (Objects.equals(CurrentUrl,ExpectedUrl)) {
//                System.out.println("Login Successful");
//            }
//            else {
//                System.out.println("Login Failed");
//            }

        }

    @When("Ajouter produit")
    public void ajouterProduit() throws InterruptedException {
        Thread.sleep(1000);

        ajoutProd.ajouterProduit();
        Thread.sleep(1000);

    }


    @Then("prouit dans la cart")
    public void prouitDansLaCart() throws InterruptedException {
        Thread.sleep(1000);

        ajoutProd.shoppingCart();
        elementUtiles.Exsist("Sauce Labs Backpack");
//        String pageContent=driver.findElement(By.tagName("html")).getText();
//        List<String> motRecherche= new ArrayList<>();
//        motRecherche.add("Sauce Labs Backpack");
//        for(String  mot : motRecherche){
//            if (pageContent.contains(mot)) {
//                System.out.println("le mot " + mot + "  existe sur la page");
//            }
//            else {
//                System.out.println("le mot " + mot + "  n'existe sur la page");
//            }
//        }            Thread.sleep(1000);


    }


    @When("je click sur icone panier")
    public void jeClickSurIconePanier() {
        ajoutProd.shoppingCart();


    }

    @And("je clique sur checkout")
    public void jeCliqueSurCheckout() throws InterruptedException {
            cart.clickCheckout();Thread.sleep(1000);

    }

    @When("je saisie first name")
    public void jeSaisieFirstName() throws InterruptedException {
            cart.setFirstname("fatma");
        Thread.sleep(1000);

    }

    @And("je saisie Lastname")
    public void jeSaisieLastname() throws InterruptedException {
            cart.setLastname("saad");
        Thread.sleep(1000);

    }

    @And("je saisie code postale")
    public void jeSaisieCodePostale() throws InterruptedException {
            cart.setPostalcode("12345");
        Thread.sleep(1000);
    }

    @And("je clique sur continuer")
    public void jeCliqueSurContinuer() throws InterruptedException {
        cart.clickConfirmcheck();
        Thread.sleep(1000);

    }
    @Then("une page overview s'affiche")
    public void unePageOverviewSAffiche() throws InterruptedException {
        Thread.sleep(1000);
        elementUtiles.Exsist("Checkout: Overview");
//        String pageContent=driver.findElement(By.tagName("html")).getText();
//        List<String> motRecherche= new ArrayList<>();
//        motRecherche.add("Checkout: Overview");
//        for(String  mot : motRecherche){
//            if (pageContent.contains(mot)) {
//                System.out.println("le mot " + mot + "  page checkout overview");
//            }
//            else {
//                System.out.println("le mot " + mot + "  la page n'est pas la correspondante");
//            }
//        }

    }
    @When("finish checkout")
    public void finishCheckout() throws InterruptedException {
            cart.clickFinishcheck();
        Thread.sleep(1000);


    }

    @Then("produit confirmé")
    public void produitConfirmé() {
            elementUtiles.Exsist("Thank you for your order!");
//            String pageContent=driver.findElement(By.tagName("html")).getText();
//            List<String> motRecherche= new ArrayList<>();
//            motRecherche.add("Thank you for your order!");
//            for(String  mot : motRecherche){
//                if (pageContent.contains(mot)) {
//                    System.out.println("le mot " + mot + "  existe sur la page");
//
//                }
//                else {
//                    System.out.println("le mot " + mot + "  n'existe sur la page");
//                }
//            }
    }
// supprimer un produit

    @When("je clique sur le button panier")
    public void jeCliqueSurLeButtonPanier() {
        ajoutProd.shoppingCart();
    }

    @And("je clique sur le boutton remove")
    public void jeCliqueSurLeBouttonRemove() {
            cart.clickRemoveprod();

    }

    @Then("le produit supprimé du panier")
    public void leProduitSuppriméDuPanier() {
            elementUtiles.Exsist("Sauce Labs Backpack");
//        String pageContent=driver.findElement(By.tagName("html")).getText();
//        List<String> motRecherche= new ArrayList<>();
//        motRecherche.add("Sauce Labs Backpack");
//        for(String  mot : motRecherche){
//            if (pageContent.contains(mot)) {
//                System.out.println("le mot " + mot + "  existe sur la page");
//
//            }
//            else {
//                System.out.println("le mot " + mot + " est suprimé deja ");
//            }
//        }

    }


    @When(": je clique sur le nav bar")
    public void jeCliqueSurLeNavBar() throws InterruptedException {
            Thread.sleep(1000);
            logout.clickReactBurgerMenu();
            Thread.sleep(1000);
        
    }

    @And("je clique sur logout")
    public void jeCliqueSurLogout() throws InterruptedException {
        Thread.sleep(1000);

        logout.clickLogout();


    }

    @Then("rediriger vers la page login")
    public void redirigerVersLaPageLogin() {
            elementUtiles.confirmation("https://www.saucedemo.com/");

    }
//        String ExpectedUrl="https://www.saucedemo.com/";
//        String CurrentUrl = driver.getCurrentUrl();
//        if (Objects.equals(CurrentUrl,ExpectedUrl)) {
//            System.out.println("Logout Successful");
//        }
//        else {
//            System.out.println("Logout Failed");
//        }    }
}


