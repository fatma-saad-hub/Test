package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Loginout {

WebDriver driver;
    @Given("site Automation Test Store ouvert")
    public void siteAutomationTestStoreOuvert() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationteststore.com/");
        Thread.sleep(1000);

    }


    @When("click sur le bouton log or registre")
    public void clickSurLeBoutonLogOrRegistre() throws InterruptedException {
        WebElement loginsc= driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/a"));
        loginsc.click();
        Thread.sleep(1000);

    }

    @And("je saisi un {string}")
    public void jeSaisiUn(String logname) throws InterruptedException {
        WebElement login = driver.findElement(By.name("loginname"));
        login.sendKeys(logname);
        Thread.sleep(1000);

    }

    @And("je tape un {string}")
    public void jeTapeUn(String pass) throws InterruptedException {
        WebElement password1 = driver.findElement(By.name("password"));
        password1.sendKeys(pass);
        Thread.sleep(1000);


    }

    @And("click le bouton Login")
    public void clickLeBoutonLogin() throws InterruptedException {
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"loginFrm\"]/fieldset/button"));
        submitButton.click();
        Thread.sleep(1000);
    }

    @Then("message erreur afficher")
    public void messageErreurAfficher() {
        String ExpectedUrl="https://automationteststore.com/index.php?rt=account/login";
        String CurrentUrl = driver.getCurrentUrl();
        if (Objects.equals(CurrentUrl,ExpectedUrl)) {
            System.out.println("Login Failed");
        }
        else {
            System.out.println("Login successful");
        }
    }


}
