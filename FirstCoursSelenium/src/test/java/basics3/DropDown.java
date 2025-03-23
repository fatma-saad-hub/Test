package basics3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.letskodeit.com/practice");
        // recherche de les elements dropdown
        Select select = new Select(driver.findElement(By.id("carselect")));
        // recuperer le nombre des options d'une dropdown
        List<WebElement> options = select.getOptions();
        System.out.println(options.size());
        // recuperer les elements d'une dropdown
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        boolean bool =select.isMultiple();
        System.out.println(bool);
        select.selectByIndex(0);
        select.selectByValue("bmw");
        select.selectByVisibleText("BMW");

        Select select2 = new Select(driver.findElement(By.id("multiple-select-example")));
        List<WebElement> options2 = select2.getOptions();
        System.out.println(options2.size());
        for (WebElement option : options2) {
            System.out.println(option.getText());
        }
        select2.selectByVisibleText("Apple");
        select2.selectByValue("apple");
        select2.selectByIndex(1);

        System.out.println(select2.getFirstSelectedOption().getText());

}
}
