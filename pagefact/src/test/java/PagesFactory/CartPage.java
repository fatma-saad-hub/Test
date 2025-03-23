package PagesFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
WebDriver driver;



@FindBy(xpath="//*[@id=\"maincontainer\"]/div/div/div/div/div/div/a")
WebElement cartcontinue;

@FindBy(id="cart_checkout1")
WebElement checkoutf;

@FindBy(id="cart_checkout2")
WebElement checkouts;

@FindBy(id="cart_update")
WebElement update;

@FindBy(xpath="//*[@id=\"cart\"]/div/div[3]/div/a[1]")
WebElement shop;

@FindBy(id="checkout_btn")
WebElement confirmorder;

public CartPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
}
public void clickCart() {
    cartcontinue.click();
}
public void clickCheckout() {
    checkoutf.click();
}
public void clickUpdate() {
    update.click();
}
public void clickShop() {
    shop.click();
}
public void setCheckouts(){
    checkoutf.click();
}
public void clickConfirmOrder() {
    confirmorder.click();
}
public void clickCartcontinue(){
    cartcontinue.click();
}
}
