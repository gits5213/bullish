package com.bullish.apiTest.test;

import com.bullish.apiTest.data.Data;
import io.restassured.RestAssured;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;
import java.util.Map;

public class BaseTest {

    @BeforeClass
    public void beforeClass(){
        RestAssured.baseURI = Data.SERVICE_END_POINT;
        RestAssured.basePath = Data.RESOURCE_END_POINT;
    }

    @BeforeMethod
    public void beforeMethod(){

    }

    @AfterMethod
    public void afterTest(){
        System.out.println("Method is passing");
    }

    @AfterClass
    public void afterClass(){

    }
}