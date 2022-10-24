package Provider_MS.amountDeposited;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Get_All_Amount_Deposited;
import static utility.RestCalls.GET_200;

public class getAllAmountDepositeds extends TestFlight {
    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get all amount deposited by an Provider")
    @Story("Ensure that the request is able to fetch amount deposited by all Provider.")
    public void Get_Amount_deposited_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_All_Amount_Deposited = "/amount-depositeds");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
    }

    /*@Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get all amount deposited by an Provider")
    @Story("Ensure that a user is not able to fetch method with wrong amount deposited by all Provider")
    public void getAddressState_invalid() throws InterruptedException, IOException {
        Response response = GET_401(Get_All_Amount_Deposited);
        response.prettyPeek().then().spec(responseSpec_403);

    }*/
}
