package baseURL;

import io.restassured.builder.RequestSpecBuilder;
import utilities.Authentication;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class MedunnaBaseURL extends Authentication {
protected RequestSpecification spec;
    @Before
    public void setup(){
            spec = new RequestSpecBuilder().setBaseUri("https://medunna.com/").build();
        }
    }

