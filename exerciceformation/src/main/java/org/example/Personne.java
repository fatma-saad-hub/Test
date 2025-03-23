package org.example;

public class Personne {
    private String username;
    private String email;
    private String password;
    private int age;
    private double salaire;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Personne() {
    }

    public Personne(String username, String email, String password, int age, double salaire) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.age = age;
        this.salaire = salaire;
    }
    public void Affiche(){
        System.out.println("username: "+ username + " email: " + email + " password: " + password + " age: " + age+ " salaire: " + salaire);
    }


    //6/En cas ou il peut bénéficier, son salaire sera réduit de 35% chaque mois.
    // Et il a comme des charges extra de 73.0 durant 28 jours.
    //Calculer le reste en ce cas.
    public void Augmenter(double x){
        salaire = salaire + x;
        System.out.println("salaire: " + salaire);
        if (salaire < 2500.0){
           System.out.println("il ne peut pas bénéficier d’un crédit");

        }
        else if (salaire > 2500.0){
            double s=salaire-(salaire*35/100);
            double s1=s-(73.0*8);
            System.out.println("il peut bénéficier d'un crédit et le reste de salaire est: " + s1);
            //System.out.println("il peut  bénéficier d’un crédit");
        }
        else {
            System.out.println("il peut  bénéficier d’un crédit avec des contraintes");
        }



    }
}
