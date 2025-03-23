package testNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class TestNGOrangeHRM {

        WebDriver driver;
//        @BeforeClass
//        public void setUp() {
//            driver = new ChromeDriver();
//            driver.manage().window().maximize();
//        }
    @BeforeMethod
        public void testCase1() throws InterruptedException {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            Thread.sleep(2000);
            boolean image = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();
            Assert.assertTrue(image);
        }

      //  @Parameters({"username","password"})


        @Test(dataProvider = "loginData")
        public void testCase2(String usname , String password) throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(usname);
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(password);
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        }

//        @Test(priority=4, description = "url actual ", invocationCount = 3)
//        public void testCase3(){
//            String actulUrl = driver.getCurrentUrl();
//            String ExpectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
//            Assert.assertEquals(actulUrl,ExpectedUrl);
//        }
//        @Test(priority=3, alwaysRun = true, dependsOnMethods = {"testCase3"})
//        public void testCase4() throws InterruptedException {
//            String title =driver.getTitle();
//            Thread.sleep(3000);
//            String expcttitle ="OrangeHRM";
//            Assert.assertEquals(title,expcttitle);
//        }

//        @Test(priority=5)
//        public void testCase5() throws InterruptedException {
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")).click();
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
//            Thread.sleep(2000);
//            String actualUrl = driver.getCurrentUrl();
//            String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//            Assert.assertEquals(actualUrl,expectedUrl);
//        }

        @AfterMethod
        public void tearDown(){
            driver.close();
        }
    @DataProvider(name = "loginData")
    public Object[][] loginCredentails() {
        return new Object[][] {
                {"admin", "admin123"},  // Premier jeu de données
                {"admin2", "admin123"},  // Deuxième jeu de données
                {"admin", "12345"}   // Troisième jeu de données
        };
    }
}


