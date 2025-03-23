import org.testng.annotations.Test;

@Test
public class FirstCase {

    public void setUp(){
        System.out.println("opninng browser");
    }


   public void login(){
        System.out.println("login test");
    }

   public void close(){
        System.out.println("close browser");
    }
}
