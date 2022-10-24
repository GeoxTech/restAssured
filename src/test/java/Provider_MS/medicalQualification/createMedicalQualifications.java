package Provider_MS.medicalQualification;

import Base.TestFlight;
import Response.providers_Response_Pojo.create_MedicalQualification_Response_Pojo;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertNotNull;
import static pojo.Constant.Constant.Get_All_Medical_Qualification;
import static pojo.PayloadManager.create_MedicalQualification_Payload;
import static utility.RestCalls.POST_201;

public class createMedicalQualifications extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An endpoint to create Medical Qualification")
    @Story("Ability to create a new Medical Qualification")
    public void createMedicalQualification_valid() throws InterruptedException, IOException {
        Response response = POST_201(Get_All_Medical_Qualification, create_MedicalQualification_Payload());

        create_MedicalQualification_Response_Pojo Response_pojo = response.prettyPeek().then().spec(responseSpec_201)
                .extract()
                .as(create_MedicalQualification_Response_Pojo.class);

        response.then().assertThat().statusCode((201));
        assertNotNull(Response_pojo.getName());
        assertNotNull(Response_pojo.getId());
        assertNotNull(Response_pojo.getCreatedDate());
        assertNotNull(Response_pojo.getLastModifiedDate());

    }
}
