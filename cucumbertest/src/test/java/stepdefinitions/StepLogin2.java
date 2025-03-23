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

public class StepLogin2 {
    WebDriver driver;

    @Given("je suis navigué le site Automation Test Store")
    public void je_suis_navigué_le_site_automation_test_store() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationteststore.com/");
        Thread.sleep(1000);


    }

    @When("je clique sur le bouton log or registre")
    public void jeCliqueSurLeBoutonLogOrRegistre() throws InterruptedException {
        WebElement loginsc= driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/a"));
        loginsc.click();
        Thread.sleep(1000);
    }

    @And("je saisie username {string}")
    public void jeSaisieUsername(String username) throws InterruptedException {
        WebElement login = driver.findElement(By.name("loginname"));
        login.sendKeys(username);
        Thread.sleep(1000);

    }

    @And("je saisie password {string}")
    public void jeSaisiePassword(String password) throws InterruptedException {
        WebElement password1 = driver.findElement(By.name("password"));
        password1.sendKeys(password);
        Thread.sleep(1000);

    }

    @And("je clique sur le bouton Loginn")
    public void jeCliqueSurLeBoutonLoginn() throws InterruptedException {
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"loginFrm\"]/fieldset/button"));
        submitButton.click();
        Thread.sleep(1000);

    }


    @Then("je redirige vers le dash")
    public void jeRedirigeVersLeDash() {
        String ExpectedUrl="https://automationteststore.com/index.php?rt=account/account";
        String CurrentUrl = driver.getCurrentUrl();
        if (Objects.equals(CurrentUrl,ExpectedUrl)) {
            System.out.println("Login Successful");
        }
        else {
            System.out.println("Login Failed");
        }
    }

    @Given("je navigue sur le site Automation Test Store")
    public void je_navigue_sur_le_site_automation_test_store() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationteststore.com/");
        Thread.sleep(1000);

    }

    @When("je tape sur le bouton log or registre")
    public void jeTapeSurLeBoutonLogOrRegistre() throws InterruptedException {
        WebElement loginsc= driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/a"));
        loginsc.click();
        Thread.sleep(1000);

    }

    @And("je tape un username invalide {string}")
    public void jeTapeUnUsernameInvalide(String username) throws InterruptedException {
        WebElement login = driver.findElement(By.name("loginname"));
        login.sendKeys(username);
        Thread.sleep(1000);

    }

    @And("je tape un  password {string}")
    public void jeTapeUnPassword(String password) throws InterruptedException {
        WebElement password1 = driver.findElement(By.name("password"));
        password1.sendKeys(password);
        Thread.sleep(1000);

    }

    @And("je tape sur le bouton Login")
    public void jeTapeSurLeBoutonLogin() throws InterruptedException {
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"loginFrm\"]/fieldset/button"));
        submitButton.click();
        Thread.sleep(1000);

    }

    @Then("je reste dans la page login")
    public void jeResteDansLaPageLogin() {
        String ExpectedUrl="https://automationteststore.com/index.php?rt=account/login";
        String CurrentUrl = driver.getCurrentUrl();
        if (Objects.equals(CurrentUrl,ExpectedUrl)) {
            System.out.println("Login Failed");
        }
        else {
            System.out.println("Login successful");
        }
    }

    @Given("j'ouvre le site Automation Test Store")
    public void jOuvreLeSiteAutomationTestStore() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationteststore.com/");
        Thread.sleep(1000);


    }

    @When("je tape sur le bouton login or registre")
    public void jeTapeSurLeBoutonLoginOrRegistre() throws InterruptedException {
        WebElement loginsc= driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/a"));
        loginsc.click();
        Thread.sleep(1000);

    }

    @And("je tape valide username {string}")
    public void jeTapeValideUsername(String username) throws InterruptedException {
        WebElement login = driver.findElement(By.name("loginname"));
        login.sendKeys(username);
        Thread.sleep(1000);

    }

    @And("je tape invalide password {string}")
    public void jeTapeInvalidePassword(String password) throws InterruptedException {
        WebElement password1 = driver.findElement(By.name("password"));
        password1.sendKeys(password);
        Thread.sleep(1000);

    }

    @And("je tape sur le bouton Loginn")
    public void jeTapeSurLeBoutonLoginn() throws InterruptedException {
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"loginFrm\"]/fieldset/button"));
        submitButton.click();
        Thread.sleep(1000);

    }

    @Then("je peux pas rediriger vers le dash")
    public void jePeuxPasRedirigerVersLeDash() {
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
