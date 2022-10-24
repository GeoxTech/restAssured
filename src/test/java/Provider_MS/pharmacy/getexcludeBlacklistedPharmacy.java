package Provider_MS.pharmacy;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Exclude_Blacklisted_Pharmacy;
import static utility.RestCalls.GET_200;

public class getexcludeBlacklistedPharmacy extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to exclude blacklisted pharmacies")
    @Story("Ensure that blacklisted pharmacy are excluded")
    public void Execlude_Blacklisted_Pharmacy() throws InterruptedException, IOException {
        Response response = GET_200(Exclude_Blacklisted_Pharmacy = "/exclude-black-listed-pharmacies");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
    }

    /*@Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to exclude blacklisted pharmacies")
    @Story("Ensure that a user can")
    public void Execlude_Blacklisted_Pharmacy_invalid() throws InterruptedException, IOException {
        Response response = GET_401(Exclude_Blacklisted_Pharmacy);
        response.prettyPeek().then().spec(responseSpec_403);
    }*/

}
