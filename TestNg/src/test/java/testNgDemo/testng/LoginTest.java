package testNgDemo.testng;


import org.testng.annotations.Test;


public class LoginTest extends BaseTestAnnotations{

    @Test(groups={"smoke"})
    public void test1(){
        System.out.println("Test1");
    }

    @Test(groups = {"smoke"})
    public void test2(){
        System.out.println("Test2");
    }

    @Test
    public void test3(){
        System.out.println("Test3");
    }

    @Test
    public void test4(){
        System.out.println("Test4");
    }

    @Test
    public void test5(){
        System.out.println("Test5");
    }

}
