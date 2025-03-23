package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenChromeBrowser {
public static void main(String[] args) {
    // afficher un message dans le console
    System.out.println("Open Chrome Browser");
    //System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    // ouvrir le navigateur chrome
    WebDriver driver = new ChromeDriver();
//    WebDriver driver1 = new FirefoxDriver();
//    WebDriver  driver2 = new EdgeDriver();

    // maximiser le windows de navigateur
    driver.manage().window().maximize();
    driver.manage().window().fullscreen();
    // delete cookies
    driver.manage().deleteAllCookies();
    // ouvrir un url dans le driver
    driver.get("www.google.com");


}
}
