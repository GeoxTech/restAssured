package Provider_MS.providerMedicalStaff;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static pojo.Constant.Constant.Get_ProviderMedicalStaff_Endpoint;
import static utility.RestCalls.GET_200;

public class getProviderMedicalStaff extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get provider medical staff by ID")
    @Story("Ensure that the request is able to fetch provider medical staff details by ID")
    public void Get_ProviderMedicalStaff_ByID_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_ProviderMedicalStaff_Endpoint = "/provider-medical-staffs/1");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
        response.then().assertThat().body("name", is("Oniosun Ayodele"));
        response.then().assertThat().body("id", is(1));
        response.then().assertThat().body("licenceDocument", is("default.pdf"));

    }
}
