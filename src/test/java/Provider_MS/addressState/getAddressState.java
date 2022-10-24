package Provider_MS.addressState;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Get_Address_State;
import static utility.RestCalls.GET_200;

public class getAddressState extends TestFlight {
    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to fetch specific address state")
    @Story("Ensure that the request is able to fetch a single address state ")
    public void getAddressState_valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_Address_State = "/address-states/15");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
    }

    /*@Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to fetch specific address state")
    @Story("Ensure that a user is not able to fetch method with wrong ")
    public void getAddressState_invalid() throws InterruptedException, IOException {
        Response response = GET_401(Get_Address_State);
        response.prettyPeek().then().spec(responseSpec_403);

    }*/
}
