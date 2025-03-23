package PagesFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    @FindBy(xpath="//*[@id=\"customer_menu_top\"]/li/a")
    WebElement Registerorlog;
    @FindBy(xpath="//*[@id=\"block_frame_featured_1769\"]/div/div[1]/div[2]/div[3]/a/i")
    WebElement Addtocart;
    @FindBy(xpath="//*[@id=\"main_menu_top\"]/li[3]/a/span")
    WebElement Cart;
    @FindBy(id="filter_keyword")
    WebElement search;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Addtocart() {
        Addtocart.click();
    }
    public void Cart() {
        Cart.click();
    }
    public void search() {
        search.click();
    }
    public void registerorlog() {
        Registerorlog.click();
    }
    public void setSearch(String Search) {
        search.sendKeys(Search);
    }

}
