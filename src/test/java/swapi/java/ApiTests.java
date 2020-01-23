package swapi.java;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;


public class ApiTests {

    private static RequestSpecification spec;

    @Test
    public void
    bodyContentTest() {
                when().
                get("https://swapi.co/api/planets/").
                then().
                statusCode(200).
                body("name", equalTo("Tatooine"),
                        "rotation_period", equalTo("23"),
                        "residents", hasItems("https://swapi.co/api/people/1/", "https://swapi.co/api/people/2/"));
    }



}
