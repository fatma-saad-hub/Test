package PagesFactory;

import io.cucumber.java.eo.Se;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    WebDriver driver;
    @FindBy(name ="firstname")
    WebElement firstname;
    @FindBy(name = "lastname")
    WebElement lastname;
    @FindBy(name ="email")
    WebElement email;
    @FindBy(name = "telephone")
    WebElement phone;
    @FindBy(name = "fax")
    WebElement fax;
    @FindBy(name ="company")
    WebElement company;
    @FindBy(name = "address_1")
    WebElement address_1;
    @FindBy(name = "address_2")
    WebElement address_2;
    @FindBy(name ="city")
    WebElement city;
    @FindBy(name = "country_id")
    WebElement country_id;
    @FindBy(name = "zone_id")
    WebElement zone_id;

    @FindBy(name ="postcode")
    WebElement postcode;
    @FindBy(name = "loginname")
    WebElement loginname;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(name = "confirm")
    WebElement confirm;
    @FindBy(name ="newsletter")
    WebElement subscribe;
    @FindBy(name = "agree")
    WebElement privacy;
    @FindBy(xpath = "//*[@id=\"AccountFrm\"]/div[5]/div/div/button")
    WebElement Register;
    @FindBy(xpath ="//*[@id=\"customer_menu_top\"]/li/a")
    WebElement loginregister;
    @FindBy(xpath ="//*[@id=\"accountFrm\"]/fieldset/button")
    WebElement btncontinue;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void setFirstname(String Firstname) {
        firstname.sendKeys(Firstname);
    }

    public void setLastname(String Lastname) {
       lastname.sendKeys(Lastname);
    }

    public void setEmail(String Email) {
        email.sendKeys(Email);
    }

    public void setPhone(String Phone) {
        phone.sendKeys(Phone);
    }

    public void setFax(String Fax) {
        fax.sendKeys(Fax);
    }

    public void setCompany(String Company) {
        company.sendKeys(Company);
    }

    public void setAddress_1(String Address_1) {
        address_1.sendKeys(Address_1);
    }

    public void setAddress_2(String Address_2) {
        address_2.sendKeys(Address_2);
    }

    public void setCity(String City) {
        city.sendKeys(City);
    }

    public void setCountry_id(int Country_id) {
        Select select = new Select(country_id);
        select.selectByIndex(Country_id);
    }

    public void setZone_id(int Zone_id) {
        Select select2 = new Select(zone_id);
        select2.selectByIndex(Zone_id);
    }

    public void setPostcode(String Postcode) {
        postcode.sendKeys(Postcode);
    }

    public void setLoginname(String Loginname) {
        loginname.sendKeys(Loginname);
    }

    public void setPassword(String  Password) {
        password.sendKeys(Password);
    }

    public void setConfirm(String Confirm) {
        confirm.sendKeys(Confirm);
    }
    public void clickSubscribe() {
        subscribe.click();
    }
    public void clickPrivacy() {
        privacy.click();
    }
    public void clickRegister() {
        Register.click();
    }
    public void clickContinuer() {
        btncontinue.click();
    }
    public void clicklogregister(){
        loginregister.click();
    }
}
