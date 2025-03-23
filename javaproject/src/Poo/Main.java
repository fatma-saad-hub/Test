package Poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        Employe e1 = new Employe();
        Manager m1 = new Manager();



    // Modification du salaire de l'employé
                e1.setSalaire(3200);

    // Affichage des informations
                e1.afficher();
                m1.afficherManager();
}


    }

//            Employee emp1 = new Employee(1,"john",29,"rue 22","QA",5500);
//            Employee emp2 = new Employee(5,"jane",59,"rue 22","tester QA",55500);
//            emp1.display();
//            emp2.display();
////            emp1.id = 1;
////            emp1.name = "John";
////            emp1.age = 25;
////            emp1.address = "San Francisco";
////            emp1.job = "tester";
////            emp1.salary = 10000;
////            emp1.setDataEmployee(1,"jhon",25,"rue 1254","QA",4500);
//
//
////            emp2.id = 2;
////            emp2.name = "Jane";
////            emp2.age = 35;
////            emp2.address = "San Francisco";
////            emp2.job = "QA TESTER";
////            emp2.salary = 15000;
//
//
//        Rectangle r1=new Rectangle(10,2333);
                // Création d'un employé et d'un manager

