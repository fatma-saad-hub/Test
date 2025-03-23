import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtentReportsDemo {
    public static void main(String[] args) {
        WebDriver driver;

    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("target/extent.html");

    // create extentReports and attach reporters
    ExtentReports extentReports = new ExtentReports();
    extentReports.attachReporter(htmlReporter);
    // create a toggle for the given tes
        ExtentTest test = extentReports.createTest("Google search","verify searching google ");
 driver= new ChromeDriver();
        test.log(Status.INFO, "starting test case");
        driver.get("https://google.com");
        test.pass("navigate to google search");

        driver.findElement(By.name("q")).sendKeys("selenium");
        test.pass("entered text in searchbox");
//        driver.findElement(By.name("btnK")).click();
//        // or
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
        test.pass("pressed keyboard enter key");
        driver.close();
        driver.quit();
        test.info("finished test case");




        ExtentTest test2 = extentReports.createTest("Google search 2","verify searching google ");
        driver= new ChromeDriver();

        test2.log(Status.INFO, "starting test case");
        driver.get("https://google.com");
        test2.pass("navigate to google search");

        driver.findElement(By.name("q")).sendKeys("selenium");
        test2.pass("entered text in searchbox");
//        driver.findElement(By.name("btnK")).click();
//        // or
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.RETURN);
        test2.fail("pressed keyboard enter key");
        driver.close();
        driver.quit();
        test2.pass("closed browser");
        test2.info("finished test case");

                extentReports.flush();
}}
