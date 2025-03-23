package Steps;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPOM {
    WebDriver driver;
    LoginPage loginp;
    @Given("utilisateur naviguer vers la page connexion")
    public void utilisateur_naviguer_vers_la_page_connexion() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }
    @When("utilisateurs saisie {string}")
    public void utilisateurSaisieUsername(String username) {
        loginp = new LoginPage(driver);
        loginp.saisieUsername(username);    }
    @And("utilistaeurs saisie {string}")
    public void utilistaeurSaisiePassword(String password) {
        loginp = new LoginPage(driver);
loginp.saisiePassword(password);
    }

    @And("utilisateur clique sur Login")
    public void utilisateurCliqueSurLogin() {
        loginp = new LoginPage(driver);
        loginp.clickLogin();
    }
    @Then("utilistaeur reste dans la page login")
    public void utilistaeurResteDansLaPageLogin() {
        loginp = new LoginPage(driver);
        String epectedurl = driver.getCurrentUrl();
        String urlactive ="https://www.saucedemo.com/";
        if(urlactive.equals(epectedurl))
            System.out.println("pass");

        driver.close();}
}
