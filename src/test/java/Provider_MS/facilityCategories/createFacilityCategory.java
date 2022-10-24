package Provider_MS.facilityCategories;

import Base.TestFlight;
import Response.providers_Response_Pojo.create_FacilityCategory_Response_Pojo;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertNotNull;
import static pojo.Constant.Constant.Get_All_Facility_ByCategory;
import static pojo.PayloadManager.create_FacilityCategory_Payload;
import static utility.RestCalls.POST_201;

public class createFacilityCategory extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An endpoint to create Facility")
    @Story("Ability to create a new facility")
    public void createFacility_valid() throws InterruptedException, IOException {
        Response response = POST_201(Get_All_Facility_ByCategory, create_FacilityCategory_Payload());

        create_FacilityCategory_Response_Pojo Response_pojo = response.prettyPeek().then().spec(responseSpec_201)
                .extract()
                .as(create_FacilityCategory_Response_Pojo.class);

        response.then().assertThat().statusCode((201));
        assertNotNull(Response_pojo.getName());
        assertNotNull(Response_pojo.getCreatedDate());
        assertNotNull(Response_pojo.getLastModifiedDate());

    }
}
