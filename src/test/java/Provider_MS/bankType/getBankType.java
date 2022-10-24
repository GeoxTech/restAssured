package Provider_MS.bankType;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Get_Bank_Type;
import static utility.RestCalls.GET_200;

public class getBankType extends TestFlight {
    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get enrollee bank type by ID")
    @Story("Ensure that the request is able to fetch enrollee bank type by ID.")
    public void Get_BankType_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_Bank_Type = "/bank-types/7");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
    }

    /*@Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get enrollee bank type by ID")
    @Story("Ensure that the request is able to fetch enrollee bank type by ID")
    public void Get_BankType_invalid() throws InterruptedException, IOException {
        Response response = GET_401(Get_Bank_Type);
        response.prettyPeek().then().spec(responseSpec_403);

    }*/
}
