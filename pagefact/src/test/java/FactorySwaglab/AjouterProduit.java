package FactorySwaglab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AjouterProduit {
    WebDriver driver;

    @FindBy(id="add-to-cart-sauce-labs-backpack")
    WebElement addToCart;

    @FindBy(id="logout_sidebar_link")
    WebElement logout;

    @FindBy(xpath="//*[@id=header_container]/div[2]/div/span/select")
    WebElement categorie;

    public AjouterProduit(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void ajouterProduit() {
        addToCart.click();
    }
    public void logout() {
        logout.click();
    }
    public void categorie() {
        categorie.click();
    }



}
