package testNgDemo.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest extends BaseTestAnnotations{

    @Parameters("browser")
    @Test
    public void test1(String browser){
        System.out.println(browser);
    }

    @Test
    public void test2(){
        System.out.println("Test2");
    }

    @Test
    public void test3(){
        System.out.println("Test3");
    }

}
