package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Personne P= new Personne("fatma","fatma@gamil.com","1256de",55,1200.3);
        P.Affiche();
        Admin A=new Admin("john","@gmail.com","1256g",56,100.5,"500");
        A.DetailCodeAdmin();
        Client C=new Client("kaso","@gmail","158hff",65,2500.0,"501");
        C.DetailClient();
        C.Augmenter(1000.0);
    }
}