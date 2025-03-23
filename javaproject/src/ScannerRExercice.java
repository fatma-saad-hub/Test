import java.util.Scanner;  // Import pour lire l'entrée utilisateur
public class ScannerRExercice {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 1. Demander à l'utilisateur d'entrer deux nombres
            System.out.print("Entrez le premier nombre (a) : ");
            int a = scanner.nextInt();

            System.out.print("Entrez le deuxième nombre (b) : ");
            int b = scanner.nextInt();

            // 2. Opérateurs arithmétiques
            System.out.println("\n--- Opérations Arithmétiques ---");
            System.out.println("a + b = " + (a + b));
            System.out.println("a - b = " + (a - b));
            System.out.println("a * b = " + (a * b));
            System.out.println("a / b = " + (a / b)); // Attention à la division entière
            System.out.println("a % b = " + (a % b)); // Reste de la division

            // 3. Opérateurs de comparaison
            System.out.println("\n--- Comparaison ---");
            System.out.println("a == b : " + (a == b));
            System.out.println("a != b : " + (a != b));
            System.out.println("a > b  : " + (a > b));
            System.out.println("a < b  : " + (a < b));
            System.out.println("a >= b : " + (a >= b));
            System.out.println("a <= b : " + (a <= b));

            // 4. Opérateurs logiques
            System.out.println("\n--- Opérateurs Logiques ---");
            System.out.println("(a > 0) && (b > 0) : " + ((a > 0) && (b > 0))); // Les deux sont positifs ?
            System.out.println("(a > 0) || (b > 0) : " + ((a > 0) || (b > 0))); // Au moins un est positif ?
            System.out.println("!(a > 0)           : " + !(a > 0)); // a n'est pas positif ?

            // 5. Opérateurs d'affectation
            System.out.println("\n--- Opérateurs d'Affectation ---");
            a += 5; // Équivaut à a = a + 5
            System.out.println("Après a += 5, a = " + a);

            a -= 3; // Équivaut à a = a - 3
            System.out.println("Après a -= 3, a = " + a);

            a *= 2; // Équivaut à a = a * 2
            System.out.println("Après a *= 2, a = " + a);

            a /= 2; // Équivaut à a = a / 2
            System.out.println("Après a /= 2, a = " + a);

            a %= 2; // Équivaut à a = a % 2
            System.out.println("Après a %= 2, a = " + a);

            scanner.close(); // Fermer le scanner
        }
    }
