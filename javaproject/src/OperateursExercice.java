public class OperateursExercice {
        public static void main(String[] args) {
            // 1. Déclaration des variables
            int a = 10;
            int b = 3;

            // 2. Opérateurs arithmétiques
            System.out.println("Addition: " + (a + b));
            System.out.println("Soustraction: " + (a - b));
            System.out.println("Multiplication: " + (a * b));
            System.out.println("Division: " + (a / b)); // Division entière
            System.out.println("Modulo: " + (a % b));

            // 3. Opérateurs relationnels
            System.out.println("\nComparaisons:");
            System.out.println("a > b : " + (a > b));
            System.out.println("a < b : " + (a < b));
            System.out.println("a == b : " + (a == b));
            System.out.println("a != b : " + (a != b));

            // 4. Opérateurs logiques
            boolean condition1 = (a > 5 && b < 5);  // Vrai si a > 5 ET b < 5
            boolean condition2 = (a < 5 || b < 5);  // Vrai si a < 5 OU b < 5
            boolean condition3 = !(a == b);         // Inverse la condition (a == b)

            System.out.println("\nOpérations logiques:");
            System.out.println("(a > 5 && b < 5) : " + condition1);
            System.out.println("(a < 5 || b < 5) : " + condition2);
            System.out.println("!(a == b) : " + condition3);
        }
    }


