package MultiplebBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {
    WebDriver driver=null;

    @Parameters("browserName")
    @BeforeTest
    public void setUp(String browserName){
        System.out.println("Browser name is :" +browserName);
        System.out.println("Thread id : "+Thread.currentThread().getId());
        if(browserName.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        }else if(browserName.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }else if(browserName.equalsIgnoreCase("ie")){
            driver = new InternetExplorerDriver();
        }
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://google.com");
        Thread.sleep(4000);

    }
    @AfterTest
    public void tearDown(){
        driver.close();
        System.out.println("Test completed successfully");
    }
}
