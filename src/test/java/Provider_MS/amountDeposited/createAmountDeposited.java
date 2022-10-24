package Provider_MS.amountDeposited;

import Base.TestFlight;
import Response.providers_Response_Pojo.create_AmountDebited_Response_Pojo;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertNotNull;
import static pojo.Constant.Constant.Get_All_Amount_Deposited;
import static pojo.PayloadManager.create_Amount_Debited_Payload;
import static utility.RestCalls.POST_201;

public class createAmountDeposited extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An endpoint to get Amount deposited")
    @Story("Ability to create amount deposited")
    public void createAmountDeposited_valid() throws InterruptedException, IOException {
        Response response = POST_201(Get_All_Amount_Deposited, create_Amount_Debited_Payload());

        create_AmountDebited_Response_Pojo Response_pojo = response.prettyPeek().then().spec(responseSpec_201)
                .extract()
                .as(create_AmountDebited_Response_Pojo.class);

        response.then().assertThat().statusCode((201));
        assertNotNull(Response_pojo.getCreatedDate());
        assertNotNull(Response_pojo.getLastModifiedDate());
        assertNotNull(Response_pojo.getProviderId());
        assertNotNull(Response_pojo.getAmount());
    }
}
