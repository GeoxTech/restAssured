package Provider_MS.providers;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Get_Providers_Endpoint;
import static utility.RestCalls.GET_200;

public class getProviderStatus extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get provider by product status")
    @Story("Ensure that the request is able to fetch provider status details")
    public void Get_Provider_Status_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_Providers_Endpoint = "/providers/status");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));

    }
}
