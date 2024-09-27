package com.automation.demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RestDemo {
    public static void main(String[] args) throws FileNotFoundException {

        //GET
//        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
//                .log().all()
//                .when().get("/booking")
//                .then().log().all().assertThat().statusCode(200);

//        RequestSpecification req = RestAssured.given();

        //POST
        String body = getDataFromFile("src/test/resources/json/create_booking.json");

        Response response =  RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                                .body(body)
                                .contentType("application/json")
                                .log().all().when().post("/booking")
                                .then().log().all().assertThat().statusCode(200)
                                .extract().response();


        // Print the response
        System.out.println("Response: " + response.asString());

    }





    public static  String getDataFromFile(String filePath) throws FileNotFoundException {
        String content = new Scanner(new FileInputStream(filePath)).useDelimiter("\\Z").next();
        return content;
    }

}
