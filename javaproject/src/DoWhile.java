import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String motDePasse;

        do {
        System.out.print("Entrez le mot de passe : ");
        motDePasse = scanner.nextLine(); // Lire l'entrée utilisateur
    } while (!motDePasse.equals("1234")); // Répéter tant que ce n'est pas "1234"

        System.out.println("Accès autorisé !");


}
}
