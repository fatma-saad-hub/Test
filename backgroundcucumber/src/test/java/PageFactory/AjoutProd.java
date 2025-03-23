package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AjoutProd {

    WebDriver driver;

    @FindBy(id="add-to-cart-sauce-labs-backpack")
    WebElement addToCart;

    @FindBy(id="logout_sidebar_link")
    WebElement logout;

    @FindBy(xpath="//*[@id=header_container]/div[2]/div/span/select")
    WebElement categorie;

    @FindBy(className="shopping_cart_link")
    WebElement shoppingCart;

    public AjoutProd(WebDriver driver) {
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

    public void shoppingCart() {
        shoppingCart.click();
    }
}
