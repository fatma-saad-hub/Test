import org.testng.annotations.Test;

public class Testpriorit {
        //Les tests avec des valeurs de priorité plus basses (plus proches de zéro) seront exécutés
        // avant ceux avec des valeurs de priorité plus élevées.
        @Test(priority = 1)
        public void test1() {
            System.out.println("first_test");
        }
        @Test(priority = 3)
        public void test2() {
            System.out.println("second_test");
        }
        @Test(priority = 0)
        public void test3() {
            System.out.println("third_test");
        }
        @Test
        public void test4() {
            System.out.println("last_test");
        }

        //Cette annotation permet de définir l'ordre d'exécution des tests en indiquant
        // que le test annoté dépend de l'exécution réussie d'un ou plusieurs autres tests.
        // Par exemple, si un test 5 dépend du test 3, TestNG exécutera d'abord 3 avant de lancer 5.
        @Test(dependsOnMethods = {"test2"}, priority = 2)
        public void test5() {
            System.out.println("testB dépend de testA");
        }
    }
