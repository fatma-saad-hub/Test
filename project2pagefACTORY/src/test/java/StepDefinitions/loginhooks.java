package StepDefinitions;

import PagesFactory.HomePage;
import PagesFactory.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginhooks {
LoginPage loginPage;
WebDriver driver;
// executre before (avant) scenario mais dans l'ordre est 1
@Before(order=1)
public void browsersetup(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://automationteststore.com/");
    HomePage homePage = new HomePage(driver);
    homePage.clickRegisterLogin();
    System.out.println("inside browsersetup");

}
// executre before (avant) scenario et le premier dans l'ordre
@Before(order=0)
public void setup2(){
    System.out.println("inside setup2");
    }
@After(order = 1) // apres la scenario  s'execute
public void closebrowser(){
    System.out.println("inside browser close");
    driver.close();
    driver.quit();
}
@After(order = 2)
public void closeBrowser2(){
    System.out.println("inside closeBrowser2");
}
@BeforeStep
public static void beforeStep(){
    System.out.println("inside beforeStep");
}
@AfterStep
public static void afterStep(){
    System.out.println("inside afterStep");
}

@Given("user dans la page login")
public void user_dans_la_page_login() {
    String urlactuel = "https://automationteststore.com/index.php?rt=account/login";
    if(urlactuel.equals(driver.getCurrentUrl())){
            System.out.println("passed");
        }

    }

    @When("user saisie un username and password valide")
    public void userSaisieUnUsernameAndPasswordValide() {
        loginPage=new LoginPage(driver);
        loginPage.enterUsername("fatmasaad10");
        loginPage.enterPassword("fatmasaad1210");
    }

    @And("user clique sur Login button")
    public void userCliqueSurLoginButton() {
        loginPage=new LoginPage(driver);
        loginPage.clickLoginButton();
    }

    @Then("user rediriger vers son page")
    public void userRedirigerVersSonPage() {
    }
}
