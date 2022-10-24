package Provider_MS.providerToProviderSpecilization;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static pojo.Constant.Constant.Get_ProviderToProviderSpecialization_Endpoint;
import static utility.RestCalls.GET_200;

public class getProviderToProviderSpecialization extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get provider to provider specialization by ID")
    @Story("Ensure that the request is able to fetch provider to provider specialization details by ID")
    public void Get_ProductSpecialization_By_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_ProviderToProviderSpecialization_Endpoint = "/provider-to-provider-specilizations/3");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
        response.then().assertThat().body("number", is(2));
        response.then().assertThat().body("id", is(3));
        response.then().assertThat().body("specializationName", is("Surgeon"));
        response.then().assertThat().body("providerId", is(675));
        response.then().assertThat().body("specializationId", is(1));

    }
}
