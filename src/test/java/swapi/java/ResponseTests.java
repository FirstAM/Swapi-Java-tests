package swapi.java;

import io.restassured.specification.RequestSpecification;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class ResponseTests {


    @Test
    public void
    responseStatusTest() {
        when().
                get("https://swapi.co/api/planets/1").
                then().
                statusCode(200);
    }

    @Test
    public void
    wrongStatusTest() {
        given().
                when().
                get("https://swapi.co/api/asd/").
                then().
                statusCode(404);
    }

}
