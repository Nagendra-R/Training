package testNgDemo.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEX {

    @Test
    public void softAssert(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(10,10);
        softAssert.assertEquals(10,11);
        softAssert.assertTrue(10>=11);
        softAssert.assertAll();




    }



}
