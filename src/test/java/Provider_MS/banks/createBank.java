package Provider_MS.banks;

import Base.TestFlight;
import Response.providers_Response_Pojo.create_Bank_Response_Pojo;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertNotNull;
import static pojo.Constant.Constant.Create_Bank_Endpoint;
import static pojo.PayloadManager.create_Bank_Payload;
import static utility.RestCalls.POST_201;

public class createBank extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An endpoint to create banks")
    @Story("Ability to create a new bank")
    public void createBank_valid() throws InterruptedException, IOException {
        Response response = POST_201(Create_Bank_Endpoint, create_Bank_Payload());

        create_Bank_Response_Pojo Response_pojo = response.prettyPeek().then().spec(responseSpec_201)
                .extract()
                .as(create_Bank_Response_Pojo.class);

        response.then().assertThat().statusCode((201));
        assertNotNull(Response_pojo.getCreatedDate());
        assertNotNull(Response_pojo.getLastModifiedDate());
    }
}