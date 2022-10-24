package Provider_MS.locations;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static pojo.Constant.Constant.Get_All_Locations;
import static utility.RestCalls.GET_200;

public class getLocation extends TestFlight {
    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get location using ID")
    @Story("Ensure that the request is able to fetch a single location by ID.")
    public void Get_Location_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_All_Locations = "/locations/9");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
        response.then().assertThat().body("name", is("Ibeju-LekkiÂ "));
    }

    /* @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get location using ID")
    @Story("Ensure that the request is able to fetch a single location by ID invalid call.")
    public void Get_Location_invalid() throws InterruptedException, IOException {
        Response response = GET_401(Get_Location);
        response.prettyPeek().then().spec(responseSpec_403);

    }*/
}
