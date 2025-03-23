import java.util.Scanner;

public class IfStatement {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // 1️⃣ Demander l'âge à l'utilisateur
            System.out.print("Entrez votre âge : ");
            int age = scanner.nextInt();

            // 2️⃣ Vérification de l'âge
            if (age < 0 || age > 120) {  // Vérification d'un âge réaliste
                System.out.println("Âge invalide.");
            } else if (age < 18) {
                System.out.println("Tu es mineur.");
            } else if (age >= 18 && age < 65) {
                System.out.println("Tu es majeur.");

                // 3️⃣ Condition imbriquée pour les jeunes adultes
                if (age <= 25) {
                    System.out.println("Tu es un jeune adulte.");
                }
            } else {
                System.out.println("Tu es senior.");
            }
            if(age % 2 == 0){
                System.out.println("votre age est pair");

            }
            else{
                System.out.println("votre age est impair");
            }
        }
    }
