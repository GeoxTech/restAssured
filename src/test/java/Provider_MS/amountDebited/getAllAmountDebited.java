package Provider_MS.amountDebited;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Get_All_Amount_Debited;
import static utility.RestCalls.GET_200;


public class getAllAmountDebited extends TestFlight {
    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get all amount debited")
    @Story("Ensure that the request is able to fetch all amount debited.")
    public void Get_All_Amount_Debited() throws InterruptedException, IOException {
        Response response = GET_200(Get_All_Amount_Debited = "/amount-debiteds");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
    }

    /*@Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get all amount debited")
    @Story("Ensure that the request is able to fetch all amount debited.")
    public void getAddressState_invalid() throws InterruptedException, IOException {
        Response response = GET_401(Get_All_Amount_Debited);
        response.prettyPeek().then().spec(responseSpec_403);

    }*/
}
