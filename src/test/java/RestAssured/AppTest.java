package RestAssured;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
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
