package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class Stepinscription {
WebDriver driver;
    @Given("je suis  naviguer sur le site Automation Test Store")
    public void jeSuisNaviguerSurLeSiteAutomationTestStore() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationteststore.com/");
    } 
    
    @When("je clique sur le bouton registre")
    public void je_clique_sur_le_bouton_registre() {
        WebElement inscrip = driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/a"));
        inscrip.click();
    }

    @And("je clique sur le bouton continue")
    public void jeCliqueSurLeBoutonContinue() {
        WebElement contin = driver.findElement(By.xpath("//*[@id=\"accountFrm\"]/fieldset/button"));
        contin.click();
        
    }

    @And("je saisie un First Name")
    public void jeSaisieUnFirstName() throws InterruptedException {
        WebElement name = driver.findElement(By.name("firstname"));
        name.sendKeys("john12");
        Thread.sleep(2000);
    }

    @And("je saisie un Last Name")
    public void jeSaisieUnLastName() throws InterruptedException {
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("smith");
        Thread.sleep(2000);
        
    }

    @And("je saisie un E-Mail")
    public void jeSaisieUnEMail() throws InterruptedException {
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("johnsm@gmail.com");
        Thread.sleep(2000);
    }

    @And("je saisie un Telephone")
    public void jeSaisieUnTelephone() throws InterruptedException {
        WebElement phone = driver.findElement(By.name("telephone"));
        phone.sendKeys("21669854723");
        Thread.sleep(2000);
        
    }

    @And("je saisie un Fax")
    public void jeSaisieUnFax() throws InterruptedException {
        WebElement fax = driver.findElement(By.name("fax"));
        fax.sendKeys("21659872365");
        Thread.sleep(2000);
        
    }

    @And("je saisie un Company")
    public void jeSaisieUnCompany() throws InterruptedException {
        WebElement company = driver.findElement(By.name("company"));
        company.sendKeys("john");
        Thread.sleep(2000);
        
    }

    @And("je saisie un Address {int}")
    public void jeSaisieUnAddress(int arg0) throws InterruptedException {
        WebElement address1 = driver.findElement(By.name("address_1"));
        address1.sendKeys("123 street");
        Thread.sleep(2000);
    }

    @And("je saisie un seconde address")
    public void jeSaisieUnSecondeAddress() throws InterruptedException {
        WebElement address2= driver.findElement(By.name("address_2"));
        address2.sendKeys("235 street");
        Thread.sleep(2000);
    }

    @And("je saisie un City")
    public void jeSaisieUnCity() throws InterruptedException {
        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Ben Arous");
        Thread.sleep(2000);
        
    }

    @And("je saisie un Country")
    public void jeSaisieUnCountry() throws InterruptedException {
        WebElement country = driver.findElement(By.name("country_id"));
        Select sel1 = new Select(country);
        sel1.selectByValue("1");
        Thread.sleep(2000);
        
    }

    @And("je saisie un RegionState")
    public void jeSaisieUnRegionState() throws InterruptedException {
        WebElement sel_element = driver.findElement(By.name("zone_id"));
        Select sel = new Select(sel_element);
        sel.selectByIndex(3);
        Thread.sleep(2000);

    }

    @And("je saisie un ZIP Code")
    public void jeSaisieUnZIPCode() throws InterruptedException {
        WebElement zip = driver.findElement(By.name("postcode"));
        zip.sendKeys("2025");
        Thread.sleep(2000);
        
    }

    @And("je saisie un Login name")
    public void jeSaisieUnLoginName() throws InterruptedException {
        WebElement loginname = driver.findElement(By.name("loginname"));
        loginname.sendKeys("john1234");
        Thread.sleep(2000);
        
    }
    @And("je saisie un Password")
    public void jeSaisieUnPassword() throws InterruptedException {
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("password12");
        Thread.sleep(2000);

    }

    @And("je saisie un Password Confirm")
    public void jeSaisieUnPasswordConfirm() throws InterruptedException {
        WebElement confirmpassword = driver.findElement(By.name("confirm"));
        confirmpassword.sendKeys("password12");
        Thread.sleep(2000);

        
    }



    @And("je choisie un Subscribe")
    public void jeChoisieUnSubscribe() throws InterruptedException {
        WebElement subscribe = driver.findElement(By.name("newsletter"));
        subscribe.click();
        Thread.sleep(2000);
        
    }

    @And("je check un privacy")
    public void jeCheckUnPrivacy() throws InterruptedException {
        WebElement agree = driver.findElement(By.name("agree"));
        agree.click();
        Thread.sleep(2000);
        
    }

    @And("je clique sur le bouton inscription")
    public void jeCliqueSurLeBoutonInscription() {
        WebElement continu = driver.findElement(By.xpath("//*[@id=\"AccountFrm\"]/div[5]/div/div/button"));
        continu.click();
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
