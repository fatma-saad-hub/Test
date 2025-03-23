package testNG;

import org.testng.annotations.Test;

public class TestNGDependnciesDemo {
    @Test(dependsOnGroups = {"sanity1"} )
    public void test1(){
        System.out.println("Inside test 1");
    }

    @Test(groups={"sanity1"})
    public void test2(){
        System.out.println("Inside test 2");
    }

    @Test(groups={"sanity2"})
    public void test3(){
        System.out.println("Inside test 3");
    }
}
