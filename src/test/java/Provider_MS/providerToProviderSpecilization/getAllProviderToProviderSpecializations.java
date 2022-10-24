package Provider_MS.providerToProviderSpecilization;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Get_ProviderToProviderSpecialization_Endpoint;
import static utility.RestCalls.GET_200;

public class getAllProviderToProviderSpecializations extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get all provider to provider specialization by ID")
    @Story("Ensure that the request is able to fetch all provider to provider specialization details")
    public void Get_All_ProductSpecialization_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_ProviderToProviderSpecialization_Endpoint = "/provider-to-provider-specilizations");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));

    }
}
