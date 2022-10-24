package Provider_MS.facilties;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Get_All_Facility_ByCategory;
import static utility.RestCalls.GET_200;

public class getFacility extends TestFlight {
    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get a single facility by ID")
    @Story("Ensure that the request is able to facility details.")
    public void Get_Facility_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_All_Facility_ByCategory = "/facilities/3");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
    }

    /*@Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get a single facility by ID")
    @Story("Ensure that the request is able to facility details.")
    public void Get_Facility_invalid() throws InterruptedException, IOException {
        Response response = GET_401(Get_Facility);
        response.prettyPeek().then().spec(responseSpec_403);

    }*/
}
