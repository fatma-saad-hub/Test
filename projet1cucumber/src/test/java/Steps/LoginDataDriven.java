package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginDataDriven {
    WebDriver driver;
    @Given("utilisateur dans la page connexion")
    public void utilisateur_dans_la_page_connexion() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }
    @When("utilistaeur saisie {string}")
    public void utilistaeurSaisie(String username) {
        driver.findElement(By.id("user-name")).sendKeys(username);

    }
    @And("utilistaeur saisie un pass {string}")
    public void utilistaeurSaisieUnPass(String password) {
        driver.findElement(By.id("password")).sendKeys(password);

    }
    @And("utilistaeur clique sur le bouton Login")
    public void utilistaeurCliqueSurLeBoutonLogin() {
        driver.findElement(By.id("login-button")).click();

    }
    @Then("utilistaeur rediriger vers son compte")
    public void utilistaeurRedirigerVersSonCompte() {
        if(driver.getPageSource().contains("Swag Labs")){
            System.out.println("pass");
        }
    }
}
