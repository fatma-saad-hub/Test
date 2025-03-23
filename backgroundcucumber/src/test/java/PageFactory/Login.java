package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

        WebDriver driver;

        @FindBy(id="user-name")
        WebElement username;

        @FindBy(id="password")
        WebElement password;

        @FindBy(id="login-button")
        WebElement loginButton;

        public Login(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void setUsername(String Username) {
            username.sendKeys(Username);
        }
        public void setPassword(String Password) {
            password.sendKeys(Password);
        }
        public void clickLoginButton() {
            loginButton.click();
        }
    }


