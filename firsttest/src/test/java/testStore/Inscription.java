package testStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Inscription {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(" https://automationteststore.com/ ");
        Thread.sleep(3000);
        WebElement inscrip = driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/a"));
        inscrip.click();
        Thread.sleep(3000);
        WebElement contin = driver.findElement(By.xpath("//*[@id=\"accountFrm\"]/fieldset/button"));
        contin.click();
        Thread.sleep(2000);
        WebElement name = driver.findElement(By.name("firstname"));
        name.sendKeys("Fatma");
        Thread.sleep(2000);
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Saad");
        Thread.sleep(2000);
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("fatma.saad@gmail.com");
        Thread.sleep(2000);
        WebElement phone = driver.findElement(By.name("telephone"));
        phone.sendKeys("21669854723");
        Thread.sleep(2000);
        WebElement fax = driver.findElement(By.name("fax"));
        fax.sendKeys("21659872365");
        Thread.sleep(2000);
        WebElement company = driver.findElement(By.name("company"));
        company.sendKeys("fatma saad");
        Thread.sleep(2000);
        WebElement address1 = driver.findElement(By.name("address_1"));
        address1.sendKeys("123 street");
        Thread.sleep(2000);
        WebElement address2= driver.findElement(By.name("address_2"));
        address2.sendKeys("235 street");
        Thread.sleep(2000);
        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Ben Arous");
        Thread.sleep(2000);
        WebElement country = driver.findElement(By.name("country_id"));
        Select sel1 = new Select(country);
        sel1.selectByValue("1");
        //country.sendKeys("Tunisia");
        Thread.sleep(2000);
        WebElement sel_element = driver.findElement(By.name("zone_id"));
        Select sel = new Select(sel_element);
        //sel.selectByValue("3293");
        sel.selectByIndex(3);
        //sel.selectByVisibleText("Ben Arous");

        Thread.sleep(2000);
        WebElement zip = driver.findElement(By.name("postcode"));
        zip.sendKeys("2025");
        Thread.sleep(2000);
        WebElement loginname = driver.findElement(By.name("loginname"));
        loginname.sendKeys("fatmasaad");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("password12");
        Thread.sleep(2000);
        WebElement confirmpassword = driver.findElement(By.name("confirm"));
        confirmpassword.sendKeys("password12");
        Thread.sleep(2000);
        WebElement subscribe = driver.findElement(By.name("newsletter"));
        subscribe.click();
        Thread.sleep(2000);
        WebElement agree = driver.findElement(By.name("agree"));
        agree.click();
        Thread.sleep(2000);
        WebElement continu = driver.findElement(By.xpath("//*[@id=\"AccountFrm\"]/div[5]/div/div/button"));
        continu.click();


    }
}
