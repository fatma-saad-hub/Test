package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStep {

    WebDriver driver;
    @Given("user dans la page connexion")
    public void user_dans_la_page_connexion() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        String urlactuel = driver.getCurrentUrl();
        if(urlactuel.equals(driver.getCurrentUrl())){
            System.out.println("passed");
        }}
    @When("user saisie un username valide")
    public void userSaisieUnUsernameValide() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }
    @And("user saisie un password valide")
    public void userSaisieUnPasswordValide() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }
    @And("user clique sur le bouton Login")
    public void userCliqueSurLeBoutonLogin() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("user rediriger vers son compte")
    public void userRedirigerVersSonCompte() {
       if(driver.getPageSource().contains("Swag Labs")){
           System.out.println("pass");
       }

    }


}
