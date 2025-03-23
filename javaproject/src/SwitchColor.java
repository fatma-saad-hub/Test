import java.util.Scanner;

public class SwitchColor {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Demander à l'utilisateur de saisir une couleur
            System.out.print("Entrez une couleur (par exemple : Rouge, Bleu, Vert, Jaune) : ");
            String couleur = scanner.nextLine();  // Convertir l'entrée en minuscule

            // Utilisation de switch pour afficher des messages correspondant aux couleurs
            switch (couleur) {
                case "rouge":
                    System.out.println("La couleur du feu et de l'amour.");
                    break;
                case "bleu":
                    System.out.println("La couleur du ciel et de l'océan.");
                    break;
                case "vert":
                    System.out.println("La couleur de la nature et de la croissance.");
                    break;
                case "jaune":
                    System.out.println("La couleur du soleil et de la joie.");
                    break;
                default:
                    System.out.println("Couleur non définie.");
                    break;
            }

            scanner.close();
        }
    }


