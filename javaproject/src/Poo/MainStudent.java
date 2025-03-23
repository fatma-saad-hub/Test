package Poo;

public class MainStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        s1.id=1;
        s1.name="John";
        s1.grad='A';
        s2.id=2;
        s2.name="Jane";
        s2.grad='A';
        s1.printData();
        s2.printData();
    }
}
