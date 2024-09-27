package com.automation.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RestAssuredUtils {
    static RequestSpecification requestSpecification = RestAssured.given();
    static Response response;
    static String endPoint;

//    public static void login(String username, String password){
//
//    }


    public static void setEndPoint(String endPoint) {
        RestAssuredUtils.endPoint = endPoint;
    }

    public static void setBody(String fileName) {
        String jsonFolderPath = ConfigReader.getConfigValue("json.folder.path");
        requestSpecification = requestSpecification.body(getDataFromFile(jsonFolderPath+fileName));
    }

    public static void setHeader(String key, String value) {
        requestSpecification = requestSpecification.header(key, value);
    }

    public static Response post() {
        response = requestSpecification.post(endPoint);
        return response;
    }

    public static Response get() {
        response = requestSpecification.get(endPoint);
        response.then().log().all();
        return response;
    }

    public static  String getDataFromFile(String filePath){
        String content = null;
        try {
            content = new Scanner(new FileInputStream(filePath)).useDelimiter("\\Z").next();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return content;
    }


    public static int getStatusCode() {
        return response.getStatusCode();
    }

    public static boolean isEmptyResponse(){
        return response.asString().isEmpty();
    }

    public static Response getResponse() {
        return response;
    }

    public static Response put() {
        Response response = requestSpecification.put(endPoint);
        response.then().log().all();
        return response;
    }

    public static void setBodyUsingPojo(Object obj) {
        requestSpecification = requestSpecification.body(obj);
    }



}
