package Provider_MS.bankType;

import Base.TestFlight;
import Response.providers_Response_Pojo.create_BankType_Response_Pojo;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertNotNull;
import static pojo.Constant.Constant.Get_All_Bank_Type;
import static pojo.PayloadManager.create_Bank_Type_Payload;
import static utility.RestCalls.POST_201;

public class createBankType extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An endpoint to create banks types")
    @Story("Ability to create a new bank type")
    public void create_Bank_Type_valid() throws InterruptedException, IOException {
        Response response = POST_201(Get_All_Bank_Type, create_Bank_Type_Payload());

        create_BankType_Response_Pojo Response_pojo = response.prettyPeek().then().spec(responseSpec_201)
                .extract()
                .as(create_BankType_Response_Pojo.class);

        assertNotNull(Response_pojo.getName());
        assertNotNull(Response_pojo.getCreatedDate());
        assertNotNull(Response_pojo.getLastModifiedDate());
    }

}