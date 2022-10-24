package Provider_MS.bankAccounts;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Get_All_Bank_Account;
import static utility.RestCalls.GET_200;

public class getAllBankAccounts extends TestFlight {
    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get all bank account")
    @Story("Ensure that the request is able to fetch all bank account.")
    public void Get_All_BankAccount_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_All_Bank_Account = "/bank-accounts");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
    }

    /*@Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get all bank account")
    @Story("Ensure that the request is able to fetch all bank account.")
    public void Get_All_BankAccount_invalid() throws InterruptedException, IOException {
        Response response = GET_401(Get_All_Bank_Account);
        response.prettyPeek().then().spec(responseSpec_403);

    }*/
}
