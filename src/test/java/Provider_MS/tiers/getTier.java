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
import static utility.RestCalls.GET_200;

public class getTier extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get tiers by ID")
    @Story("Ensure that the request is able to fetch tiers details by ID")
    public void Get_tiers_ByID_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_Tiers_Endpoint = "/tiers/4");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
        response.then().assertThat().body("id", is(4));
        response.then().assertThat().body("legacyReference", is(4));
        response.then().assertThat().body("name", is("Tier 4"));
        response.then().assertThat().body("code", is("41"));

    }
}
