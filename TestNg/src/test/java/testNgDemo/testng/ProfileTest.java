package testNgDemo.testng;

import org.testng.annotations.Test;

public class ProfileTest extends BaseTestAnnotations{

    @Test(groups={"smoke"})
    public void test10(){
        System.out.println("Test10");
    }

    @Test
    public void test11(){
        System.out.println("Test11");
    }

    @Test
    public void test12(){
        System.out.println("Test12");
    }

    @Test
    public void test13(){
        System.out.println("Test13");
    }

}
