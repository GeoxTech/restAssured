package Provider_MS.types;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Get_Types_Endpoint;
import static pojo.PayloadManager.UpdateType_Payload;
import static utility.RestCalls.PUT_200;

public class updateType extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("Ensure that the types endpoint can be updated")
    @Story("An Endpoint to Update types")
    public void Update_Type() throws InterruptedException, IOException {
        Response response = PUT_200(Get_Types_Endpoint, UpdateType_Payload());
        response.prettyPeek().then().spec(responseSpec_200);
    }
}

