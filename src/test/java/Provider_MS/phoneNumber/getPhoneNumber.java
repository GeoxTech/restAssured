package Provider_MS.phoneNumber;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static pojo.Constant.Constant.Get_PhoneNumber_Endpoint;
import static utility.RestCalls.GET_200;

public class getPhoneNumber extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get phone number by ID")
    @Story("Ensure that the request is able to fetch phone number by ID")
    public void Get_PhoneNumber_ByID_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_PhoneNumber_Endpoint = "/phone-numbers/9");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
        response.then().assertThat().body("providerId", is(165));
        response.then().assertThat().body("id", is(9));
        response.then().assertThat().body("legacyReference", is(9));
        response.then().assertThat().body("number", is("2348160009446"));

    }
}
