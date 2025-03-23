package outils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ElementUtiles {
    WebDriver driver;


    public ElementUtiles(WebDriver driver) {
        this.driver = driver;
    }

    public void confirmation(String link){
        String CurrentUrl = driver.getCurrentUrl();
  if (Objects.equals(CurrentUrl,link)) {
            System.out.println("Link correspond");
        }
        else {
            System.out.println("Link ne correpond pas ");
        }


    }

    public void Exsist (String word){
        String pageContent = driver.findElement(By.tagName("html")).getText();
        List<String> motRecherche= new ArrayList<>();
        motRecherche.add(word);
        for(String  mot : motRecherche){
            if (pageContent.contains(mot)) {
                System.out.println("le mot " + mot + "  existe sur la page");

            }
            else {
                System.out.println("le mot " + mot + " est suprimé deja ");
            }
        }
    }
}
