package Poo;

public class Ecapsulation {

        // Variables d'instance privées
        private String nom;
        private int age;
        // Constructeur


    public Ecapsulation() {
        super();
    }

    public Ecapsulation(String nom, int age) {
            this.nom = nom;
            this.age = age;
        }

        // Getter pour 'nom'
        public String getNom() {
            return nom;
        }

        // Setter pour 'nom'
        public void setNom(String nom) {
            this.nom = nom;
        }


    // Getter pour 'age'
        public int getAge() {
            return age;
        }

        // Setter pour 'age'
        public void setAge(int age) {
            // Exemple de validation dans le setter
            if (age > 0) {
                this.age = age;
            } else {
                System.out.println("L'âge doit être un nombre positif.");
            }
        }
    public static void main(String[] args) {
        // Création d'un objet Personne
        Ecapsulation p2 = new Ecapsulation();
        Ecapsulation p = new Ecapsulation("nom",25);


//        // Utilisation des getters pour accéder aux données
//        System.out.println("Nom: " + p.getNom());
//        System.out.println("Âge: " + p.getAge());
//
//        // Modification des données via setters
//        p.setNom("Bob");
//        p.setAge(30);
//
//        System.out.println("Nom modifié: " + p.getNom());
//        System.out.println("Âge modifié: " + p.getAge());
//
//        // Tentative de setter avec une valeur invalide
//        p.setAge(-5); // Cela affichera un message d'erreur
    }

    }





