package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSize {
    public static void main(String[] args) {
        // afficher un message dans le console
        System.out.println("Open Chrome Browser");
    // ouvrir le navigateur chrome
        WebDriver driver = new ChromeDriver();
        // maximiser le windows de navigateur avec une dimension(size) spécifique
        Dimension iphoneXR = new Dimension(414,896);
        driver.manage().window().setSize(iphoneXR);
        // ouvrir un url dans le driver
        driver.get("https://www.facebook.com/");
}
}
