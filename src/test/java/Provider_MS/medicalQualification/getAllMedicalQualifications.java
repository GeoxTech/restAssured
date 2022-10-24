package Provider_MS.medicalQualification;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Get_All_Medical_Qualification;
import static utility.RestCalls.GET_200;

public class getAllMedicalQualifications extends TestFlight {
    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get all provider medical qualification")
    @Story("Ensure that the request is able to fetch all provider medical qualification.")
    public void Get_All_Medical_Qualification_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_All_Medical_Qualification = "/medical-qualifications");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
    }

    /* @Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get fetch all provider medical qualification")
    @Story("Ensure that the request is able to fetch all provider medical qualification with invalid call.")
    public void Get_All_Medical_Qualification_invalid() throws InterruptedException, IOException {
        Response response = GET_401(Get_All_Medical_Qualification);
        response.prettyPeek().then().spec(responseSpec_403);

    }*/
}
