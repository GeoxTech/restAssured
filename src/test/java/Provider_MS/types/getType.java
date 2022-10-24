package Provider_MS.types;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static pojo.Constant.Constant.Get_Types_Endpoint;
import static utility.RestCalls.GET_200;

public class getType extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get types by ID")
    @Story("Ensure that the request is able to fetch types details by ID")
    public void Get_Types_ByID_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_Types_Endpoint = "/types/3");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
        response.then().assertThat().body("name", is("Dental Clinic"));
        response.then().assertThat().body("service", is("Dental services"));
        response.then().assertThat().body("legacyReference", is(3));
        response.then().assertThat().body("id", is(3));

    }
}
