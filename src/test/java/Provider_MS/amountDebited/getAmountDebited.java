package Provider_MS.amountDebited;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Get_Amount_Debited;
import static utility.RestCalls.GET_200;

public class getAmountDebited extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get amount debited by ID")
    @Story("Ensure that the request is able to fetch amount debited by id.")
    public void Get_Amount_Debited() throws InterruptedException, IOException {
        Response response = GET_200(Get_Amount_Debited = "/amount-debiteds/5");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));

    }
}
