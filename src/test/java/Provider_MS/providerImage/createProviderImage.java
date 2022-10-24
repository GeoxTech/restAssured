package Provider_MS.providerImage;

import Base.TestFlight;
import Response.providers_Response_Pojo.create_ProviderImage_Response_Pojo;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertNotNull;
import static pojo.Constant.Constant.Get_ProviderImages_Endpoint;
import static pojo.PayloadManager.createProviderImage_Payload;
import static utility.RestCalls.POST_201;

public class createProviderImage extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An endpoint to create Provider image")
    @Story("Ability to create a new provider image")
    public void createProviderImage_valid() throws InterruptedException, IOException {
        Response response = POST_201(Get_ProviderImages_Endpoint, createProviderImage_Payload());

        create_ProviderImage_Response_Pojo Response_pojo = response.prettyPeek().then().spec(responseSpec_201)
                .extract()
                .as(create_ProviderImage_Response_Pojo.class);

        response.then().assertThat().statusCode((201));
        assertNotNull(Response_pojo.getOriginalName());
        assertNotNull(Response_pojo.getKey());
        assertNotNull(Response_pojo.getId());
        assertNotNull(Response_pojo.getLegacyReference());
        assertNotNull(Response_pojo.getCreatedDate());
        assertNotNull(Response_pojo.getLastModifiedDate());

    }
}
