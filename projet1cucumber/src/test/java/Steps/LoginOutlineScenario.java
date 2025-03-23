//package Steps;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//public class LoginOutlineScenario {
//    WebDriver driver;
//    @Given("utilisateur naviguer vers la page connexion")
//    public void utilisateur_naviguer_vers_la_page_connexion() {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.saucedemo.com/");
//    }
//    @When("utilisateurs saisie {string}")
//    public void utilisateurSaisieUsername(String username) {
//        driver.findElement(By.id("user-name")).sendKeys(username);
//    }
//    @And("utilistaeurs saisie {string}")
//    public void utilistaeurSaisiePassword(String password) {
//        driver.findElement(By.id("password")).sendKeys(password);
//
//    }
//
//    @And("utilisateur clique sur Login")
//    public void utilisateurCliqueSurLogin() {
//        driver.findElement(By.id("login-button")).click();
//    }
//    @Then("utilistaeur reste dans la page login")
//    public void utilistaeurResteDansLaPageLogin() {
//        String urlactive ="https://www.saucedemo.com/";
//        if(urlactive==driver.getCurrentUrl()){
//            System.out.println("pass");
//        }
//        driver.close();}
//}
