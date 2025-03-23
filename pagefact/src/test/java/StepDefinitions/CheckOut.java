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

public class CheckOut {
    WebDriver driver = new ChromeDriver();
    CartPage cartPage = new CartPage(driver);
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);

    @Given("sur le site Automation Test Store")
    public void sur_le_site_automation_test_store() {
        driver.manage().window().maximize();
        driver.get("https://automationteststore.com/");
    }


    @When("cliquer sur le bouton login")
    public void cliquerSurLeBoutonLogin() {
        loginPage.ClickLoginPage();


    }

//    @And("je tape un username")
//    public void jeTapeUnUsername() {
//
//    }
//
//    @And("je tape un password")
//    public void jeTapeUnPassword() {
//
//    }

    @And("connexion")
    public void connexion() {
        loginPage.SetUsername("john12354");
        loginPage.SetPassword("secret");
        loginPage.ClickLogin();

    }

    @And("le dash page")
    public void leDashPage() {
        String ExpenctedUrl="https://automationteststore.com/index.php?rt=account/account";
        String CurrentUrl = driver.getCurrentUrl();
        if (Objects.equals(CurrentUrl,ExpenctedUrl)) {
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Login Failed");
        }

    }

    @And("ajouter produit")
    public void ajouterProduit() {
        homePage.Cart();
        cartPage.clickCartcontinue();
        homePage.Addtocart();

    }

    @Then("produits dans la cart")
    public void produitsDansLaCart() {
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

    @And("je clique sur le bouton checkout un produit")
    public void jeCliqueSurLeBoutonCheckoutUnProduit() throws InterruptedException {
        cartPage.clickCheckout();
        Thread.sleep(1000);

    }

    @And("je clique sur le bouton Confirmer ordre")
    public void jeCliqueSurLeBoutonConfirmerOrdre() throws InterruptedException {
        cartPage.clickConfirmOrder();
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
                System.out.println("le mot " + mot + "  n'existe sur la page");
            }
        }

    }
}
