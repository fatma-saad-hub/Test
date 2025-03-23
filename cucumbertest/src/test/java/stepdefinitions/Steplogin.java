package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Objects;

public class Steplogin {

    WebDriver driver;

    @Given("je suis dans le site Automation Test Store")
    public void jeSuisDansLeSiteAutomationTestStore() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationteststore.com/");
        Thread.sleep(1000);

    }

    @When("je clique sur le bouton login or registre")
    public void jeCliqueSurLeBoutonLoginOrRegistre() throws InterruptedException {
        WebElement loginsc= driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/a"));
        loginsc.click();
        Thread.sleep(1000);


    }

    @And("je saisie un username")
    public void jeSaisieUnUsername() {
        WebElement login = driver.findElement(By.name("loginname"));
        login.sendKeys("john12354");
    }

    @And("je saisie un password")
    public void jeSaisieUnPassword() {
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret");
        
    }

    @And("je clique sur le bouton Login")
    public void jeCliqueSurLeBoutonLogin() {
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"loginFrm\"]/fieldset/button"));
        submitButton.click();
        
    }

    @Then("redirection vers le dashboard")
    public void redirectionVersLeDashboard() {
        String ExpenctedUrl="https://automationteststore.com/index.php?rt=account/account";
        String CurrentUrl = driver.getCurrentUrl();
        if (Objects.equals(CurrentUrl,ExpenctedUrl)) {
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Login Failed");
        }    }

//    @And("je clique sur logout")
//    public void jeCliqueSurLogout() {
//
//
//    }
//
//    @Then("redirection vres l'acceuil")
//    public void redirectionVresLAcceuil() {
//    }
}
