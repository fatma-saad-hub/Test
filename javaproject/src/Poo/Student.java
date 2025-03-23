package Poo;

public class Student {
    int id;
    String name;
    char grad;


    void printData(){

        System.out.println("ID: " + id+" , Name: " + name+" , Grad: " + grad);
    }

    void setDataStudent(int id, String name, char grad){
        this.id = id;
        this.name = name;
        this.grad = grad;
    }
}
