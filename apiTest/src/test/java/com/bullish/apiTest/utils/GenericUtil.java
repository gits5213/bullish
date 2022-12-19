package com.bullish.apiTest.utils;

import com.bullish.apiTest.data.Data;
import io.restassured.response.Response;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class GenericUtil {

    public static String getFirstName() {
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        return ("Mike-" + generatedString);
    }
    public static String getId() {
        // String generateNum = RandomStringUtils.randomNumeric(6);
        // System.out.println("========"+generateNum);
        return "223445";
    }
    public static String getLastName() {
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        return ("Wong-" + generatedString);
    }
    public static String getNationality() {
        return "Singapore";
    }
    public static String getStudentClass() {
        return "3 A";
    }

}

