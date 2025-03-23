package Poo;

public class Employee {

    //Attributes
   int id;
   String name;
   int age;
    String address;
    String job;
    int salary;

 // Methodes

    public Employee(int id, String name, int age, String address, String job, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.job = job;
        this.salary = salary;
    }


    void display(){
        System.out.println("id :" +id+" ,name: "+name+" , address: "+address+" ,salary: "+salary);
    }



    void setDataEmployee(int id, String name, int age, String address, String job, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.job = job;
        this.salary = salary;
}
}
