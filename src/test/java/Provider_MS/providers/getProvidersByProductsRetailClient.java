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

public class getProvidersByProductsRetailClient extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get provider by product retail clients")
    @Story("Ensure that the request is able to fetch provider details by product retail clients")
    public void Get_Provider_ByRetailClients_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_Providers_Endpoint = "/providers/retail");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));

    }
}
