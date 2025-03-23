package PagesFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"customer_menu_top\"]/li/a")
    private WebElement logregister;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void clickRegisterLogin() {
        logregister.click();
    }

    public void checkButonlogregisterisDisplayed() {
        logregister.isDisplayed();
    }
}
