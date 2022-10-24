package Enrollee_MS;

import Base.TestBase;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.testng.Assert.assertEquals;
import static pojo.Constant.Constant.Get_All_Favorite_Pharmacy_Endpoint;
import static utility.RestCalls.GET_200;

public class Favorite_Phamacy extends TestBase {

    @Test(priority = 1)
    @Severity(SeverityLevel.CRITICAL)
    @Description("An Endpoint to Get all enrollee favourite pharmacies")
    @Story("Ensure that a user is able to get all favorite pharmacy")
    public void Get_All_favorite_pharmacy() throws InterruptedException, IOException {
        Response response = GET_200(Get_All_Favorite_Pharmacy_Endpoint);
        response.prettyPeek().then().spec(responseSpec_200);

        response.then().assertThat().statusCode((200));
        response.then().assertThat().body("name", is("HobNobs Health Center"));
        response.then().assertThat().body("pharmacyCode", is("PR/2"));
        response.then().assertThat().body("enrolleeId", is(15));
        assertEquals(response.jsonPath().getInt("id"), 60);

    }
}





