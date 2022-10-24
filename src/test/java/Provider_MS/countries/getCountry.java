package Provider_MS.countries;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Get_Countries_Endpoint;
import static utility.RestCalls.GET_200;

public class getCountry extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get Country by ID")
    @Story("Ensure that the request is able to fetch country by ID.")
    public void Get_CountryByID_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_Countries_Endpoint = "/countries/1");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
    }
}
