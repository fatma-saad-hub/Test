import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class ExtenReportsDemoWithTestNG {
    ExtentHtmlReporter htmlReporter;
    ExtentReports extentReports;
    WebDriver driver;
    @BeforeSuite
    public void setUp(){
        htmlReporter = new ExtentHtmlReporter("target/extent.html");
        // create extentReports and attach reporters
        extentReports = new ExtentReports();
        extentReports.attachReporter(htmlReporter);
    }
    @BeforeTest
    public void beforeTest(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }
    @Test
    public  void test1() throws Exception{

        ExtentTest test = extentReports.createTest("MY first test","Sample description ");
        driver.get("https://google.com");
        test.pass("navigate to google chrome");
        test.log(Status.INFO, "this steps shows usage of log (status,detail)");
        test.info("this step shows of info(details)");
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");
    }
    @Test
    public  void test2() throws Exception{
        ExtentTest test = extentReports.createTest("MY first test","Sample description ");
        test.log(Status.INFO, "this steps shows usage of log (status,detail)");
        test.info("this step shows of info(details)");
        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        test.addScreenCaptureFromPath("screenshot.png");
    }
    @AfterTest
    public void afterTest(){
        driver.close();
        driver.quit();
        System.out.println( "test completed Successfully");
    }
    @AfterSuite
    public void tearDown(){
        extentReports.flush();
    }
}
