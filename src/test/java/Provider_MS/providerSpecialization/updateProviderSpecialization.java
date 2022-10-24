package Provider_MS.providerSpecialization;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Get_ProviderSpecialization_Endpoint;
import static pojo.PayloadManager.UpdateProviderSpecialization_Payload;
import static utility.RestCalls.PUT_200;

public class updateProviderSpecialization extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Ensure that the provider specialization endpoint can be updated")
    @Story("An Endpoint to Update provider specialization ")
    public void Update_ProviderSpecialization() throws InterruptedException, IOException {
        Response response = PUT_200(Get_ProviderSpecialization_Endpoint, UpdateProviderSpecialization_Payload());
        response.prettyPeek().then().spec(responseSpec_200);
    }
}
