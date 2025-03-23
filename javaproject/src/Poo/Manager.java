package Poo;

public class Manager extends Employe {
        private double prime;

        // Constructeur
//        public Manager(String nom, double salaire, double prime) {
//            super(nom, salaire);
//            this.prime = prime;
//        }


    // Getter pour la prime
        public double getPrime() {
            return prime;
        }

        // Setter pour la prime
        public void setPrime(double prime) {
            this.prime = prime;
        }

        // Redéfinition de la méthode afficher()
        public void afficherManager() {
            System.out.println("Manager: " + getNom() + ", Salaire: " + getSalaire()
                    + " EUR, Prime: " + prime + " EUR");
        }
    }

