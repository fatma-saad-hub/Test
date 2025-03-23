package StepDefinitions;

import PagesFactory.LoginPage;
import PagesFactory.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class StepRegister {
    WebDriver driver = new ChromeDriver();
    RegisterPage register = new RegisterPage(driver);


    @Given("je suis  naviguer sur le site Automation Test Store")
    public void je_suis_naviguer_sur_le_site_automation_test_store() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get("https://automationteststore.com/index.php?rt=account/create");
        Thread.sleep(1000);

    }

    @When("je clique sur le bouton loginregistre")
    public void jeCliqueSurLeBoutonLoginregistre() throws InterruptedException {

        register.clicklogregister();
        Thread.sleep(1000);

    }

    @And("je clique sur le bouton continue")
    public void jeCliqueSurLeBoutonContinue() throws InterruptedException {
        register.clickContinuer();
        Thread.sleep(1000);


    }

    @And("je saisie un First Name")
    public void jeSaisieUnFirstName() throws InterruptedException {
        register.setFirstname("fatma");
        Thread.sleep(1000);


    }

    @And("je saisie un Last Name")
    public void jeSaisieUnLastName() throws InterruptedException {
        register.setLastname("SAAD");
        Thread.sleep(1000);


    }

    @And("je saisie un E-Mail")
    public void jeSaisieUnEMail() throws InterruptedException {
        register.setEmail("fatma123456@gmail.com");
        Thread.sleep(1000);

    }

    @And("je saisie un Telephone")
    public void jeSaisieUnTelephone() throws InterruptedException {
        register.setPhone("123589647");
        Thread.sleep(1000);

    }

    @And("je saisie un Fax")
    public void jeSaisieUnFax() throws InterruptedException {
        register.setFax("123234567");
        Thread.sleep(1000);

    }

    @And("je saisie un Company")
    public void jeSaisieUnCompany() throws InterruptedException {
        register.setCompany("Gust");
        Thread.sleep(1000);

    }

    @And("je saisie un Address")
    public void jeSaisieUnAddress() throws InterruptedException {
        register.setAddress_1("123 Rue salambo tunis");
        Thread.sleep(1000);

    }

    @And("je saisie un seconde address")
    public void jeSaisieUnSecondeAddress() throws InterruptedException {
        register.setAddress_2("22 Av founoun tunis ");
        Thread.sleep(1000);

    }

    @And("je saisie un City")
    public void jeSaisieUnCity() throws InterruptedException {
        register.setCity("San Francisco");
        Thread.sleep(1000);

    }

    @And("je saisie un Country")
    public void jeSaisieUnCountry() throws InterruptedException {
        register.setCountry_id(2);
        Thread.sleep(1000);

    }

    @And("je saisie un RegionState")
    public void jeSaisieUnRegionState() throws InterruptedException {
        register.setZone_id(3);
        Thread.sleep(1000);

    }

    @And("je saisie un ZIP Code")
    public void jeSaisieUnZIPCode() throws InterruptedException {
        register.setPostcode("2356");
        Thread.sleep(1000);

    }

    @And("je saisie un Login name")
    public void jeSaisieUnLoginName() throws InterruptedException {
        register.setLoginname("fatma1210");
        Thread.sleep(1000);

    }

    @And("je saisie un Password")
    public void jeSaisieUnPassword() throws InterruptedException {
        register.setPassword("123456");
        Thread.sleep(1000);

    }

    @And("je saisie un Password Confirm")
    public void jeSaisieUnPasswordConfirm() throws InterruptedException {
        register.setConfirm("123456");
        Thread.sleep(1000);

    }

    @And("je choisie un Subscribe")
    public void jeChoisieUnSubscribe() throws InterruptedException {
        register.clickSubscribe();
        Thread.sleep(1000);

    }

    @And("je check un privacy")
    public void jeCheckUnPrivacy() throws InterruptedException {
        register.clickPrivacy();
        Thread.sleep(1000);

    }

    @And("je clique sur le bouton inscription")
    public void jeCliqueSurLeBoutonInscription() throws InterruptedException {
        register.clickRegister();
        Thread.sleep(1000);

    }

    @Then("redirection vers la page succes")
    public void redirectionVersLaPageSucces() {
        String pageContent=driver.findElement(By.tagName("html")).getText();
        List<String> motRecherche= new ArrayList<>();
        motRecherche.add("YOUR ACCOUNT HAS BEEN CREATED!");
        for(String  mot : motRecherche){
            if (pageContent.contains(mot)) {
                System.out.println("le mot " + mot + "  existe sur la page");
            }
            else {
                System.out.println("le mot " + mot + "  n'existe sur la page");
            }
        }

    }

}
