package Stepdefswaglab;

import FactorySwaglab.AjouterProduit;
import FactorySwaglab.Login;
import PagesFactory.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public class Scenarioglobal {
    WebDriver driver;
    AjouterProduit ajouterProd = new AjouterProduit(driver);
    Login login = new Login(driver);

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
        String ExpenctedUrl="https://www.saucedemo.com/inventory.html";
        String CurrentUrl = driver.getCurrentUrl();
        if (Objects.equals(CurrentUrl,ExpenctedUrl)) {
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Login Failed");
        }

    }

    @And("Ajouter produit")
    public void ajouterProduit() {
    }
}
