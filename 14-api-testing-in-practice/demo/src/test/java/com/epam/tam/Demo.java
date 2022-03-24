package com.epam.tam;

import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 *  1. Copy and unpack the `dummy-rest-api-example-master.zip` in your TAM repository
 *  2. Enter into the `dummy-rest-api-example-master` folder
 *  3. Build Image: ```docker build -t dummyrestapi .``` _~5 minutes_
 *  4. Run Image:
 *      * **Git bash/WSL2:** ```docker run -d -p 80:8080 dummyrestapi```
 *      * **Desktop UI**
 * */
public class Demo {
    private static final String EMPLOYEES_ENDPOINT = "http://0.0.0.0:80/api/v1/employees";
    private static final String UPDATE_EMPLOYEE_ENDPOINT = "http://0.0.0.0:80/api/v1/update/2";

    @BeforeAll
    public static void setup() {
        RestAssured.registerParser("text/html", Parser.JSON);
    }

    @Test
    public void getAllUserAndCheckResponseStatusCode() {
        RestAssured.get(EMPLOYEES_ENDPOINT).then().assertThat().statusCode(200);
    }

    @Test
    public void updateUserAndCheckResponseMessageAndStatusCode() {
        Response updatedUserResponse = given()
                .contentType(ContentType.JSON)
                .body(createJson())
                .put(UPDATE_EMPLOYEE_ENDPOINT);
        assertEquals(updatedUserResponse.statusCode(), 200);
        assertEquals(updatedUserResponse.jsonPath().getString("employee_name"), "Teszt Elek");
    }

    private JsonObject createJson() {
        JsonObject user = new JsonObject();
        user.addProperty("employee_name", "Teszt Elek");
        user.addProperty("employee_age", 20);
        user.addProperty("employee_salary", 1100);
        user.addProperty("profile_image", "pic.png");

        return user;
    }
}
