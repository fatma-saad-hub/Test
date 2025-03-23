package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PlayYoutube {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        Thread.sleep(2000);
//        driver.get("https://www.youtube.com/watch?v=G1vmQgBSfi0&list=PLbJF4g421wqlszfD1tQ3gGIaqzOPtM1jE");
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("test logiciel");

        Thread.sleep(2000);
        WebElement btnsearch = driver.findElement(By.xpath("//*[@id=\"center\"]/yt-searchbox/button/yt-icon/span/div"));
        btnsearch.click();
        Thread.sleep(2000);
        WebElement vid = driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string"));
        Thread.sleep(2000);
        vid.click();
        Thread.sleep(2000);
        WebElement full = driver.findElement(By.xpath("/html/body/ytd-app/div[1]/ytd-page-manager/ytd-watch-flexy/div[5]/div[1]/div/div[1]/div[2]/div/div/ytd-player/div/div/div[32]/div[2]/div[2]/button[9]"));
        full.click();

//        WebElement video = driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[6]/button"));
//        video.click();

    }
}
