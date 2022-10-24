package Provider_MS.tiers;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static pojo.Constant.Constant.Get_Tiers_Endpoint;
import static pojo.PayloadManager.UpdateTier_Payload;
import static utility.RestCalls.PUT_200;

public class updateTier extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Ensure that the tier endpoint can be updated")
    @Story("An Endpoint to Update tier")
    public void Update_Tier() throws InterruptedException, IOException {
        Response response = PUT_200(Get_Tiers_Endpoint, UpdateTier_Payload());
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().body("id", is(8));
        response.then().assertThat().body("name", is("Dental Clinic"));
        response.then().assertThat().body("code", is("251385595"));
    }
}
