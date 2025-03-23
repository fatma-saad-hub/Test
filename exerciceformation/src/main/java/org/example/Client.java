package org.example;

public class Client extends Personne {
    private String codeclient;

    public String getCodeclient() {
        return codeclient;
    }

    public void setCodeclient(String codeclient) {
        this.codeclient = codeclient;
    }

    public Client() {
    }

    public Client(String username, String email, String password, int age, double salaire, String codeclient) {
        super(username, email, password, age, salaire);
        this.codeclient = codeclient;
    }

    public void DetailClient(){
        System.out.println("Client details: " + codeclient);
    }

}
