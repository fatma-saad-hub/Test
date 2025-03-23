package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
    WebDriver driver;
    @FindBy(id="checkout")
    WebElement checkout;
    @FindBy(id="continue")
    WebElement confirmcheck;

    @FindBy(id="cancel")
    WebElement cancelcheck;
    @FindBy(id="remove-sauce-labs-backpack")
    WebElement removeprod;

    @FindBy(id="finish")
    WebElement finishcheck;

    @FindBy(id="first-name")
    WebElement firstname;

    @FindBy(id="last-name")
    WebElement lastname;

    @FindBy(id="postal-code")
    WebElement postalcode;


    public Cart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickCheckout() {

        checkout.click();
    }
    public void clickConfirmcheck() {
        confirmcheck.click();
    }
    public void clickCancelcheck() {
        cancelcheck.click();
    }
    public void clickRemoveprod() {
        removeprod.click();
    }
    public void clickFinishcheck() {
        finishcheck.click();
    }

    public void setFirstname(String Firstname) {
        firstname.sendKeys(Firstname);
    }
    public void setLastname(String Lastname) {
        lastname.sendKeys(Lastname);
    }
    public void setPostalcode(String Postalcode) {
        postalcode.sendKeys(Postalcode);
    }
}
