package Provider_MS.providerSpecialization;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static pojo.Constant.Constant.Get_ProviderSpecialization_Endpoint;
import static utility.RestCalls.GET_200;

public class getProviderSpecialization extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get all provider specialization by ID")
    @Story("Ensure that the request is able to fetch all provider specialization details by ID")
    public void Get_ProductSpecialization_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_ProviderSpecialization_Endpoint = "/provider-specializations/1");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
        response.then().assertThat().body("name", is("Surgeon"));
        response.then().assertThat().body("id", is(1));
        response.then().assertThat().body("alternativeName", is("Surgery"));
        response.then().assertThat().body("careType", is("operation"));
        response.then().assertThat().body("legacyReference", is(1));

    }
}
