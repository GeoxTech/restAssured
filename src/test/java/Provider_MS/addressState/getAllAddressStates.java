package Provider_MS.addressState;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Get_ALL_Address_State;
import static utility.RestCalls.GET_200;

public class getAllAddressStates extends TestFlight {
    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to fetch all address state")
    @Story("Ensure that the request is able to fetch a single address state ")
    public void getAllAddressState_valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_ALL_Address_State = "/address-states");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
    }



    /*@Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to fetch all address state")
    @Story("Ensure that a user is not able to fetch method with wrong ")
    public void getAllAddressState_invalid() throws InterruptedException, IOException {
        Response response = GET_500(Get_ALL_Address_State = "/address-statess");
        response.prettyPeek().then().spec(responseSpec_500);

    }*/
}
