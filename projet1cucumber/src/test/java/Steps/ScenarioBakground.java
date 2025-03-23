package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class ScenarioBakground {
    WebDriver driver;
    @Given("user est dans la page login")
    public void user_est_dans_la_page_login() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        String urlactuel = driver.getCurrentUrl();
        if(urlactuel.equals(driver.getCurrentUrl())){
            System.out.println("passed");
        }
    }
    @When("user tape un username")
    public void userTapeUnUsername() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @And("user tape password")
    public void userTapePassword() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("user clique sur Login")
    public void userCliqueSurLogin() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("user est dans la page des produits")
    public void userEstDansLaPageDesProduits() {
        if(driver.getPageSource().contains("Swag Labs")){
            System.out.println("pass");
        }
    }
    @When("user ajouter des produit")
    public void userAjouterDesProduit() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@data-test='add-to-cart-sauce-labs-backpack']")).click();
wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@data-test='remove-sauce-labs-backpack']"))));
driver.findElement(By.xpath("//*[@data-test='add-to-cart-sauce-labs-bike-light']")).click();
wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@data-test='remove-sauce-labs-bike-light']"))));

Thread.sleep(3000);

    }

    @Then("produits ajoutés dans le panier")
    public void produitsAjoutésDansLePanier() {
        System.out.println(driver.findElement(By.xpath("//*[@data-test='remove-sauce-labs-backpack']")).getText());
    }

    @When("user clique sur l'icone panier")
    public void userCliqueSurLIconePanier() {
        driver.findElement(By.xpath("//*[@data-test='shopping-cart-link']")).click();
    }

    @And("clique sur le bouron remove")
    public void cliqueSurLeBouronRemove() {
        driver.findElement(By.xpath("//*[@data-test='remove-sauce-labs-backpack']")).click();
    }
    @Then("produit supprimé du panier")
    public void produitSuppriméDuPanier() {

                try {
                    WebElement elemn=driver.findElement(By.xpath("//*[@data-test='remove-sauce-labs-backpack']"));
                    if(elemn.getText().equals("Remove"))
                        System.out.println("supresssion failed");
                } catch (Exception e){
                    System.out.println("supresssion passed");
                }
    }

    @When("user consulte son panier")
    public void userConsulteSonPanier() {
        driver.findElement(By.xpath("//*[@data-test='shopping-cart-link']")).click();

    }

    @And("user cliquer sur le bouton chechout")
    public void userCliquerSurLeBoutonChechout() {
        driver.findElement(By.xpath("//*[@data-test='checkout']")).click();

    }

    @When("user entrer son first Name")
    public void userEntrerSonFirstName() {
        driver.findElement(By.xpath("//*[@data-test='firstName']")).sendKeys("fatma");

    }

    @And("user saisie un last Name")
    public void userSaisieUnLastName() {
        driver.findElement(By.xpath("//*[@data-test='lastName']")).sendKeys("saad");
    }
    @And("use entre un code postale")
    public void useEntreUnCodePostale() {
        driver.findElement(By.xpath("//*[@data-test='postalCode']")).sendKeys("12535");
    }

    @And("clique sur continue")
    public void cliqueSurContinue() {
        driver.findElement(By.xpath("//*[@data-test='continue']")).click();
    }

    @Then("une page overview s'affiche")
    public void unePageOverviewSAffiche() {
        if(driver.getPageSource().contains("Checkout: Overview")){
            System.out.println("overview page");
        }

    }

    @When("user clique sur le bouton finish")
    public void userCliqueSurLeBoutonFinish() {
        driver.findElement(By.xpath("//*[@data-test='finish']")).click();
    }

    @Then("user est dans la page complete")
    public void userEstDansLaPageComplete() {
        if(driver.getPageSource().contains("Thank you for your order!")){
            System.out.println("Thank you for your order!");
        }

    }
}
