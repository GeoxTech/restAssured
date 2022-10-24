package Provider_MS.operatingHours;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static pojo.Constant.Constant.Get_All_Opening_Hour;
import static utility.RestCalls.GET_200;

public class getOperatingHour extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get hospital opening hours by ID")
    @Story("Ensure that the request is able to fetch hospital opening hours by ID")
    public void Get_Opening_Hour_ByID_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_All_Opening_Hour = "/operating-hours/6");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
        response.then().assertThat().body("providerId", is(356));
        response.then().assertThat().body("legacyReference", is(6));
        response.then().assertThat().body("day", is("saturday"));

    }

    /* @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get hospital opening hours by ID")
    @Story("Ensure that the request is able to fetch hospital opening hours by ID with invalid call.")
    public void Get_Opening_Hour_ByID_invalid() throws InterruptedException, IOException {
        Response response = GET_401(Get_All_Medical_Qualification);
        response.prettyPeek().then().spec(responseSpec_403);

    }*/
}
