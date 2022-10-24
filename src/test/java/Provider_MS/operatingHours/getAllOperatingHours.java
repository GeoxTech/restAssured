package Provider_MS.operatingHours;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Get_All_Opening_Hour;
import static utility.RestCalls.GET_200;

public class getAllOperatingHours extends TestFlight {
    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get all hospital opening hours and details")
    @Story("Ensure that the request is able to fetch all hospital opening hours.")
    public void Get_All_Opening_Hour_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_All_Opening_Hour = "/operating-hours");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
    }

    /* @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get all hospital opening hours and details")
    @Story("Ensure that the request is able to fetch all hospital opening hours with invalid call.")
    public void Get_All_Opening_Hour_invalid() throws InterruptedException, IOException {
        Response response = GET_401(Get_All_Opening_Hour);
        response.prettyPeek().then().spec(responseSpec_403);

    }*/
}
