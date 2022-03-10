package utilities;

import base_url.GMIBankBaseUrl;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Authentication extends GMIBankBaseUrl {

    public static String generateToken(){
        String username = "Batch44Api";
        String password = "Batch44+";
        Map<String,Object> map= new HashMap<>();
map.put("username",username);
map.put("password",password);
        String endPoint = "https://www.gmibank.com/api/authenticate";

        Response response = given().contentType(ContentType.JSON).body(map).when().post(endPoint);

        JsonPath token = response.jsonPath();

        return token.getString("id_token");


    }

}
