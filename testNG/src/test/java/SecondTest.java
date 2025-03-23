import org.testng.annotations.Test;

public class SecondTest {
//    @Test(priority=1)
////    void setUp(){
////        System.out.println("opninng browser");
////    }
////
////    @Test(priority=2)
////    void login(){
////        System.out.println("login test");
////    }
////    @Test(priority=3)
////    void close(){
////        System.out.println("close browser");
////    }

    @Test
    void setUp(){
        System.out.println("opninng browser");
    }

    @Test(priority=1)
    void login(){
        System.out.println("login test");
    }
    @Test(priority=1)
    void close(){
        System.out.println("close browser");
    }
}

