package Provider_MS.providerService;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Get_ProviderService_Endpoint;
import static utility.RestCalls.GET_200;

public class getAllProviderServices extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get provider service")
    @Story("Ensure that the request is able to fetch provider service details")
    public void Get_ProductService_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_ProviderService_Endpoint = "/provider-services");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));

    }
}
