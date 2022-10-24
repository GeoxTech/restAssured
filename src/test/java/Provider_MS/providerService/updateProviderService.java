package Provider_MS.providerService;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static pojo.Constant.Constant.Get_ProviderService_Endpoint;
import static pojo.PayloadManager.UpdateProviderService_Payload;
import static utility.RestCalls.PUT_200;

public class updateProviderService extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Ensure that the provider service endpoint can be updated")
    @Story("An Endpoint to Update provider service")
    public void Update_Tier() throws InterruptedException, IOException {
        Response response = PUT_200(Get_ProviderService_Endpoint, UpdateProviderService_Payload());
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().body("id", is(33));
        response.then().assertThat().body("legacyReference", is(501));
    }
}
