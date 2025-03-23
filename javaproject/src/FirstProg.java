public class FirstProg {
        public static void main(String[] args) {
            // 1. Déclaration des variables
            int age = 25;  // Remplace par ton âge
            double taille = 1.75;  // Remplace par ta taille
            char initiale = 'A';  // Remplace par ton initiale
            String prenom = "Alice";  // Remplace par ton prénom
            boolean estEtudiant = true;  // true si étudiant, false sinon

            // 2. Affichage des valeurs initiales
            System.out.println("Informations de l'utilisateur:");
            System.out.println("Prénom: " + prenom);
            System.out.println("Âge: " + age + " ans");
            System.out.println("Taille: " + taille + " m");
            System.out.println("Initiale: " + initiale);
            System.out.println("Est étudiant(e) ? " + estEtudiant);

            // 3. Modification des valeurs
            age = 30;
            taille = 1.80;
            estEtudiant = false;

            // 4. Affichage des nouvelles valeurs
            System.out.println("\nMise à jour des informations:");
            System.out.println("Âge mis à jour: " + age + " ans");
            System.out.println("Taille mise à jour: " + taille + " m");
            System.out.println("Est toujours étudiant(e) ? " + estEtudiant);
        }
    }

