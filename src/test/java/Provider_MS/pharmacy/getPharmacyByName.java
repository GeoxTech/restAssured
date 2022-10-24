package Provider_MS.pharmacy;

import Base.TestFlight;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static pojo.Constant.Constant.Get_Pharmacy_ByName;
import static utility.RestCalls.GET_200;

public class getPharmacyByName extends TestFlight {
    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to fetch pharmacy by name ")
    @Story("Ensure that the request is able to query pharmacy by Name get Allive pharmacy")
    public void getPharmacyByname() throws InterruptedException, IOException {
        Response response = GET_200(Get_Pharmacy_ByName = "/pharmacy-providers/all?query=Allive pharmacy");
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
    }

    /*@Test(priority = 2)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to fetch pharmacy by name")
    @Story("Ensure that a user is not able to fetch method with wrong ")
    public void Get_pharmacy_ByName_invalid() throws InterruptedException, IOException {
        Response response = GET_401(Get_Pharmacy_ByName);
        response.prettyPeek().then().spec(responseSpec_403);

    }*/

}
