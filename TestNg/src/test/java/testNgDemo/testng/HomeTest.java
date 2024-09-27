package testNgDemo.testng;


import org.testng.annotations.Test;

public class HomeTest extends BaseTestAnnotations{

    @Test(groups={"smoke"})
    public void test6(){
        System.out.println("Test6");
    }

    @Test
    public void test7(){
        System.out.println("Test7");
    }

    @Test
    public void test8(){
        System.out.println("Test8");
    }

    @Test
    public void test9(){
        System.out.println("Test9");
    }

}

