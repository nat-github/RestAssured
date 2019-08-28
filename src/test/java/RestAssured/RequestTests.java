package RestAssured;
import io.restassured.RestAssured.*;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class RequestTests {
    @Test
    public void sampleRequest()
    {
        given().get("http://ip.jsontest.com/").then().statusCode(200);
        String response = given().get("http://ip.jsontest.com").then().extract().asString();
        String ip = given().get("http://ip.jsontest.com").then().extract()
                .path("ip");
        System.out.println("Response:"+ response);
        System.out.println("IP value:"+ ip);
    }


}
