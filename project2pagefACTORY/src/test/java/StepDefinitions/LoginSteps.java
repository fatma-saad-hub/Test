package StepDefinitions;

import PagesFactory.HomePage;
import PagesFactory.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
LoginPage loginPage;
WebDriver driver;
    @Given("user dans la page connexion")
    public void user_dans_la_page_connexion() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationteststore.com/");
        driver.manage().window().fullscreen();
        HomePage homePage = new HomePage(driver);
        homePage.clickRegisterLogin();
        String urlactuel = "https://automationteststore.com/index.php?rt=account/login";
        if(urlactuel.equals(driver.getCurrentUrl())){
            System.out.println("passed");
        }}
    @When("user saisie un username valide")
    public void userSaisieUnUsernameValide() {
        loginPage=new LoginPage(driver);
        loginPage.enterUsername("fatmasaad10");
    }

    @And("user saisie un password valide")
    public void userSaisieUnPasswordValide() {
        loginPage=new LoginPage(driver);
        loginPage.enterPassword("fatmasaad1210");
    }

    @And("user clique sur le bouton Login")
    public void userCliqueSurLeBoutonLogin() {
        loginPage=new LoginPage(driver);

        loginPage.clickLoginButton();
    }

    @Then("user rediriger vers son compte")
    public void userRedirigerVersSonCompte() {
        String actualurl="https://automationteststore.com/index.php?rt=account/login";
        if(actualurl.equals(driver.getCurrentUrl())){
            System.out.println("failed");
        }else {
            System.out.println("passed est l'url actuel est: "+driver.getCurrentUrl());
        }

    }
}