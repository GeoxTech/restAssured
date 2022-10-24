package Provider_MS.providerAdmin;

import Base.TestFlight;
import Response.providers_Response_Pojo.create_ProviderAdmin_Response_Pojo;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertNotNull;
import static pojo.Constant.Constant.Get_ProviderAdmin_Endpoint;
import static pojo.PayloadManager.createProviderAdmin_Payload;
import static utility.RestCalls.POST_201;

public class createProviderAdmin extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An endpoint to create provider admin")
    @Story("Ability to create a new provider admin")
    public void createProviderAdmin_valid() throws InterruptedException, IOException {
        Response response = POST_201(Get_ProviderAdmin_Endpoint, createProviderAdmin_Payload());

        create_ProviderAdmin_Response_Pojo Response_pojo = response.prettyPeek().then().spec(responseSpec_201)
                .extract()
                .as(create_ProviderAdmin_Response_Pojo.class);

        response.then().assertThat().statusCode((201));
        assertNotNull(Response_pojo.getFirstName());
        assertNotNull(Response_pojo.getLastName());
        assertNotNull(Response_pojo.getPersonReference());
        assertNotNull(Response_pojo.getId());
        assertNotNull(Response_pojo.getPhoneNumber());
        assertNotNull(Response_pojo.getCreatedDate());
        assertNotNull(Response_pojo.getLastModifiedDate());

    }


}
