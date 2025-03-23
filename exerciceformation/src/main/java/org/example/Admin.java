package org.example;

public class Admin extends Personne{
    private String codeAdmin;

    public String getCodeAdmin() {
        return codeAdmin;
    }

    public void setCodeAdmin(String codeAdmin) {
        this.codeAdmin = codeAdmin;
    }

    public Admin() {
    }

    public Admin(String username, String email, String password, int age, double salaire, String codeAdmin) {
        super(username, email, password, age, salaire);
        this.codeAdmin = codeAdmin;
    }
    public void DetailCodeAdmin (){
        System.out.println("Code Admin: " + codeAdmin);
    }
}
