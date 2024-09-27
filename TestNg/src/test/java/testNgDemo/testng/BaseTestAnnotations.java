package testNgDemo.testng;

import org.testng.annotations.*;

public class BaseTestAnnotations {

    @BeforeClass
    public void setUp(){
        System.out.println("Before");
    }

    @AfterClass
    public void clean(){
        System.out.println("After");
    }

}
