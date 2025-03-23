package StepDefinitions;

import PagesFactory.CartPage;
import PagesFactory.HomePage;
import PagesFactory.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AjouterProduit {
    WebDriver driver = new ChromeDriver();
    LoginPage login = new LoginPage(driver);
    CartPage cartPage = new CartPage(driver);
    HomePage homePage = new HomePage(driver);

    @Given("je suis sur le site Automation Test Store")
    public void je_suis_sur_le_site_automation_test_store() {
        driver.manage().window().maximize();
        driver.get("https://automationteststore.com/");
    }

    @When("je clique sur le bouton login")
    public void jeCliqueSurLeBoutonLogin() {
        login.ClickLoginPage();

    }

    @And("je choisie un username")
    public void jeChoisieUnUsername() {
        login.SetUsername("john12354");

    }

    @And("je choisie un password")
    public void jeChoisieUnPassword() {
        login.SetPassword("secret");

    }

    @And("je clique sur login")
    public void jeCliqueSurLogin() {
        login.ClickLogin();

    }


    @And("redirection vers le dash")
    public void redirectionVersLeDash() {
        String ExpenctedUrl="https://automationteststore.com/index.php?rt=account/account";
        String CurrentUrl = driver.getCurrentUrl();
        if (Objects.equals(CurrentUrl,ExpenctedUrl)) {
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Login Failed");
        }

    }

    @And("je clique sur le bouton Cart")
    public void jeCliqueSurLeBoutonCart() {
        homePage.Cart();


    }

    @And("je clique sur le bouton continue shop")
    public void jeCliqueSurLeBoutonContinueShop() {
        cartPage.clickCartcontinue();

    }

    @And("je choisie et ajouter  un produit")
    public void jeChoisieEtAjouterUnProduit() {
        homePage.Addtocart();

    }

    @Then("produits ajouter dans la cart")
    public void produitsAjouterDansLaCart() {
        homePage.Cart();
        String pageContent=driver.findElement(By.tagName("html")).getText();
        List<String> motRecherche= new ArrayList<>();
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
}
