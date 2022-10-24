package Provider_MS.providerAdmin;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static pojo.Constant.Constant.Get_ProviderAdmin_Endpoint;
import static pojo.PayloadManager.UpdateProviderAdmin_Payload;
import static utility.RestCalls.PUT_200;

public class updateProviderAdmin extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Ensure that the provider admin endpoint can be updated")
    @Story("An Endpoint to Update provider admin")
    public void UpdateProviderAdmin_Tier() throws InterruptedException, IOException {
        Response response = PUT_200(Get_ProviderAdmin_Endpoint, UpdateProviderAdmin_Payload());
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().body("id", is(192));
        response.then().assertThat().body("providerId", is(374));
        response.then().assertThat().body("firstName", is("Yaya Bello"));
        response.then().assertThat().body("lastName", is("Lolade"));
    }
}

