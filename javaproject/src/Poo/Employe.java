package Poo;// Classe de base Employe avec encapsulation

class Employe {
    private String nom; private double salaire;

    public Employe() {
        System.out.println("default constructor");
    }

    // Constructeur
//    public Employe(String nom, double salaire)
//    {
//        this.nom = nom;
//        this.salaire = salaire;
//    }



    // Getter pour le nom
    public String getNom() {
        return nom;
    }
    // Setter pour le nom
    public void setNom(String nom) {
        this.nom = nom; }
    // Getter pour le salaire
    public double getSalaire() {
        return salaire; }
    //Setter pour le salaire
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
    // Méthode pour afficher les informations
    public void afficher() {
        System.out.println("Employé: " + nom + ", Salaire: " + salaire + " EUR");
    }
}
