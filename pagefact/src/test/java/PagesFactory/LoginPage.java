package PagesFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(id= "loginFrm_loginname")
    WebElement username;
    @FindBy(id ="loginFrm_password")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"loginFrm\"]/fieldset/button")
    WebElement login;
    @FindBy(xpath = "//*[@id=\"customer_menu_top\"]/li/a")
    WebElement login_page;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        //initialiser tous les webelemnet pour etre utilisé dans les autres class
        PageFactory.initElements(driver, this);
    }
    public void SetUsername(String Username) {
        username.sendKeys(Username);
    }
    public void SetPassword(String Password) {
        password.sendKeys(Password);
    }
    public void ClickLogin() {
        login.click();
    }
    public void ClickLoginPage() {
        login_page.click();
    }


}
