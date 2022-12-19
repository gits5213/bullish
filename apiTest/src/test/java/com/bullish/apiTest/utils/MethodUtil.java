package com.bullish.apiTest.utils;

import com.bullish.apiTest.data.Data;
import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class MethodUtil {

    public static Response postRes(HashMap<String, String> map, String body, int num) {
        Response response = given().log().all()
                .contentType("application/json")
                .body(map)
                .when()
                .post(body);
        response.then().log().all()
                .assertThat()
                .statusCode(num);
        return response;
    }

    public static Response putRes(HashMap<String, String> map, String body, int num) {
        Response response = given().log().all()
                .contentType("application/json")
                .body(map)
                .when()
                .put(body);
        response.then().log().all()
                .assertThat()
                .statusCode(num);
        return response;
    }

    public static Response deleteRes(HashMap<String, String> map, String body, int num) {
        Response response = given().log().all()
                .contentType("application/json")
                .body(map)
                .when()
                .delete(body);
        response.then().log().all()
                .assertThat()
                .statusCode(num);
        return response;
    }

    public static Response fetchRes(String body, int num) {
        Response response = given().log().all()
                .when()
                .get(body);
        response.then().log().all()
                .assertThat()
                .statusCode(num);
        return response;
    }
}
