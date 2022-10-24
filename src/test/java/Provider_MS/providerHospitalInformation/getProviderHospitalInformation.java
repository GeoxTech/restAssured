package Provider_MS.providerHospitalInformation;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static pojo.Constant.Constant.Get_ProviderHospitalInformation_Endpoint;
import static utility.RestCalls.GET_200;

public class getProviderHospitalInformation extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get provider hospital information by ID")
    @Story("Ensure that the request is able to fetch provider hospital information details by ID")
    public void Get_ProviderHospitalInformation_ByID_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_ProviderHospitalInformation_Endpoint = "/provider-hospital-informations/3");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
        response.then().assertThat().body("numberOfBranches", is(2));
        response.then().assertThat().body("numberOfFullTimeDoctors", is(3));
        response.then().assertThat().body("numberOfBeds", is(9));
        response.then().assertThat().body("numberOfNurses", is(6));
        response.then().assertThat().body("numberOfAmbulances", is(1));

    }
}
