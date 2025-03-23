package testStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://automationteststore.com/login ");
        Thread.sleep(3000);
        WebElement inscrip = driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/a"));
        inscrip.click();
        Thread.sleep(3000);
        // connexion avec log et password
        WebElement login = driver.findElement(By.name("loginname"));
        login.sendKeys("john12354");
        Thread.sleep(3000);
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("secret");
        Thread.sleep(3000);
        WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"loginFrm\"]/fieldset/button"));
        submitButton.click();
        Thread.sleep(5000);
        // la deconnexion
//        WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"maincontainer\"]/div/div[2]/div[1]/div/ul/li[10]/a"));
//        logoutButton.click();
        WebElement logout = driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/a/div"));
        logout.click();
        Thread.sleep(3000);
        Select decon = new Select(logout);
        decon.selectByIndex(1);
//        WebElement deconnect = driver.findElement(By.xpath("//*[@id=\"customer_menu_top\"]/li/ul/li[10]"));
//        deconnect.click();
//        Select select = new Select(deconnexion);
//        select.selectByVisibleText("Not John? Logoff");
        Thread.sleep(3000);



    }
}
