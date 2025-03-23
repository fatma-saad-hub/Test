package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
    WebDriver driver;
    @FindBy(id="react-burger-menu-btn")
    WebElement reactBurgerMenu;

    @FindBy(id="logout_sidebar_link")
    WebElement logout;

    public Logout(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickReactBurgerMenu() {
        reactBurgerMenu.click();
    }
    public void clickLogout() {
        logout.click();
    }
}
