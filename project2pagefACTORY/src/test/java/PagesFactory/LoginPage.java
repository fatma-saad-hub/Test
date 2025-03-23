package PagesFactory;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(id="loginFrm_loginname")
    @CacheLookup
    WebElement username;

    @FindBy(id="loginFrm_password")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"loginFrm\"]/fieldset/button")
    WebElement loginButton;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        // pour initialiser tous les elements web pour etre utilisables dans les autres classes
        PageFactory.initElements((driver), this);
        // ou
        // //PageFactory.initElements((driver), LoginPage.class);
    }

    public void enterUsername(String username1) {

        username.sendKeys(username1);
    }
    public void enterPassword(String password1){
        password.sendKeys(password1);

    }
    public void clickLoginButton() {
        loginButton.click();
    }
}
