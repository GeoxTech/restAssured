package Provider_MS.pharmacy;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Fetch_Pharmacy_List;
import static utility.RestCalls.GET_200;

public class getPharmacyList extends TestFlight {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to fetch wella health's pharmacy list")
    @Story("Ensure that the request is able to fetch all Wellahealth's pharmacies.")
    public void Get_All_pharmacy_list() throws InterruptedException, IOException {
        Response response = GET_200(Fetch_Pharmacy_List = "/wella-health-pharmacy");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
    }

    /*@Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to fetch wella health's pharmacy list")
    @Story("Ensure that a user is able to get all SMS Template")
    public void Get_All_pharmacy_invalid() throws InterruptedException, IOException {
        Response response = GET_401(Fetch_Pharmacy_List);
        response.prettyPeek().then().spec(responseSpec_403);
    }*/
}
