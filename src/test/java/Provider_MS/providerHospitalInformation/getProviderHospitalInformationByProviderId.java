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

public class getProviderHospitalInformationByProviderId extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to get provider hospital information by Provider ID")
    @Story("Ensure that the request is able to fetch provider hospital information details by Provider ID")
    public void Get_ProviderHospitalInformation_ByProviderId_Valid() throws InterruptedException, IOException {
        Response response = GET_200(Get_ProviderHospitalInformation_Endpoint = "/provider-hospital-informations/provider/364");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
        response.then().assertThat().body("numberOfBranches", is(1));
        response.then().assertThat().body("numberOfFullTimeDoctors", is(2));
        response.then().assertThat().body("numberOfBeds", is(1));
        response.then().assertThat().body("numberOfNurses", is(1));
        response.then().assertThat().body("numberOfAmbulances", is(1));

    }
}
