import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG {
    WebDriver driver;
    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test1() {
        driver.get("https://www.saucedemo.com/");
        String title = driver.getTitle();
        String titleexpected = "Swag Labs";
        Assert.assertEquals(title, titleexpected);
    }

    @Test(enabled=false)
    public void login() {
        driver.get("https://www.saucedemo.com/");
        String title = driver.getTitle();
        String titleexpected = "Swag Labs";
        Assert.assertEquals(title, titleexpected);
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();
    }
    @DataProvider(name = "Login")
    public Object[][] getData() {
        return new Object[][] {
                {"standard_user", "secret_sauce"}, //donnée valide
                {"secret_sauce", "secret"}, // mot de passe incorrecte
                {"standard", "standard_user"}, // username incorrete
                {"", "standard_user"}, // username vide
                {"standard_user", ""} // pass vide


        };
    }
@Test(dataProvider = "Login")
    public void TestLogin(String Username, String Password){
        driver.get("https://www.saucedemo.com/");
        String title = driver.getTitle();
        String titleexpected = "Swag Labs";
        Assert.assertEquals(title, titleexpected);
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys(Username);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(Password);
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();
}


//    @AfterTest
//    public void tearDown() {
//        driver.quit();
//    }


}
