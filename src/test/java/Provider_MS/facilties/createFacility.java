package Provider_MS.facilties;

import Base.TestFlight;
import Response.providers_Response_Pojo.create_Facility_Response_Pojo;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertNotNull;
import static pojo.Constant.Constant.Create_Facility;
import static pojo.PayloadManager.create_Facility_Payload;
import static utility.RestCalls.POST_201;

public class createFacility extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An endpoint to create Facility")
    @Story("Ability to create a new facility")
    public void createFacility_valid() throws InterruptedException, IOException {
        Response response = POST_201(Create_Facility, create_Facility_Payload());

        create_Facility_Response_Pojo Response_pojo = response.prettyPeek().then().spec(responseSpec_201)
                .extract()
                .as(create_Facility_Response_Pojo.class);

        response.then().assertThat().statusCode((201));
        assertNotNull(Response_pojo.getName());
        assertNotNull(Response_pojo.getCreatedDate());
        assertNotNull(Response_pojo.getLastModifiedDate());

    }
}
