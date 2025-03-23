package Poo;

public class Animal {

    public void faireSon() {
        System.out.println("L'animal fait un son...");
    }


    // Classe enfant
    class Chien extends Animal {
        @Override
        public void faireSon() {  // Redéfinition de la méthode
            System.out.println("Le chien aboie : Woof Woof !");
        }
    }
    // Programme principal
    public class Main {
        public void main(String[] args) {
            Animal monChien = new Chien();
            monChien.faireSon();  // Appelle la méthode redéfinie dans Chien
        }
    }
}
