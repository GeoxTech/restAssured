package Provider_MS.providerAdmin;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Get_ProviderAdmin_Endpoint;
import static utility.RestCalls.GET_200;

public class getAllProviderAdmins extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get all provider admin")
    @Story("Ensure that the request is able to fetch all provider admin details")
    public void Get_AllProviderAdmin_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_ProviderAdmin_Endpoint = "/provider-admins");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));


    }
}
