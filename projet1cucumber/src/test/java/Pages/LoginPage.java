package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By username_id=By.id("user-name");
    By password_id=By.id("password");
    By login_id=By.id("login-button");

    public LoginPage(WebDriver driver)
    {
this.driver=driver;
    }

    public void saisieUsername(String username ) {
        driver.findElement(username_id).sendKeys(username);
    }
    public void saisiePassword( String password ) {
        driver.findElement(password_id).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(login_id).click();
    }

    public  void setLoginValid(String username, String password){



    }
}
