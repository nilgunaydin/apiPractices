package tests;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;


public class Test01  {
@Test
    public void test01(){

    String url = "https://restful-booker.herokuapp.com/booking";
    Response rs = given().when().get(url);
    rs.prettyPrint();
    System.out.println("rs.statusCode() = " + rs.statusCode());
    System.out.println("rs.statusLine() = " + rs.statusLine());
    System.out.println("rs.contentType() = " + rs.contentType());
    System.out.println("rs.time() = " + rs.time());

    assertEquals(rs.statusCode(),200);

    assertEquals("","");
}
}
