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

public class getProviderToProviderSpecializationsByPID extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get provider to provider specialization by Provider ID")
    @Story("Ensure that the request is able to fetch provider to provider specialization details by Provider ID")
    public void Get_ProductSpecialization_ByProviderID_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_ProviderToProviderSpecialization_Endpoint = "/provider-to-provider-specilizations/provider/355");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));

    }
}
