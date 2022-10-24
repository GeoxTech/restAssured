package Provider_MS.providers;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static pojo.Constant.Constant.Get_Providers_Endpoint;
import static utility.RestCalls.GET_200;

public class getProvider extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get provider by ID")
    @Story("Ensure that the request is able to fetch provider details by ID")
    public void Get_Provider_ByID_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_Providers_Endpoint = "/providers/676");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
        response.then().assertThat().body("name", is("Abdussamad Yisau"));
        response.then().assertThat().body("id", is(676));
        response.then().assertThat().body("status", is("ACTIVE"));
        response.then().assertThat().body("deliveryOption", is("PICKUP"));
        response.then().assertThat().body("address", is("test"));

    }
}
