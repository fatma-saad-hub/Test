package stepdefinitions;

import PagesFactory.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Objects;

public class LoginF {
    WebDriver driver = new ChromeDriver();
    LoginPage login = new LoginPage(driver);

    @Given("ouvrir site Automation Test Store")
    public void ouvrir_site_automation_test_store() {

      driver.get("https://automationteststore.com/");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.manage().window().maximize();
    }

    @When("click sur le bouton login or registre")
    public void clickSurLeBoutonLoginOrRegistre() {
        login.ClickLoginPage();
    }

    @And("je saisie loginname")
    public void jeSaisieLoginname() {
        login.SetUsername("john12354");

    }

    @And("je saisie  Password")
    public void jeSaisiePassword() {
        login.SetPassword("secret");

    }

    @And("je clique sur le boutton Login")
    public void jeCliqueSurLeBouttonLogin() {
        login.ClickLogin();

    }

    @Then("redirection vers le dashb")
    public void redirectionVersLeDashb() {
        String ExpenctedUrl="https://automationteststore.com/index.php?rt=account/account";
        String CurrentUrl = driver.getCurrentUrl();
        if (Objects.equals(CurrentUrl,ExpenctedUrl)) {
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Login Failed");
        }    }


}
