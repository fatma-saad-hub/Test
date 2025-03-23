public class ExerciceMethodes {

            // Méthode qui additionne deux nombres et retourne la somme
            public static int additionner(int a, int b) {
                return a + b;
            }

            // Méthode qui vérifie si un nombre est pair
            public static boolean estPair(int nombre) {
                return nombre % 2 == 0;
            }

            // Méthode qui affiche un message
            public static void afficherMessage() {
                System.out.println("Bienvenue dans le programme de démonstration des méthodes !");
            }
            public static double Sum(double a, double b, double c) {
                return a + b+c;
            }
            public static double Avg(double sum) {
                return sum/3;

            }
            public static void print(double sum, double avg){
                System.out.println("la somme est "+sum);
                System.out.println("la avg est "+avg);
            }
            public static void main(String[] args) {
                // Appel de la méthode afficherMessage
                afficherMessage();

                // Test de la méthode additionner
                int somme = additionner(10, 5);
                System.out.println("La somme de 10 et 5 est : " + somme);

                // Test de la méthode estPair
                int nombreTest = 8;
                if (estPair(nombreTest)) {
                    System.out.println(nombreTest + " est un nombre pair.");
                } else {
                    System.out.println(nombreTest + " est un nombre impair.");
                }
                double som= Sum(4,8,96);
                double average = Avg(som);
                print(som,average);

            }
        }