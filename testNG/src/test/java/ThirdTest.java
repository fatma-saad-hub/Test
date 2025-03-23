import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ThirdTest {
    WebDriver driver;
    @BeforeTest
    void setUp(){
        System.out.println("opninng browser");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://google.com");
    }

    @Test
    void test(){
        driver.findElement(By.name("q")).sendKeys("selenium");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
        System.out.println("test case");
    }
    @AfterTest
    void close(){
        driver.close();
        driver.quit();
        System.out.println("close browser");
    }
}
