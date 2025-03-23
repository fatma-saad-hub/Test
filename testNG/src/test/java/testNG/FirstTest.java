package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {
    WebDriver driver;
    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
    }

    @Test
void teststeps() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"menuToggle\"]/input")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
driver.findElement(By.xpath("/html/body/div/nav/div/ul/a[2]/li")).click();
driver.findElement(By.xpath("//*[@id=\"usr\"]")).sendKeys("fatma12");
driver.findElement(By.xpath("//*[@id=\"pwd\"]")).sendKeys("fatmasaad1996");
driver.findElement(By.xpath("//*[@id=\"second_form\"]/input")).click();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"ShoeType\"]"));
        String exptext ="formal Shoes";
        String actualtext = element.getText();
        Assert.assertEquals(actualtext,exptext);
    }

}
