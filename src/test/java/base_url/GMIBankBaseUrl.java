package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

public class GMIBankBaseUrl {

    protected RequestSpecification specGMI;
    @BeforeClass
    public void setUp(){
specGMI = new RequestSpecBuilder().setBaseUri("http://www.gmibank.com/api").build();

    }
}
